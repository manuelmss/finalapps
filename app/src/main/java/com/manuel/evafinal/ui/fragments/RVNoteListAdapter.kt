package com.manuel.evafinal.ui.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.manuel.evafinal.databinding.ItemNoteBinding
import com.manuel.evafinal.model.Note

class RVNoteListAdapter(var notes: List<Note> , val onNoteClick:(Note)-> Unit): RecyclerView.Adapter<NoteVH>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteVH {
        val binding = ItemNoteBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NoteVH(binding, onNoteClick)
    }

    override fun getItemCount(): Int = notes.size

    override fun onBindViewHolder(holder: NoteVH, position: Int) {
        holder.bind(notes[position])
    }

}

class NoteVH(private val binding: ItemNoteBinding, val onNoteClick:(Note)-> Unit): RecyclerView.ViewHolder(binding.root) {

    fun bind(note: Note) {
        binding.txtNoteTitle.text = note.strAlbum
        binding.txtCreateNote.text = note.intYearReleased
        binding.root.setOnClickListener{
            onNoteClick(note)
        }
    }
}