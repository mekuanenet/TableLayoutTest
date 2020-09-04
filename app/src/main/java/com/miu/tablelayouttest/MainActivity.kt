package com.miu.tablelayouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.EditText
import android.widget.TableRow
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_add.setOnClickListener {
            var version = text_version?.text?.toString();
            var code = text_code?.text?.toString();

            if(!version.isNullOrEmpty() || !code.isNullOrEmpty())
            {
                // Create a new table row.
                val tableRow = TableRow(getApplicationContext())
                // Set new table row layout parameters.
                val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
                tableRow.setLayoutParams(layoutParams)
                // add values into row by calling addView()
                val versionTextView = EditText(getApplicationContext());
                versionTextView.setText(version)

                val codeTextView = EditText(getApplicationContext());
                codeTextView.setText(code)

                tableRow.addView(versionTextView,0)
                tableRow.addView(codeTextView,1)

                // Finally add the created row row into layout
                table_id.addView(tableRow) // id from Layout_file

                text_version.text.clear();
                text_code.text.clear();
            }
        }

    }


}