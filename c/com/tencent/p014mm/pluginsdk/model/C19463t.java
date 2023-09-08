package com.tencent.p014mm.pluginsdk.model;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.model.C19449k;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import ic0.C21070h;
import ic0.C98661k;
import java.util.HashMap;
import jc0.C21210b;
import p823sg.C90193h;
import s90.C77630j;
import wd3.C118762j;
import z04.C119027c;

/* renamed from: com.tencent.mm.pluginsdk.model.t */
public final class C19463t {

    /* renamed from: a */
    public static final C19463t f54993a = new C19463t();

    /* renamed from: com.tencent.mm.pluginsdk.model.t$a */
    public static final class C19464a implements C21070h {

        /* renamed from: a */
        public final int f54994a;

        /* renamed from: b */
        public final C21070h f54995b;

        public C19464a(int i, String str, C21070h hVar) {
            byte[] bArr;
            this.f54994a = i;
            this.f54995b = hVar;
            if (str != null) {
                bArr = str.getBytes(C119027c.f356488a);
                C87412m.m108593f(bArr, "this as java.lang.String).getBytes(charset)");
            } else {
                bArr = null;
            }
            C90193h.m112878f(bArr);
        }

        /* renamed from: a */
        public void mo6676a(String str, View view) {
            C21070h hVar = this.f54995b;
            if (hVar != null) {
                hVar.mo6676a(str, view);
            }
        }

        /* renamed from: b */
        public void mo6677b(String str, View view, C21210b bVar) {
            C87412m.m108594g(str, "url");
            C21070h hVar = this.f54995b;
            if (hVar != null) {
                hVar.mo6677b(str, view, bVar);
            }
            if (C118762j.f355306a.mo183489b(this.f54994a)) {
                C19449k kVar = C19449k.f54939a;
                MMHandlerThread.postToMainThread(new C19456m(str, System.currentTimeMillis(), bVar));
            }
        }

        /* renamed from: c */
        public Bitmap mo6678c(String str, View view, C21210b bVar) {
            C118762j jVar = C118762j.f355306a;
            if (jVar.mo183489b(this.f54994a)) {
                C19449k.f54939a.mo25210c(7, str, 0);
            }
            C21070h hVar = this.f54995b;
            Bitmap c = hVar != null ? hVar.mo6678c(str, view, bVar) : null;
            if (jVar.mo183489b(this.f54994a)) {
                C19449k.m20803a(C19449k.f54939a, 7, str, 0, 4, (Object) null);
            }
            return c;
        }
    }

    /* renamed from: a */
    public final void mo25227a(long j, int i, C77630j jVar, int i2, String str, ImageView imageView, int i3, boolean z, C20937c cVar, C98661k kVar, C21070h hVar) {
        int i4;
        long j2;
        int i5 = i2;
        String str2 = str;
        ImageView imageView2 = imageView;
        C20937c cVar2 = cVar;
        if (str2 != null) {
            C19449k kVar2 = C19449k.f54939a;
            String b = kVar2.mo25209b(str2);
            if (imageView2 != null) {
                imageView2.setTag(C0966R.C0970id.f357519aa1, str2);
            }
            Object[] objArr = new Object[5];
            String str3 = null;
            objArr[0] = imageView2 != null ? Integer.valueOf(imageView.hashCode()) : null;
            objArr[1] = Boolean.valueOf(z);
            objArr[2] = b;
            objArr[3] = str2;
            if (cVar2 != null) {
                str3 = cVar2.f59321e;
            }
            objArr[4] = str3;
            Log.m105919d("MicroMsg.BizImageLoader", "alvinluo BizImage loadImage imageView: %s, isPreload: %b, id: %s, url: %s, fullPath: %s", objArr);
            if (C118762j.f355306a.mo183489b(i5) && !z) {
                long currentTimeMillis = System.currentTimeMillis();
                if (jVar != null) {
                    if (!(str.length() == 0)) {
                        HashMap<String, C19449k.C19451b> hashMap = C19449k.f54940b;
                        if (hashMap.get(str2) == null) {
                            HashMap<String, String> hashMap2 = C19449k.f54941c;
                            StringBuilder sb = new StringBuilder();
                            sb.append(j);
                            sb.append(',');
                            sb.append(i);
                            String str4 = hashMap2.get(sb.toString());
                            C19449k.C19451b bVar = new C19449k.C19451b(str2);
                            if (currentTimeMillis != 0) {
                                i4 = i3;
                                j2 = currentTimeMillis;
                            } else {
                                j2 = System.currentTimeMillis();
                                i4 = i3;
                            }
                            bVar.f54959j = i4;
                            if (str4 != null) {
                                bVar.f54957h = str4;
                            }
                            bVar.mo25215c(1, j2);
                            hashMap.put(str2, bVar);
                            if (C19449k.f54943e) {
                                Log.m105927v("MicroMsg.BizImageBlankReporter", "alvinluo startLoad flinging id: %s, url: %s", kVar2.mo25209b(str2), str2);
                                bVar.mo25215c(9, j2);
                            }
                        }
                    }
                    kVar2.mo25210c(8, str2, currentTimeMillis);
                }
            }
            C20828a.m22825b().mo32522k(str, imageView, cVar, kVar, new C19464a(i5, str2, hVar));
        }
    }
}
