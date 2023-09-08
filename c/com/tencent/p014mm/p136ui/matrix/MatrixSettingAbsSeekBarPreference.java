package com.tencent.p014mm.p136ui.matrix;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;

/* renamed from: com.tencent.mm.ui.matrix.MatrixSettingAbsSeekBarPreference */
public abstract class MatrixSettingAbsSeekBarPreference extends Preference {

    /* renamed from: J */
    public String f56333J;

    /* renamed from: K */
    public String f56334K;

    /* renamed from: L */
    public int f56335L = mo26274I();

    /* renamed from: M */
    public SeekBar f56336M;

    /* renamed from: N */
    public TextView f56337N;

    /* renamed from: P */
    public TextView f56338P;

    /* renamed from: Q */
    public C19800b f56339Q;

    /* renamed from: com.tencent.mm.ui.matrix.MatrixSettingAbsSeekBarPreference$a */
    public class C19799a implements SeekBar.OnSeekBarChangeListener {
        public C19799a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            MatrixSettingAbsSeekBarPreference.this.mo26275J(i);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            C19800b bVar = MatrixSettingAbsSeekBarPreference.this.f56339Q;
            if (bVar != null) {
                bVar.mo26279a(seekBar.getProgress());
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.matrix.MatrixSettingAbsSeekBarPreference$b */
    public interface C19800b {
        /* renamed from: a */
        void mo26279a(int i);
    }

    public MatrixSettingAbsSeekBarPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: A */
    public void mo26273A(String str) {
        this.f56333J = str;
        TextView textView = this.f56337N;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* renamed from: I */
    public abstract int mo26274I();

    /* renamed from: J */
    public void mo26275J(int i) {
        this.f56335L = i;
        SeekBar seekBar = this.f56336M;
        if (seekBar != null) {
            seekBar.setProgress(i);
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        this.f56337N = (TextView) view.findViewById(C0966R.C0970id.mkd);
        this.f56338P = (TextView) view.findViewById(C0966R.C0970id.m5o);
        SeekBar seekBar = (SeekBar) view.findViewById(C0966R.C0970id.mj7);
        this.f56336M = seekBar;
        int i = this.f56335L;
        if (seekBar != null) {
            seekBar.setProgress(i);
        }
        String str = this.f56333J;
        TextView textView = this.f56337N;
        if (textView != null) {
            textView.setText(str);
        }
        String str2 = this.f56334K;
        TextView textView2 = this.f56337N;
        if (textView2 != null) {
            textView2.setText(str2);
        }
        this.f56336M.setOnSeekBarChangeListener(new C19799a());
    }

    public MatrixSettingAbsSeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MatrixSettingAbsSeekBarPreference(Context context) {
        super(context);
    }
}
