package com.devspace.taskbeats

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.textfield.TextInputEditText

class CreateCategoryBottomSheet : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.create_category_bottom_sheet, container, false)

        val btnCreate = view.findViewById<Button>(R.id.btn_category_create)
        val tieCategoryName = view.findViewById<TextInputEditText>(R.id.tie_category_name)

        return view
    }
}