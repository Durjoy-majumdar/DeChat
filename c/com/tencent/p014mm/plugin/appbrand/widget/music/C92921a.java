package com.tencent.p014mm.plugin.appbrand.widget.music;

import android.widget.SeekBar;
import com.tencent.p014mm.plugin.appbrand.widget.music.MusicSeekBar;
import com.tencent.p014mm.plugin.music.p080ui.MusicMainUI;
import qc0.C101093a;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.music.a */
public class C92921a implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: d */
    public final /* synthetic */ MusicSeekBar f267647d;

    public C92921a(MusicSeekBar musicSeekBar) {
        this.f267647d = musicSeekBar;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        this.f267647d.f267641i = true;
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        MusicSeekBar musicSeekBar = this.f267647d;
        musicSeekBar.f267641i = false;
        MusicSeekBar.C92920b bVar = musicSeekBar.f267645p;
        if (bVar != null) {
            int progress = seekBar.getProgress();
            MusicMainUI.C94235c cVar = (MusicMainUI.C94235c) bVar;
            cVar.getClass();
            C101093a.m132487i(progress);
            MusicMainUI.this.f272240g.setProgress(progress);
            MusicMainUI.this.f272240g.mo127321a(true);
        }
    }
}
