package dy2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import ey2.C58854c;
import ey2.C75665a;
import gc0.C20828a;
import gy3.C87412m;
import kg3.C76577a;
import te3.C101822o23;
import te3.C64719t23;
import vx2.C78493o;

/* renamed from: dy2.a */
public final class C58459a extends C58854c {

    /* renamed from: b */
    public final String f167435b = "TaskBarSectionOtherViewMusicHelper";

    /* renamed from: dy2.a$a */
    public static final class C58460a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f167436d;

        /* renamed from: e */
        public final /* synthetic */ C58459a f167437e;

        /* renamed from: f */
        public final /* synthetic */ C75665a.C58851b f167438f;

        /* renamed from: g */
        public final /* synthetic */ C101822o23 f167439g;

        /* renamed from: dy2.a$a$a */
        public static final class C58461a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C75665a.C58851b f167440d;

            /* renamed from: e */
            public final /* synthetic */ Bitmap f167441e;

            public C58461a(C75665a.C58851b bVar, Bitmap bitmap) {
                this.f167440d = bVar;
                this.f167441e = bitmap;
            }

            public final void run() {
                this.f167440d.f168472A.setImageBitmap(this.f167441e);
            }
        }

        /* renamed from: dy2.a$a$b */
        public static final class C58462b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C58459a f167442d;

            /* renamed from: e */
            public final /* synthetic */ C75665a.C58851b f167443e;

            /* renamed from: f */
            public final /* synthetic */ C101822o23 f167444f;

            public C58462b(C58459a aVar, C75665a.C58851b bVar, C101822o23 o232) {
                this.f167442d = aVar;
                this.f167443e = bVar;
                this.f167444f = o232;
            }

            public final void run() {
                this.f167442d.mo83416e(this.f167443e, this.f167444f);
            }
        }

        public C58460a(String str, C58459a aVar, C75665a.C58851b bVar, C101822o23 o232) {
            this.f167436d = str;
            this.f167437e = aVar;
            this.f167438f = bVar;
            this.f167439g = o232;
        }

        public final void run() {
            Bitmap decodeFileWithSample = BitmapUtil.decodeFileWithSample(this.f167436d, 512, 512);
            if (decodeFileWithSample != null) {
                C58459a aVar = this.f167437e;
                String str = this.f167436d;
                C75665a.C58851b bVar = this.f167438f;
                String str2 = aVar.f167435b;
                Log.m105924i(str2, "use cover path: " + str);
                bVar.f168472A.post(new C58461a(bVar, decodeFileWithSample));
                return;
            }
            C75665a.C58851b bVar2 = this.f167438f;
            bVar2.f168472A.post(new C58462b(this.f167437e, bVar2, this.f167439g));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58459a(C58854c.C58855a aVar) {
        super(aVar);
        C87412m.m108594g(aVar, "callback");
    }

    /* renamed from: a */
    public int mo75502a(MultiTaskInfo multiTaskInfo) {
        C87412m.m108594g(multiTaskInfo, "data");
        return C0966R.C0969drawable.ccy;
    }

    /* renamed from: b */
    public String mo75503b(MultiTaskInfo multiTaskInfo) {
        String q = C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.f7900vl);
        C87412m.m108593f(q, "getString(MMApplicationC…r_section_subtitle_music)");
        return q;
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [rx3.b0] */
    /* JADX WARNING: type inference failed for: r1v13, types: [lu3.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo75505d(int r6, ey2.C75665a.C58851b r7, ay2.C67121f r8) {
        /*
            r5 = this;
            java.lang.String r0 = "viewHolder"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "viewModel"
            gy3.C87412m.m108594g(r8, r0)
            super.mo75505d(r6, r7, r8)
            te3.o23 r0 = new te3.o23
            r0.<init>()
            java.util.List<com.tencent.mm.plugin.multitask.model.MultiTaskInfo> r1 = r8.f192729d     // Catch:{ all -> 0x007b }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x007b }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x007b }
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r1 = (com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo) r1     // Catch:{ all -> 0x007b }
            byte[] r1 = r1.field_data     // Catch:{ all -> 0x007b }
            r0.parseFrom(r1)     // Catch:{ all -> 0x007b }
            android.widget.ImageView r1 = r7.f168479z
            r2 = 0
            r1.setVisibility(r2)
            android.widget.ImageView r1 = r7.f168472A
            r3 = 0
            r1.setImageDrawable(r3)
            te3.t23 r1 = r0.f298945d
            if (r1 == 0) goto L_0x0060
            java.lang.String r4 = r1.f185472t
            if (r4 == 0) goto L_0x0060
            if (r1 == 0) goto L_0x003b
            java.lang.String r3 = r1.f185461f
        L_0x003b:
            if (r3 == 0) goto L_0x0043
            int r1 = r3.length()
            if (r1 != 0) goto L_0x0044
        L_0x0043:
            r2 = 1
        L_0x0044:
            if (r2 == 0) goto L_0x005a
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r1 == 0) goto L_0x005a
            zt3.t r1 = zt3.C119157j.f356862d
            dy2.a$a r2 = new dy2.a$a
            r2.<init>(r4, r5, r7, r0)
            zt3.j r1 = (zt3.C119157j) r1
            lu3.c r1 = r1.mo183870a(r2)
            goto L_0x005f
        L_0x005a:
            r5.mo83416e(r7, r0)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x005f:
            r3 = r1
        L_0x0060:
            if (r3 != 0) goto L_0x0065
            r5.mo83416e(r7, r0)
        L_0x0065:
            android.widget.TextView r7 = r7.f168473B
            java.util.List<com.tencent.mm.plugin.multitask.model.MultiTaskInfo> r8 = r8.f192729d
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r6 = r8.get(r6)
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r6 = (com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo) r6
            te3.j13 r6 = r6.mo80305m2()
            java.lang.String r6 = r6.f183752e
            r7.setText(r6)
            return
        L_0x007b:
            java.lang.String r6 = r5.f167435b
            java.lang.String r7 = "MusicMultiTaskData parse failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dy2.C58459a.mo75505d(int, ey2.a$b, ay2.f):void");
    }

    /* renamed from: e */
    public final void mo83416e(C75665a.C58851b bVar, C101822o23 o232) {
        String str = null;
        bVar.f168472A.setImageDrawable((Drawable) null);
        C64719t23 t232 = o232.f298945d;
        if (t232 != null) {
            str = t232.f185461f;
        }
        if (str == null || str.length() == 0) {
            str = o232.f298958t;
        }
        if (str != null) {
            String str2 = this.f167435b;
            Log.m105924i(str2, "use url: " + str);
            C20828a.m22825b().mo32519h(str, bVar.f168472A, C78493o.f229928a);
        }
    }
}
