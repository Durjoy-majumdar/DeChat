package yk3;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import c00.C0405n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75604z3;
import java.util.HashMap;
import kg3.C76577a;
import nj3.C76874e0;
import p255vr.C65873e;
import u73.C101982p;
import u73.C14134p0;
import u73.C22613h1;
import uo3.C78253a;
import ww0.C78732i;
import zt3.C119157j;

/* renamed from: yk3.b */
public class C79135b {

    /* renamed from: yk3.b$a */
    public class C79136a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f232389d;

        /* renamed from: e */
        public final /* synthetic */ int f232390e;

        /* renamed from: f */
        public final /* synthetic */ String f232391f;

        /* renamed from: g */
        public final /* synthetic */ int f232392g;

        /* renamed from: h */
        public final /* synthetic */ String f232393h;

        /* renamed from: i */
        public final /* synthetic */ String f232394i;

        /* renamed from: j */
        public final /* synthetic */ String f232395j;

        /* renamed from: n */
        public final /* synthetic */ int f232396n;

        /* renamed from: o */
        public final /* synthetic */ String f232397o;

        /* renamed from: p */
        public final /* synthetic */ long f232398p;

        /* renamed from: q */
        public final /* synthetic */ int f232399q;

        public C79136a(String str, int i, String str2, int i2, String str3, String str4, String str5, int i3, String str6, long j, int i4) {
            this.f232389d = str;
            this.f232390e = i;
            this.f232391f = str2;
            this.f232392g = i2;
            this.f232393h = str3;
            this.f232394i = str4;
            this.f232395j = str5;
            this.f232396n = i3;
            this.f232397o = str6;
            this.f232398p = j;
            this.f232399q = i4;
        }

        public void run() {
            C78732i.C53208a ka = ((C78732i) C86312j.m106911c(C78732i.class)).mo73881ka(this.f232389d);
            C22613h1.m26479e(this.f232390e, this.f232391f, this.f232392g, 1, ka.f148428c, this.f232393h, this.f232394i, this.f232395j, this.f232396n, this.f232397o, this.f232398p, (long) this.f232389d.length(), this.f232399q, ka.f148426a, ka.f148429d, ka.f148427b);
        }
    }

    /* renamed from: a */
    public static void m95725a(Context context, C78253a aVar, C76874e0 e0Var, Resources resources, CharSequence charSequence, C72963f4 f4Var, int i) {
        String str;
        Class cls = C65873e.class;
        if (e0Var != null && aVar != null && !Util.isNullOrNil(charSequence) && !((C0405n) C86312j.m106911c(C0405n.class)).mo279e()) {
            e0Var.mo107136c(0, 101, 0, resources.getString(C0966R.string.b_i), C0966R.raw.icons_filled_search_logo);
            String Lp0 = ((C78732i) C86312j.m106911c(C78732i.class)).Lp0(charSequence.toString());
            if (!Util.isNullOrNil(Lp0)) {
                aVar.f229235K = new C79134a(resources, Lp0);
            }
            if (Util.isNullOrNil(Lp0)) {
                aVar.f229235K = null;
            }
            if (2 == i || 1 == i) {
                str = ((C65873e) C86312j.m106911c(cls)).ep0(34) + "_";
            } else if (3 == i || 4 == i) {
                str = ((C65873e) C86312j.m106911c(cls)).ep0(34) + "_";
            } else {
                str = "";
            }
            m95727c(f4Var, 1, !Util.isNullOrNil(Lp0), charSequence.toString(), str + C31543z5.m39453c(), i);
        }
    }

    /* renamed from: b */
    public static void m95726b(Context context, Resources resources, CharSequence charSequence, C72963f4 f4Var, int i, boolean z) {
        int i2;
        String str;
        Context context2 = context;
        int i3 = i;
        Class cls = C78732i.class;
        if (!Util.isNullOrNil(charSequence)) {
            if (3 == i3 || 4 == i3) {
                str = "65_" + C31543z5.m39453c();
                i2 = 65;
            } else {
                str = "34_" + C31543z5.m39453c();
                i2 = 34;
            }
            String charSequence2 = charSequence.toString();
            String Lp0 = ((C78732i) C86312j.m106911c(cls)).Lp0(charSequence2);
            boolean z2 = !Util.isNullOrNil(Lp0);
            m95727c(f4Var, 2, z2, charSequence2, str, i);
            C14134p0 p0Var = new C14134p0();
            p0Var.f39544a = context2;
            p0Var.f39545b = i2;
            p0Var.f39547d = charSequence2;
            p0Var.f39548e = str;
            p0Var.f39549f = true;
            if (z) {
                p0Var.f39551h = true;
                p0Var.f39552i = false;
                p0Var.f39560q = true;
                p0Var.f39554k = C76577a.m92153d(context, C0966R.color.al6);
                p0Var.f39555l = true;
                ((HashMap) p0Var.f39550g).put("chatSearch", "1");
            } else {
                p0Var.f39552i = false;
            }
            if (z2) {
                String js02 = ((C78732i) C86312j.m106911c(cls)).js0(Lp0);
                String Sg0 = ((C78732i) C86312j.m106911c(cls)).Sg0(Lp0, charSequence2);
                if (!TextUtils.isEmpty(js02)) {
                    ((HashMap) p0Var.f39561r).put("exposedFingerWord", js02);
                }
                if (!TextUtils.isEmpty(Sg0)) {
                    ((HashMap) p0Var.f39561r).put("matchedFingerWord", Sg0);
                }
            }
            ((C101982p) C86312j.m106911c(C101982p.class)).mo6877X6(p0Var);
        }
    }

    /* renamed from: c */
    public static void m95727c(C72963f4 f4Var, int i, boolean z, String str, String str2, int i2) {
        String s;
        int i3 = i2;
        Class cls = C78732i.class;
        if (f4Var != null) {
            String t = f4Var.mo108768t();
            int i4 = C72996z1.m85820U5(t) ? 2 : 1;
            String str3 = C72996z1.m85820U5(t) ? t : "0";
            String nullAs = Util.nullAs(t, "");
            boolean U5 = C72996z1.m85820U5(t);
            if (U5 && U5 && (s = C75604z3.m90847s(f4Var.getContent())) != null && s.length() > 0) {
                nullAs = s;
            }
            String str4 = nullAs;
            String str5 = f4Var.mo108774y2() + "";
            String I80 = ((C78732i) C86312j.m106911c(cls)).I80();
            long MS = (long) ((C78732i) C86312j.m106911c(cls)).mo73878MS();
            int i5 = (2 == i3 || 1 == i3) ? 34 : 65;
            if (z) {
                ((C119157j) C119157j.f356862d).mo183875f(new C79136a(str, i, str2, i5, I80, str5, str4, i4, str3, MS, i2));
            } else {
                C22613h1.m26479e(i, str2, i5, 0, "", I80, str5, str4, i4, str3, MS, (long) str.length(), i2, "", "", -1);
            }
        }
    }
}
