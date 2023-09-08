package n73;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.WearActionEvent;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f40.C86709a0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ke3.C88144b;
import l73.C46836a;
import lc3.C10485b;
import pe3.C89349b;
import te3.i15;
import te3.t15;

/* renamed from: n73.m */
public class C47196m extends C47188b {
    /* renamed from: a */
    public List<Integer> mo11243a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(11032);
        arrayList.add(11034);
        return arrayList;
    }

    /* renamed from: b */
    public byte[] mo11244b(int i, byte[] bArr) {
        if (i == 11032) {
            i15 i15 = new i15();
            if (((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("WearPayBlock", 0) != 0) {
                i15.f135027d = 16777215;
                i15.f135028e = MMApplicationContext.getContext().getString(C0966R.string.lef);
            } else {
                C46836a.m52129b(13, 0);
                C46836a.m52128a(15);
                WearActionEvent wearActionEvent = new WearActionEvent();
                wearActionEvent.f107808d.f107810a = 3;
                wearActionEvent.publish();
                WearActionEvent.C40183b bVar = wearActionEvent.f107809e;
                int i2 = bVar.f107818e;
                if (i2 == 1) {
                    i15.f135027d = 0;
                    i15.f135028e = "";
                    i15.f135029f = new C89349b(bVar.f107819f);
                    i15.f135030g = new C89349b(wearActionEvent.f107809e.f107820g);
                    WearActionEvent.C40183b bVar2 = wearActionEvent.f107809e;
                    i15.f135031h = bVar2.f107821h;
                    i15.f135032i = bVar2.f107822i;
                } else if (i2 == 2) {
                    i15.f135027d = 196611;
                    i15.f135028e = MMApplicationContext.getContext().getString(C0966R.string.led);
                } else if (i2 == 3) {
                    i15.f135027d = 196609;
                    i15.f135028e = MMApplicationContext.getContext().getString(C0966R.string.lec);
                } else if (i2 == 4) {
                    i15.f135027d = 196610;
                    i15.f135028e = MMApplicationContext.getContext().getString(C0966R.string.leg);
                } else if (i2 == 5) {
                    i15.f135027d = 196612;
                    i15.f135028e = MMApplicationContext.getContext().getString(C0966R.string.lee);
                }
            }
            try {
                return i15.toByteArray();
            } catch (IOException unused) {
            }
        } else if (i == 11034) {
            t15 t15 = new t15();
            try {
                t15.parseFrom(bArr);
            } catch (IOException unused2) {
            }
            C88144b.m109789g(MMApplicationContext.getContext(), t15.f141903d, t15.f141904e);
        }
        return new byte[0];
    }

    /* renamed from: d */
    public boolean mo72263d(int i) {
        return i == 11032;
    }

    /* renamed from: e */
    public boolean mo72264e(int i) {
        return i == 11032;
    }
}
