package rj1;

import android.content.Context;
import androidx.lifecycle.C54219z;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import dh1.C7329b;
import fj1.C45795b;
import gy3.C8480h;
import gy3.C87412m;
import hp3.C87581a;
import java.util.Iterator;
import java.util.LinkedList;
import o40.C61926c;
import ob0.C89132b;
import pe3.C89349b;
import qg1.C12229q;
import qg1.C47833s;
import qg1.C47835w;
import rp1.C63486a;
import rx3.C13598b0;
import te3.C50029js0;
import te3.C50585ns0;
import te3.C50867ps0;
import te3.C51059r51;
import te3.C51291ss0;
import te3.C64699s51;
import te3.C64704s81;
import te3.C64722t51;
import te3.C64745u51;

/* renamed from: rj1.b */
public final class C63441b {

    /* renamed from: a */
    public final Context f179939a;

    /* renamed from: b */
    public final String f179940b = "FinderLiveAnchorPromoteModel";

    /* renamed from: c */
    public final C54219z<C63446c> f179941c = new C54219z<>();

    /* renamed from: d */
    public LinkedList<C51059r51> f179942d = new LinkedList<>();

    /* renamed from: e */
    public C63486a f179943e;

    /* renamed from: rj1.b$a */
    public static final class C63442a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ Boolean f179944a;

        /* renamed from: b */
        public final /* synthetic */ C63441b f179945b;

        /* renamed from: c */
        public final /* synthetic */ C64699s51 f179946c;

        public C63442a(Boolean bool, C63441b bVar, C64699s51 s512) {
            this.f179944a = bool;
            this.f179945b = bVar;
            this.f179946c = s512;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar.f256793a != 0 || cVar.f256794b != 0) {
                C61926c.m72668M(new C63440a(this.f179945b, cVar));
            } else if (C87412m.m108589b(this.f179944a, Boolean.TRUE)) {
                this.f179945b.mo88312d();
            } else {
                C51059r51 r512 = new C51059r51();
                C64699s51 s512 = this.f179946c;
                r512.f140706e = s512.f185341d;
                r512.f140707f = s512.f185343f;
                C50029js0 js02 = new C50029js0();
                C89349b bVar = ((C50867ps0) cVar.f256796d).f139934d;
                js02.parseFrom(bVar != null ? bVar.mo123703f() : null);
                r512.f140705d = js02.f136283d;
                this.f179945b.f179942d.add(r512);
                this.f179945b.f179941c.postValue(new C63446c(cVar.f256794b, 2, (LinkedList) null, r512, (C50585ns0) null, (String) null, 48, (C8480h) null));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rj1.b$b */
    public static final class C63443b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C63441b f179947a;

        /* renamed from: b */
        public final /* synthetic */ C51059r51 f179948b;

        public C63443b(C63441b bVar, C51059r51 r512) {
            this.f179947a = bVar;
            this.f179948b = r512;
        }

        public Object call(Object obj) {
            int i;
            T t;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar.f256793a == 0 && (i = cVar.f256794b) == 0) {
                this.f179947a.f179941c.postValue(new C63446c(i, 3, (LinkedList) null, this.f179948b, (C50585ns0) null, (String) null, 48, (C8480h) null));
                Iterator<T> it = this.f179947a.f179942d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    boolean z = true;
                    if (((C51059r51) t).f140706e != 1) {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                if (t == null) {
                    this.f179947a.mo88312d();
                }
            } else {
                this.f179947a.f179941c.postValue(new C63446c(cVar.f256794b, 3, (LinkedList) null, (C51059r51) null, (C50585ns0) null, cVar.f256795c, 28, (C8480h) null));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rj1.b$c */
    public static final class C63444c<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C63441b f179949a;

        /* renamed from: b */
        public final /* synthetic */ C51059r51 f179950b;

        public C63444c(C63441b bVar, C51059r51 r512) {
            this.f179949a = bVar;
            this.f179950b = r512;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C7329b bVar = C7329b.f25441a;
                C63486a aVar = this.f179949a.f179943e;
                byte[] bArr = null;
                if (aVar != null) {
                    C45795b S2 = aVar.mo87856S2();
                    C51059r51 r512 = this.f179950b;
                    C87412m.m108594g(S2, "liveData");
                    C87412m.m108594g(r512, "item");
                    int i = r512.f140706e;
                    int i2 = 3;
                    String str = "";
                    int i3 = -1;
                    if (i == 1) {
                        i2 = 1;
                    } else if (i == 2) {
                        C64722t51 t512 = new C64722t51();
                        C89349b bVar2 = r512.f140707f;
                        if (bVar2 != null) {
                            bArr = bVar2.mo123703f();
                        }
                        if (bArr != null) {
                            try {
                                t512.parseFrom(bArr);
                            } catch (Exception e) {
                                Log.printDebugStack("safeParser", str, e);
                            }
                        }
                        String str2 = t512.f185504g;
                        if (str2 != null) {
                            str = str2;
                        }
                        i2 = 2;
                    } else if (i == 3) {
                        C64745u51 u512 = new C64745u51();
                        C89349b bVar3 = r512.f140707f;
                        if (bVar3 != null) {
                            bArr = bVar3.mo123703f();
                        }
                        if (bArr != null) {
                            try {
                                u512.parseFrom(bArr);
                            } catch (Exception e2) {
                                Log.printDebugStack("safeParser", str, e2);
                            }
                        }
                        String str3 = u512.f185717g;
                        if (str3 != null) {
                            str = str3;
                        }
                    } else if (i == 4) {
                        C64704s81 s812 = new C64704s81();
                        C89349b bVar4 = r512.f140707f;
                        if (bVar4 != null) {
                            bArr = bVar4.mo123703f();
                        }
                        if (bArr != null) {
                            try {
                                s812.parseFrom(bArr);
                            } catch (Exception e3) {
                                Log.printDebugStack("safeParser", str, e3);
                            }
                        }
                        str = C61926c.m72691p(s812.f185374d);
                        i3 = s812.f185384q;
                        i2 = 4;
                    } else if (i != 8) {
                        i2 = -1;
                    } else {
                        FinderJumpInfo finderJumpInfo = new FinderJumpInfo();
                        C89349b bVar5 = r512.f140707f;
                        if (bVar5 != null) {
                            bArr = bVar5.mo123703f();
                        }
                        if (bArr != null) {
                            try {
                                finderJumpInfo.parseFrom(bArr);
                            } catch (Exception e4) {
                                Log.printDebugStack("safeParser", str, e4);
                            }
                        }
                        String str4 = finderJumpInfo.jump_id;
                        if (str4 != null) {
                            str = str4;
                        }
                        i2 = 8;
                    }
                    bVar.mo8500a(S2, r512.f140708g ? 5 : 4, i2, str, i3);
                    C51059r51 r513 = this.f179950b;
                    r513.f140708g = !r513.f140708g;
                    this.f179949a.f179941c.postValue(new C63446c(cVar.f256794b, 4, (LinkedList) null, r513, (C50585ns0) null, (String) null, 32, (C8480h) null));
                } else {
                    C87412m.m108603p("presenter");
                    throw null;
                }
            } else {
                this.f179949a.f179941c.postValue(new C63446c(cVar.f256794b, 4, (LinkedList) null, (C51059r51) null, (C50585ns0) null, cVar.f256795c, 28, (C8480h) null));
                String str5 = this.f179949a.f179940b;
                Log.m105924i(str5, "[pushOrCancelPromote] id:" + this.f179950b.f140705d + ", promoting:" + this.f179950b.f140708g + ",errCode:" + cVar.f256794b);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rj1.b$d */
    public static final class C63445d<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C63441b f179951a;

        public C63445d(C63441b bVar) {
            this.f179951a = bVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C63441b bVar = this.f179951a;
                LinkedList<C51059r51> linkedList = ((C50585ns0) cVar.f256796d).f138743d;
                C87412m.m108593f(linkedList, "it.resp.promote_info_list");
                bVar.f179942d = linkedList;
                this.f179951a.f179941c.postValue(new C63446c(cVar.f256794b, 1, new LinkedList(this.f179951a.f179942d), (C51059r51) null, (C50585ns0) cVar.f256796d, (String) null, 32, (C8480h) null));
            } else {
                this.f179951a.f179941c.postValue(new C63446c(cVar.f256794b, 1, (LinkedList) null, (C51059r51) null, (C50585ns0) null, cVar.f256795c, 28, (C8480h) null));
            }
            return C13598b0.f38549a;
        }
    }

    public C63441b(Context context) {
        C87412m.m108594g(context, "context");
        this.f179939a = context;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: pe3.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r4v6, types: [pe3.b] */
    /* JADX WARNING: type inference failed for: r4v9, types: [pe3.b] */
    /* JADX WARNING: type inference failed for: r4v11, types: [pe3.b] */
    /* JADX WARNING: type inference failed for: r4v15, types: [pe3.b] */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f0, code lost:
        if (r0 != 3) goto L_0x011a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x012a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo88309a(te3.C64699s51 r18, java.lang.Boolean r19) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            java.lang.String r0 = "info"
            gy3.C87412m.m108594g(r2, r0)
            java.util.LinkedList<te3.r51> r0 = r1.f179942d
            java.lang.String r3 = ""
            r4 = 2
            r5 = 3
            r6 = 0
            r7 = 0
            r8 = 1
            if (r0 == 0) goto L_0x00e4
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x0031
            java.lang.Object r9 = r0.next()
            r10 = r9
            te3.r51 r10 = (te3.C51059r51) r10
            int r10 = r10.f140706e
            int r11 = r2.f185341d
            if (r10 != r11) goto L_0x002d
            r10 = 1
            goto L_0x002e
        L_0x002d:
            r10 = 0
        L_0x002e:
            if (r10 == 0) goto L_0x0018
            goto L_0x0032
        L_0x0031:
            r9 = r6
        L_0x0032:
            te3.r51 r9 = (te3.C51059r51) r9
            if (r9 == 0) goto L_0x00e4
            int r0 = r9.f140706e
            if (r0 == r5) goto L_0x00e2
            r10 = 13
            if (r0 != r10) goto L_0x0040
            goto L_0x00e2
        L_0x0040:
            java.lang.String r10 = "safeParser"
            if (r0 != r8) goto L_0x0099
            pe1.c<java.lang.Integer> r0 = gg1.C32444a.f86128b2
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r8) goto L_0x00e2
            te3.d51 r11 = new te3.d51
            r11.<init>()
            pe3.b r0 = r9.f140707f
            if (r0 == 0) goto L_0x0060
            byte[] r0 = r0.mo123703f()
            goto L_0x0061
        L_0x0060:
            r0 = r6
        L_0x0061:
            if (r0 != 0) goto L_0x0064
            goto L_0x0071
        L_0x0064:
            r11.parseFrom(r0)     // Catch:{ Exception -> 0x0068 }
            goto L_0x0071
        L_0x0068:
            r0 = move-exception
            r9 = r0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r7] = r9
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r10, r3, r0)
        L_0x0071:
            te3.d51 r9 = new te3.d51
            r9.<init>()
            pe3.b r0 = r2.f185343f
            if (r0 == 0) goto L_0x007f
            byte[] r0 = r0.mo123703f()
            goto L_0x0080
        L_0x007f:
            r0 = r6
        L_0x0080:
            if (r0 != 0) goto L_0x0083
            goto L_0x0090
        L_0x0083:
            r9.parseFrom(r0)     // Catch:{ Exception -> 0x0087 }
            goto L_0x0090
        L_0x0087:
            r0 = move-exception
            r12 = r0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r7] = r12
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r10, r3, r0)
        L_0x0090:
            java.lang.String r0 = r11.f132122h
            java.lang.String r9 = r9.f132122h
            boolean r0 = gy3.C87412m.m108589b(r0, r9)
            goto L_0x00e5
        L_0x0099:
            if (r0 != r4) goto L_0x00e4
            te3.t51 r11 = new te3.t51
            r11.<init>()
            pe3.b r0 = r9.f140707f
            if (r0 == 0) goto L_0x00a9
            byte[] r0 = r0.mo123703f()
            goto L_0x00aa
        L_0x00a9:
            r0 = r6
        L_0x00aa:
            if (r0 != 0) goto L_0x00ad
            goto L_0x00ba
        L_0x00ad:
            r11.parseFrom(r0)     // Catch:{ Exception -> 0x00b1 }
            goto L_0x00ba
        L_0x00b1:
            r0 = move-exception
            r9 = r0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r7] = r9
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r10, r3, r0)
        L_0x00ba:
            te3.t51 r9 = new te3.t51
            r9.<init>()
            pe3.b r0 = r2.f185343f
            if (r0 == 0) goto L_0x00c8
            byte[] r0 = r0.mo123703f()
            goto L_0x00c9
        L_0x00c8:
            r0 = r6
        L_0x00c9:
            if (r0 != 0) goto L_0x00cc
            goto L_0x00d9
        L_0x00cc:
            r9.parseFrom(r0)     // Catch:{ Exception -> 0x00d0 }
            goto L_0x00d9
        L_0x00d0:
            r0 = move-exception
            r12 = r0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r7] = r12
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r10, r3, r0)
        L_0x00d9:
            java.lang.String r0 = r11.f185504g
            java.lang.String r9 = r9.f185504g
            boolean r0 = gy3.C87412m.m108589b(r0, r9)
            goto L_0x00e5
        L_0x00e2:
            r0 = 1
            goto L_0x00e5
        L_0x00e4:
            r0 = 0
        L_0x00e5:
            if (r0 == 0) goto L_0x012a
            int r0 = r2.f185341d
            r2 = 2131828594(0x7f111f72, float:1.9290133E38)
            if (r0 == r8) goto L_0x00fa
            if (r0 == r4) goto L_0x00f3
            if (r0 == r5) goto L_0x00fa
            goto L_0x011a
        L_0x00f3:
            android.content.Context r0 = r1.f179939a
            java.lang.String r3 = r0.getString(r2)
            goto L_0x011a
        L_0x00fa:
            gg1.a r0 = gg1.C32444a.f86121a
            pe1.c<java.lang.Integer> r0 = gg1.C32444a.f86128b2
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r8) goto L_0x0111
            android.content.Context r0 = r1.f179939a
            java.lang.String r3 = r0.getString(r2)
            goto L_0x011a
        L_0x0111:
            android.content.Context r0 = r1.f179939a
            r2 = 2131828590(0x7f111f6e, float:1.9290125E38)
            java.lang.String r3 = r0.getString(r2)
        L_0x011a:
            java.lang.String r0 = "when(info.type){\n       …          }\n            }"
            gy3.C87412m.m108593f(r3, r0)
            android.content.Context r0 = r1.f179939a
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r3, (int) r7)
            r0.show()
            return
        L_0x012a:
            qg1.s r0 = new qg1.s
            int r3 = qg1.C47833s.f128404u
            rp1.a r3 = r1.f179943e
            if (r3 == 0) goto L_0x01fb
            fj1.b r3 = r3.mo87856S2()
            java.lang.Class<cl1.u> r7 = cl1.C55001u.class
            java.lang.String r9 = "liveData"
            gy3.C87412m.m108594g(r3, r9)
            androidx.lifecycle.i0 r9 = r3.mo71262a(r7)
            cl1.u r9 = (cl1.C55001u) r9
            long r11 = r9.f154416j
            androidx.lifecycle.i0 r3 = r3.mo71262a(r7)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.f154420q
            long r13 = r3.f182392d
            r15 = 1
            int r3 = r2.f185341d
            if (r3 == r8) goto L_0x01ba
            if (r3 == r4) goto L_0x0195
            if (r3 == r5) goto L_0x0182
            r4 = 7
            if (r3 == r4) goto L_0x015d
            goto L_0x01e1
        L_0x015d:
            te3.is0 r3 = new te3.is0
            r3.<init>()
            int r4 = r2.f185341d
            r3.f183732d = r4
            te3.w51 r4 = new te3.w51
            r4.<init>()
            pe3.b r5 = r2.f185343f
            if (r5 == 0) goto L_0x0173
            byte[] r6 = r5.mo123703f()
        L_0x0173:
            r4.parseFrom(r6)
            r3.f183735g = r4
            byte[] r3 = r3.toByteArray()
            pe3.b r4 = new pe3.b
            r4.<init>(r3)
            goto L_0x01e0
        L_0x0182:
            te3.is0 r3 = new te3.is0
            r3.<init>()
            int r4 = r2.f185341d
            r3.f183732d = r4
            byte[] r3 = r3.toByteArray()
            pe3.b r4 = new pe3.b
            r4.<init>(r3)
            goto L_0x01e0
        L_0x0195:
            te3.is0 r3 = new te3.is0
            r3.<init>()
            int r4 = r2.f185341d
            r3.f183732d = r4
            te3.t51 r4 = new te3.t51
            r4.<init>()
            pe3.b r5 = r2.f185343f
            if (r5 == 0) goto L_0x01ab
            byte[] r6 = r5.mo123703f()
        L_0x01ab:
            r4.parseFrom(r6)
            r3.f183734f = r4
            byte[] r3 = r3.toByteArray()
            pe3.b r4 = new pe3.b
            r4.<init>(r3)
            goto L_0x01e0
        L_0x01ba:
            te3.is0 r3 = new te3.is0
            r3.<init>()
            int r4 = r2.f185341d
            r3.f183732d = r4
            te3.d51 r4 = new te3.d51
            r4.<init>()
            pe3.b r5 = r2.f185343f
            if (r5 == 0) goto L_0x01d0
            byte[] r6 = r5.mo123703f()
        L_0x01d0:
            r4.parseFrom(r6)
            java.lang.String r4 = r4.f132122h
            r3.f183733e = r4
            byte[] r3 = r3.toByteArray()
            pe3.b r4 = new pe3.b
            r4.<init>(r3)
        L_0x01e0:
            r6 = r4
        L_0x01e1:
            r16 = r6
            qg1.s$a r3 = new qg1.s$a
            r10 = r3
            r10.<init>(r11, r13, r15, r16)
            r0.<init>(r3)
            nr3.e r0 = r0.mo9225i()
            rj1.b$a r3 = new rj1.b$a
            r4 = r19
            r3.<init>(r4, r1, r2)
            r0.mo123420E(r3)
            return
        L_0x01fb:
            java.lang.String r0 = "presenter"
            gy3.C87412m.m108603p(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rj1.C63441b.mo88309a(te3.s51, java.lang.Boolean):void");
    }

    /* renamed from: b */
    public void mo88310b(C51059r51 r512) {
        C87412m.m108594g(r512, "info");
        int i = C47833s.f128404u;
        C63486a aVar = this.f179943e;
        if (aVar != null) {
            C45795b S2 = aVar.mo87856S2();
            Class cls = C55001u.class;
            C87412m.m108594g(S2, "liveData");
            long j = ((C55001u) S2.mo71262a(cls)).f154416j;
            long j2 = ((C55001u) S2.mo71262a(cls)).f154420q.f182392d;
            C51291ss0 ss02 = new C51291ss0();
            ss02.f141714d = r512.f140705d;
            C13598b0 b0Var = C13598b0.f38549a;
            new C47833s(new C47833s.C47834a(j, j2, 2, new C89349b(ss02.toByteArray()))).mo9225i().mo123420E(new C63443b(this, r512));
            return;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: c */
    public void mo88311c(Context context, C51059r51 r512) {
        Class cls = C55001u.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(r512, "item");
        C63486a aVar = this.f179943e;
        if (aVar != null) {
            long j = ((C55001u) aVar.mo87856S2().mo71262a(cls)).f154416j;
            C63486a aVar2 = this.f179943e;
            if (aVar2 != null) {
                C47835w wVar = new C47835w(j, ((C55001u) aVar2.mo87856S2().mo71262a(cls)).f154420q.f182392d, r512, 1);
                wVar.mo85582k(context, context.getResources().getString(C0966R.string.ett), 500);
                wVar.mo9225i().mo123420E(new C63444c(this, r512));
                return;
            }
            C87412m.m108603p("presenter");
            throw null;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: d */
    public void mo88312d() {
        Class cls = C55001u.class;
        C63486a aVar = this.f179943e;
        if (aVar != null) {
            long j = ((C55001u) aVar.mo87856S2().mo71262a(cls)).f154416j;
            C63486a aVar2 = this.f179943e;
            if (aVar2 != null) {
                new C12229q(j, ((C55001u) aVar2.mo87856S2().mo71262a(cls)).f154420q.f182392d).mo9225i().mo123420E(new C63445d(this));
            } else {
                C87412m.m108603p("presenter");
                throw null;
            }
        } else {
            C87412m.m108603p("presenter");
            throw null;
        }
    }
}
