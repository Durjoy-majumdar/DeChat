package com.tencent.p014mm.plugin.mmsight.segment;

import com.tencent.p014mm.plugin.mmsight.segment.RecyclerThumbSeekBar;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.mmsight.segment.f */
public class C105482f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RecyclerThumbSeekBar f313693d;

    public C105482f(RecyclerThumbSeekBar recyclerThumbSeekBar) {
        this.f313693d = recyclerThumbSeekBar;
    }

    public void run() {
        try {
            this.f313693d.f313592p.setCursorPos(-1.0f);
            RecyclerThumbSeekBar recyclerThumbSeekBar = this.f313693d;
            recyclerThumbSeekBar.f313591o = new RecyclerThumbSeekBar.C105465g((RecyclerThumbSeekBar.C105459a) null);
            RecyclerThumbSeekBar recyclerThumbSeekBar2 = this.f313693d;
            int i = 1000;
            int a = RecyclerThumbSeekBar.m141629a(recyclerThumbSeekBar2, (recyclerThumbSeekBar2.f313594r.f267170h * 1000) + 1000);
            RecyclerThumbSeekBar recyclerThumbSeekBar3 = this.f313693d;
            int max = Math.max(recyclerThumbSeekBar3.f313594r.f267171i * 1000, recyclerThumbSeekBar3.f313584e);
            RecyclerThumbSeekBar recyclerThumbSeekBar4 = this.f313693d;
            if (max > 1000) {
                i = max;
            }
            int a2 = RecyclerThumbSeekBar.m141629a(recyclerThumbSeekBar4, i);
            RecyclerThumbSeekBar recyclerThumbSeekBar5 = this.f313693d;
            recyclerThumbSeekBar5.f313593q = (recyclerThumbSeekBar5.getWidth() - a) / 2;
            RecyclerThumbSeekBar recyclerThumbSeekBar6 = this.f313693d;
            SliderSeekBar sliderSeekBar = recyclerThumbSeekBar6.f313592p;
            int i2 = recyclerThumbSeekBar6.f313593q;
            sliderSeekBar.getClass();
            sliderSeekBar.post(new C105485i(sliderSeekBar, a, i2, a2));
            Log.m105925i("RecyclerThumbSeekBar", "RecyclerThumbSeekBar.run(212) width %d", Integer.valueOf(this.f313693d.getWidth()));
            RecyclerThumbSeekBar recyclerThumbSeekBar7 = this.f313693d;
            RecyclerThumbSeekBar.C105465g gVar = recyclerThumbSeekBar7.f313591o;
            int width = recyclerThumbSeekBar7.getWidth();
            RecyclerThumbSeekBar recyclerThumbSeekBar8 = this.f313693d;
            int i3 = recyclerThumbSeekBar8.f313593q;
            gVar.f313612f = (width - i3) - a;
            RecyclerThumbSeekBar.C105465g gVar2 = recyclerThumbSeekBar8.f313591o;
            gVar2.f313611e = i3;
            recyclerThumbSeekBar8.f313590n.setAdapter(gVar2);
            Log.m105919d("RecyclerThumbSeekBar", "init segment thumb fetcher end, adapter.getItemCount() %d", Integer.valueOf(this.f313693d.f313591o.getItemCount()));
            C105475a aVar = this.f313693d.f313588i;
            if (aVar != null) {
                aVar.mo139259a(false);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("RecyclerThumbSeekBar", e, "RecyclerThumbSeekBar notifySuccess error : %s", e.getMessage());
            C105475a aVar2 = this.f313693d.f313588i;
            if (aVar2 != null) {
                aVar2.mo139259a(true);
            }
        }
    }
}
