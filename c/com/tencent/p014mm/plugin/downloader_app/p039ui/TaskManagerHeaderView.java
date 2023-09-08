package com.tencent.p014mm.plugin.downloader_app.p039ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import j51.C9282v;

/* renamed from: com.tencent.mm.plugin.downloader_app.ui.TaskManagerHeaderView */
public class TaskManagerHeaderView extends LinearLayout {
    public TaskManagerHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        ((TextView) LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.az8, this, true).findViewById(C0966R.C0970id.iu8)).setOnClickListener(new C9282v(this));
        View view = new View(getContext());
        view.setBackgroundColor(getResources().getColor(C0966R.color.f3311nd));
        addView(view, -1, 1);
    }
}
