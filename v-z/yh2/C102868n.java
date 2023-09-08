package yh2;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import ei2.C97648b;
import gy3.C87412m;

/* renamed from: yh2.n */
public class C102868n {

    /* renamed from: a */
    public final C97648b f303655a;

    /* renamed from: b */
    public final String f303656b = "MicroMsg.MixFrameSyncMgr";

    /* renamed from: c */
    public int f303657c;

    /* renamed from: d */
    public int f303658d;

    /* renamed from: e */
    public int f303659e;

    /* renamed from: f */
    public int f303660f;

    /* renamed from: g */
    public Bitmap f303661g;

    /* renamed from: h */
    public float f303662h;

    /* renamed from: i */
    public int f303663i;

    /* renamed from: j */
    public int f303664j;

    /* renamed from: k */
    public int f303665k;

    /* renamed from: l */
    public float f303666l;

    /* renamed from: m */
    public float f303667m;

    /* renamed from: n */
    public float f303668n;

    public C102868n(String str, C97648b bVar) {
        C87412m.m108594g(str, "videoPath");
        C87412m.m108594g(bVar, "emojiFrameRetriever");
        this.f303655a = bVar;
        C94554a c = C94555d.m119567c(str, true);
        if (c != null) {
            int i = c.f273447e;
            this.f303658d = i;
            int i2 = c.f273443a;
            this.f303659e = i2;
            this.f303666l = 1000.0f / ((float) i);
            this.f303657c = (int) (((double) i) * (((double) i2) / 1000.0d));
        } else {
            this.f303657c = 0;
            this.f303658d = 0;
            this.f303666l = 0.0f;
            this.f303659e = 0;
        }
        this.f303665k = this.f303658d;
        this.f303667m = this.f303666l;
        this.f303663i = this.f303657c;
        this.f303664j = 0;
    }
}
