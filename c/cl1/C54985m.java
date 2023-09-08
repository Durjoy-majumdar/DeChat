package cl1;

import a14.C0000n0;
import a14.C53851a;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53895h;
import a14.C53922m0;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import androidx.lifecycle.LiveData;
import com.tencent.p014mm.plugin.finder.live.infrastructure.livedata.LiveMutableData;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import di3.C86312j;
import fj1.C45795b;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import sx3.C110818d0;
import te3.C51601uv;
import te3.C64328dv0;
import te3.C64740tw0;
import te3.C64784vv;
import tf0.C64916p1;
import wx3.C15601d;

/* renamed from: cl1.m */
public final class C54985m extends C39970c<C45795b> {

    /* renamed from: s */
    public static final C54986a f154157s = new C54986a((C8480h) null);

    /* renamed from: f */
    public final C0000n0 f154158f = C53930o0.m60554a(((C53884f2) C53959v2.m60598a((C53973z1) null, 1, (Object) null)).plus(C53872d1.f151119c).plus(new C53922m0("cheer_animation_preload")));

    /* renamed from: g */
    public C53973z1 f154159g;

    /* renamed from: h */
    public ArrayList<C64740tw0> f154160h = new ArrayList<>();

    /* renamed from: i */
    public final LiveMutableData<C54987c> f154161i;

    /* renamed from: j */
    public final LiveData<C54987c> f154162j;

    /* renamed from: n */
    public final LiveMutableData<C54987c> f154163n;

    /* renamed from: o */
    public final LiveData<C54987c> f154164o;

    /* renamed from: p */
    public LiveMutableData<C54987c> f154165p;

    /* renamed from: q */
    public C0671b f154166q;

    /* renamed from: r */
    public boolean f154167r;

    /* renamed from: cl1.m$b */
    public static final class C0671b {

        /* renamed from: a */
        public final LinkedList<C51601uv> f1580a;

        /* renamed from: b */
        public final String f1581b;

        /* renamed from: c */
        public final int f1582c;

        public C0671b(LinkedList<C51601uv> linkedList, String str, int i) {
            this.f1580a = linkedList;
            this.f1581b = str;
            this.f1582c = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0671b)) {
                return false;
            }
            C0671b bVar = (C0671b) obj;
            return C87412m.m108589b(this.f1580a, bVar.f1580a) && C87412m.m108589b(this.f1581b, bVar.f1581b) && this.f1582c == bVar.f1582c;
        }

        public int hashCode() {
            LinkedList<C51601uv> linkedList = this.f1580a;
            int i = 0;
            int hashCode = (linkedList == null ? 0 : linkedList.hashCode()) * 31;
            String str = this.f1581b;
            if (str != null) {
                i = str.hashCode();
            }
            return ((hashCode + i) * 31) + this.f1582c;
        }

        public String toString() {
            return "LiveCheerInfo(cheerIconInfo=" + this.f1580a + ", cheerBtnUrl=" + this.f1581b + ", enable=" + this.f1582c + ')';
        }
    }

    /* renamed from: cl1.m$a */
    public static final class C54986a {
        public C54986a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo75952a(C64784vv vvVar) {
            C87412m.m108594g(vvVar, "<this>");
            return "url: " + vvVar.f185991d + " duration: " + vvVar.f185993f + " md5: " + vvVar.f185992e;
        }

        /* renamed from: b */
        public final String mo75953b(C64740tw0 tw02) {
            C87412m.m108594g(tw02, "<this>");
            StringBuilder sb = new StringBuilder();
            sb.append("cheer_button_url: ");
            sb.append(tw02.f185686e);
            sb.append(" enable: ");
            sb.append(tw02.f185687f);
            sb.append(" landscape_resource: ");
            C64784vv vvVar = tw02.f185688g;
            String str = null;
            sb.append(vvVar != null ? mo75952a(vvVar) : null);
            sb.append(" resource: ");
            C64784vv vvVar2 = tw02.f185689h;
            if (vvVar2 != null) {
                str = mo75952a(vvVar2);
            }
            sb.append(str);
            sb.append(" resource_id: ");
            sb.append(tw02.f185691j);
            sb.append(" total_duration: ");
            sb.append(tw02.f185692n);
            sb.append(" color: ");
            sb.append(tw02.f185690i);
            return sb.toString();
        }
    }

    /* renamed from: cl1.m$c */
    public static final class C54987c {

        /* renamed from: a */
        public final C64740tw0 f154168a;

        /* renamed from: b */
        public boolean f154169b;

        /* renamed from: c */
        public final double f154170c;

        /* renamed from: d */
        public final long f154171d;

        public C54987c(C64740tw0 tw02, boolean z, double d, long j) {
            C87412m.m108594g(tw02, "animationInfo");
            this.f154168a = tw02;
            this.f154169b = z;
            this.f154170c = d;
            this.f154171d = j;
        }

        public String toString() {
            return "animationInfo: " + C54985m.f154157s.mo75953b(this.f154168a) + " canDisplay: " + this.f154169b + " speed: " + this.f154170c;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54985m(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
        LiveMutableData<C54987c> liveMutableData = new LiveMutableData<>();
        this.f154161i = liveMutableData;
        this.f154162j = liveMutableData;
        LiveMutableData<C54987c> liveMutableData2 = new LiveMutableData<>();
        this.f154163n = liveMutableData2;
        this.f154164o = liveMutableData2;
        this.f154165p = new LiveMutableData<>();
    }

    /* renamed from: c3 */
    public final String mo75949c3(C64784vv vvVar) {
        if (vvVar != null) {
            String str = vvVar.f185991d;
            if (!(str == null || str.length() == 0)) {
                String mD5String = MD5Util.getMD5String(vvVar.f185991d);
                C87412m.m108593f(mD5String, "getMD5String(resource.url)");
                return ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76726wa("ec_cheer_animation_dir", mD5String);
            }
        }
        return "";
    }

    /* renamed from: d3 */
    public final void mo75950d3(C0671b bVar, LinkedList<C64740tw0> linkedList) {
        String str;
        C87412m.m108594g(bVar, "originCheerInfo");
        this.f154166q = bVar;
        StringBuilder sb = new StringBuilder();
        sb.append("updateCheerAnimationInfo: ");
        if (linkedList != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("[ ");
            for (C64740tw0 b : linkedList) {
                sb4.append(f154157s.mo75953b(b));
            }
            sb4.append(" ]");
            str = sb4.toString();
            C87412m.m108593f(str, "sb.toString()");
        } else {
            str = null;
        }
        sb.append(str);
        Log.m105924i("LiveCheerAnimationSlice", sb.toString());
        if (linkedList != null) {
            this.f154160h.clear();
            this.f154160h.addAll(linkedList);
            boolean z = false;
            C64740tw0 tw02 = (C64740tw0) C110818d0.m150917O(linkedList, 0);
            C53973z1 z1Var = this.f154159g;
            if (z1Var != null && ((C53851a) z1Var).mo74466a()) {
                z = true;
            }
            if (z || tw02 == null) {
                Log.m105924i("LiveCheerAnimationSlice", "checkPreload is doing, return");
            } else {
                this.f154159g = C53895h.m60466d(this.f154158f, C53872d1.f151119c, (C53934p0) null, new C54989n(tw02, this, (C15601d<? super C54989n>) null), 2, (Object) null);
            }
        }
    }

    /* renamed from: e3 */
    public final void mo75951e3(C64328dv0 dv02) {
        String str;
        C64740tw0 tw02;
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("updateCheerSwitch isPluginActive: ");
        sb.append(this.f154167r);
        sb.append(" info: ");
        C54987c cVar = null;
        if (dv02 != null) {
            str = "can_display: " + dv02.f182858d + " resource_id: " + dv02.f182859e + " speed: " + dv02.f182860f;
        } else {
            str = null;
        }
        sb.append(str);
        Log.m105924i("LiveCheerAnimationSlice", sb.toString());
        if (this.f154167r && dv02 != null) {
            Iterator<C64740tw0> it = this.f154160h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    tw02 = null;
                    break;
                }
                tw02 = it.next();
                if (tw02.f185691j == dv02.f182859e) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C64740tw0 tw03 = tw02;
            if (tw03 != null) {
                cVar = new C54987c(tw03, dv02.f182858d, dv02.f182860f, dv02.f182861g);
            }
            this.f154161i.postValue(cVar);
        }
    }
}
