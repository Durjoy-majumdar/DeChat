package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import dp1.C58378j1;
import dp1.C58389m1;
import dp1.C58403t;
import eb0.C31543z5;
import f40.C86709a0;
import go3.C59600d;
import gy3.C8480h;
import gy3.C87412m;
import he1.C59838a;
import hp3.C87581a;
import java.util.HashMap;
import java.util.LinkedList;
import je1.C46547x1;
import jp3.C46566c;
import jp3.C9486a;
import o40.C61926c;
import ob0.C89132b;
import p640ox.C77049b;
import p749xh.C66261f3;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C49712hj1;
import te3.C49946j51;
import te3.C50008jm0;
import te3.C64441i93;
import te3.db4;
import te3.op4;
import up1.C65426w0;
import uz2.C65490m;
import uz2.C78315f0;

/* renamed from: com.tencent.mm.plugin.finder.view.k */
public abstract class C56630k extends C59600d {

    /* renamed from: n */
    public static final HashMap<Long, Boolean> f162343n = new HashMap<>();

    /* renamed from: e */
    public final Context f162344e;

    /* renamed from: f */
    public final FinderObject f162345f;

    /* renamed from: g */
    public final C65490m f162346g;

    /* renamed from: h */
    public boolean f162347h;

    /* renamed from: i */
    public final C46566c<C9486a> f162348i;

    /* renamed from: j */
    public C30030c f162349j;

    /* renamed from: com.tencent.mm.plugin.finder.view.k$b */
    public static final class C30029b {
        public C30029b(C8480h hVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.k$c */
    public static final class C30030c {

        /* renamed from: a */
        public int f81271a;

        /* renamed from: b */
        public long f81272b = C31543z5.m39453c();

        /* renamed from: c */
        public int f81273c;

        public C30030c(int i) {
            this.f81271a = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C30030c) && this.f81271a == ((C30030c) obj).f81271a;
        }

        public int hashCode() {
            return this.f81271a;
        }

        public String toString() {
            return "StatRecord(index=" + this.f81271a + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.k$a */
    public static final class C56631a implements C9486a {

        /* renamed from: d */
        public static final C56631a f162350d = new C56631a();

        public final void dead() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.k$d */
    public static final class C56632d<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C56630k f162351a;

        public C56632d(C56630k kVar) {
            this.f162351a = kVar;
        }

        public Object call(Object obj) {
            FinderObject finderObject;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            String tag = this.f162351a.getTag();
            Log.m105924i(tag, "[checkFeedValid] errType=" + cVar.f256793a + " errCode=" + cVar.f256794b + " requestId=" + this.f162351a.f162345f.f164794id + ' ');
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C56630k.f162343n.put(Long.valueOf(this.f162351a.f162345f.f164794id), Boolean.TRUE);
                C56630k kVar = this.f162351a;
                FinderObject finderObject2 = kVar.f162345f;
                C87412m.m108594g(finderObject2, C66261f3.COL_FINDEROBJECT);
                boolean z = C31543z5.m39455e() >= kVar.f162346g.f188448g + finderObject2.urlValidDuration;
                String tag2 = kVar.getTag();
                Log.m105924i(tag2, "[isReplaceFinderObject] result=" + z + " feedId=" + C61926c.m72691p(finderObject2.f164794id) + " statusCreateTime=" + kVar.f162346g.f188448g + " urlValidDuration=" + finderObject2.urlValidDuration + " current=" + C31543z5.m39455e());
                if (z && (finderObject = ((C50008jm0) cVar.f256796d).f136184e) != null) {
                    C56630k kVar2 = this.f162351a;
                    kVar2.f162345f.parseFrom(finderObject.toByteArray());
                    C61926c.m72668M(new C56634l(kVar2));
                }
            } else {
                int i = cVar.f256794b;
                if (i == -4011 || i == -4033 || i == -4036) {
                    C56630k.f162343n.put(Long.valueOf(this.f162351a.f162345f.f164794id), Boolean.FALSE);
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_TEXT_STATUS_FEED_INVALID_WORDING_STRING, cVar.f256795c);
                }
            }
            C56630k kVar3 = this.f162351a;
            kVar3.mo79966k(kVar3.mo79984l());
            this.f162351a.f162347h = false;
            return C13598b0.f38549a;
        }
    }

    static {
        new C30029b((C8480h) null);
    }

    public C56630k(Context context, FinderObject finderObject, C65490m mVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        C87412m.m108594g(mVar, "pullDownParam");
        this.f162344e = context;
        this.f162345f = finderObject;
        this.f162346g = mVar;
        C46566c<C9486a> cVar = new C46566c<>();
        this.f162348i = cVar;
        cVar.keep(C56631a.f162350d);
    }

    /* renamed from: e */
    public void mo79961e() {
        LinkedList<FinderMedia> linkedList;
        FinderMedia finderMedia;
        int i;
        C30030c cVar;
        Class cls = C78315f0.class;
        Class cls2 = C77049b.class;
        this.f170310d = false;
        C78315f0 f0Var = (C78315f0) ((C77049b) C86312j.m106911c(cls2)).Wi0(this.f162344e, 9, cls);
        if (f0Var != null) {
            FinderObjectDesc finderObjectDesc = this.f162345f.objectDesc;
            if (finderObjectDesc != null) {
                if ((finderObjectDesc != null ? finderObjectDesc.media : null) != null) {
                    C87412m.m108591d(finderObjectDesc);
                    LinkedList<FinderMedia> linkedList2 = finderObjectDesc.media;
                    C87412m.m108593f(linkedList2, "finderObject.objectDesc!!.media");
                    FinderMedia finderMedia2 = (FinderMedia) C110818d0.m150916N(linkedList2);
                    if (finderMedia2 != null) {
                        i = finderMedia2.videoDuration;
                        if (i > 0 && (cVar = this.f162349j) != null) {
                            cVar.f81273c = (int) ((f0Var.f229439r / ((long) i)) + 1);
                        }
                    }
                }
            }
            i = 0;
            cVar.f81273c = (int) ((f0Var.f229439r / ((long) i)) + 1);
        }
        C30030c cVar2 = this.f162349j;
        if (cVar2 != null) {
            C78315f0 f0Var2 = (C78315f0) ((C77049b) C86312j.m106911c(cls2)).Wi0(this.f162344e, 9, cls);
            C49712hj1 hj12 = new C49712hj1();
            if (f0Var2 != null) {
                hj12.f134671e = f0Var2.f229428d;
                hj12.f134675i = 106;
            }
            long c = C31543z5.m39453c();
            Context context = this.f162344e;
            FinderObject finderObject = this.f162345f;
            C87412m.m108594g(context, "context");
            C87412m.m108594g(finderObject, "feed");
            db4 db4 = new db4();
            db4.f182676d = finderObject.f164794id;
            db4.f182680h = finderObject.objectNonceId;
            db4.f182678f = new op4();
            db4.f182679g = new C64441i93();
            FinderObjectDesc finderObjectDesc2 = finderObject.objectDesc;
            db4.f182689t = finderObjectDesc2 != null ? finderObjectDesc2.mediaType : 0;
            String str = finderObject.username;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            db4.f182681i = str;
            long j = cVar2.f81272b;
            db4.f182682j = j;
            String str3 = finderObject.sessionBuffer;
            if (str3 != null) {
                str2 = str3;
            }
            db4.f182684o = str2;
            db4.f182692w = j;
            op4 op4 = db4.f182678f;
            if (op4 != null) {
                op4.f184687d = (finderObjectDesc2 == null || (linkedList = finderObjectDesc2.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) == null) ? 0 : finderMedia.videoDuration;
                long j2 = cVar2.f81272b;
                long j3 = c - j2;
                op4.f184688e = (int) (j3 / ((long) 1000));
                op4.f184689f = j3;
                op4.f184690g = j3;
                op4.f184691h = j3;
                op4.f184692i = j3;
                op4.f184693j = j2;
                op4.f184694n = c;
            }
            C64441i93 i932 = db4.f182679g;
            if (i932 != null) {
                i932.f183650e = 0;
                op4 op42 = db4.f182678f;
                i932.f183651f = op42 != null ? op42.f184688e : 0;
                i932.f183663u = 0;
                i932.f183652g = cVar2.f81273c;
            }
            C58378j1.f167214j0.mo83213c(db4, getTag());
            LinkedList linkedList3 = new LinkedList();
            linkedList3.add(db4);
            C58389m1.f167287a.mo83224a(linkedList3, hj12, 0);
            C58403t.C58405b.m67757e(C58403t.f167322q, hj12, this.f162345f.f164794id, 20, String.valueOf(c - cVar2.f81272b), 0, (C59838a) null, 48, (Object) null);
        }
    }

    /* renamed from: j */
    public void mo79983j() {
        if (!this.f162347h) {
            this.f162347h = true;
            Log.m105924i(getTag(), "checkFeedValidFromServer...");
            FinderObject finderObject = this.f162345f;
            C46547x1 x1Var = new C46547x1(finderObject.f164794id, finderObject.objectNonceId, 106, 2, "", true, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, (String) null, (C49712hj1) null, 0, (C49946j51) null, false, 122816, (C8480h) null);
            x1Var.f172733o = false;
            x1Var.mo9225i().mo123062e(new C56632d(this)).mo11397F(this.f162348i);
        }
    }

    /* renamed from: k */
    public abstract void mo79966k(boolean z);

    /* renamed from: l */
    public final boolean mo79984l() {
        Boolean bool = f162343n.get(Long.valueOf(this.f162345f.f164794id));
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: m */
    public abstract void mo79967m(FinderObject finderObject);
}
