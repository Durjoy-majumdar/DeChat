package pj0;

import android.graphics.drawable.Drawable;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83132y2;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.smiley.C96973t0;
import di3.C86312j;
import java.lang.ref.WeakReference;
import js0.C9514m;
import p008bq.C92292x0;
import p416qd.C25546a;
import p416qd.C35829i;
import p419td.C26294a;
import p419td.C26302f;
import p419td.C26307i;
import p927ab.C79476a;
import p927ab.C79477b;

/* renamed from: pj0.a */
public class C89355a extends C79477b {

    /* renamed from: a */
    public static final C89355a f257342a = new C89355a();

    /* renamed from: pj0.a$c */
    public static final class C35513c implements C35829i {
        public C35513c(int i) {
        }

        /* renamed from: a */
        public void mo53169a(int i) {
            Log.m105924i("MicroMsg.MBFontManagerRegistryWC", "mbfont idkey logid:" + C83132y2.CTRL_INDEX + ",key:" + i);
            C115669n.INSTANCE.mo175911u(C83132y2.CTRL_INDEX, i);
        }
    }

    /* renamed from: pj0.a$b */
    public static final class C89356b implements C25546a.C25548b {
        public C89356b(C35512a aVar) {
        }

        /* renamed from: a */
        public Drawable mo52784a(String str, int i) {
            C9514m mVar = new C9514m();
            mo123711c(str, i, mVar);
            return ((C92292x0) C86312j.m106911c(C92292x0.class)).mo126024k0().mo126279F((C96973t0) mVar.f29691a);
        }

        /* renamed from: b */
        public int mo52785b(String str, int i) {
            return mo123711c(str, i, (C9514m<C96973t0>) null);
        }

        /* renamed from: c */
        public final int mo123711c(String str, int i, C9514m<C96973t0> mVar) {
            Class cls = C92292x0.class;
            if (str == null || i < 0 || i >= str.length()) {
                return 0;
            }
            int codePointAt = str.codePointAt(i);
            T B = ((C92292x0) C86312j.m106911c(cls)).mo126024k0().mo126275B(codePointAt);
            if (B != null) {
                if (mVar != null) {
                    mVar.f29691a = B;
                }
                return Character.charCount(codePointAt);
            }
            int charCount = Character.charCount(codePointAt) + i;
            int codePointAt2 = charCount < str.length() ? str.codePointAt(charCount) : 0;
            T D = ((C92292x0) C86312j.m106911c(cls)).mo126024k0().mo126277D(codePointAt, codePointAt2);
            if (D == null) {
                return 0;
            }
            if (D.f284096b.length >= 2) {
                charCount += Character.charCount(codePointAt2);
            }
            if (mVar != null) {
                mVar.f29691a = D;
            }
            return charCount - i;
        }
    }

    /* renamed from: a */
    public void mo123710a(MBRuntime mBRuntime, AppBrandRuntime appBrandRuntime) {
        WeakReference weakReference = new WeakReference(appBrandRuntime);
        C26307i iVar = (C26307i) mBRuntime.f235056e;
        C79476a aVar = new C79476a(this, weakReference);
        iVar.f73288e = aVar;
        C26302f fVar = iVar.f73285b;
        if (fVar != null) {
            fVar.f73266c = aVar;
        }
        C25546a.f72238a = new C89356b((C35512a) null);
        C26294a.f73251a = new C35513c(C83132y2.CTRL_INDEX);
    }
}
