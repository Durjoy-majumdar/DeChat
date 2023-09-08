package mh0;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C75569c4;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C24564k0;
import gy3.C87412m;
import i40.C98597b;
import i40.C98598e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p1086ro.C101415b;
import p158gt.C59701t;
import p158gt.C98200b0;
import p434ig.C98671a;
import p434ig.C98674g;
import p434ig.C98680m;
import p548hg.C76165c;
import p548hg.C98450d;
import p823sg.C90193h;
import ph0.C100793b;
import qg2.C101146j;
import sx3.C64186f0;
import sx3.C64197v;
import te3.C101834rc0;
import te3.C101841sc0;
import th0.C101888l;
import z04.C119027c;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: mh0.d */
public final class C99864d extends C98598e implements C98450d {
    /* renamed from: DG */
    public void mo137791DG(int i, String str, List<C98450d.C59882b> list) {
        int i2;
        C87412m.m108594g(str, "toUserName");
        C87412m.m108594g(list, "mixMediaList");
        C98200b0 b0Var = new C98200b0();
        b0Var.f287935i = new int[list.size()];
        b0Var.f287927a = str;
        int i3 = 0;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C98450d.C59882b) it.next()).f170951b) {
                        i2 = 1;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        i2 = 0;
        b0Var.f287930d = i2 ^ 1;
        for (T next : list) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                C98450d.C59882b bVar = (C98450d.C59882b) next;
                C98450d.C59881a aVar = bVar.f170953d;
                if (aVar == C98450d.C59881a.TYPE_IMG) {
                    b0Var.f287931e.add(bVar.f170950a);
                    b0Var.f287935i[i3] = 1;
                } else if (aVar == C98450d.C59881a.TYPE_VIDEO) {
                    b0Var.f287932f.add(bVar.f170950a);
                    ((ArrayList) b0Var.f287934h).add(Integer.valueOf(bVar.f170952c));
                    b0Var.f287935i[i3] = 2;
                }
                b0Var.f287933g.add(bVar.f170950a);
                i3 = i4;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        new C100793b().mo140258e(b0Var, (C59701t) null);
    }

    public void Eu0(List<String> list, List<String> list2, List<String> list3, int[] iArr, String str, int i, boolean z, C59701t tVar) {
        C87412m.m108594g(str, "toUserName");
        C98200b0 b0Var = new C98200b0();
        if (!C24564k0.m30743g(list)) {
            list = null;
        }
        if (list == null) {
            list = C64186f0.f181907d;
        }
        List<String> b = C24564k0.m30738b(list);
        C87412m.m108594g(b, "<set-?>");
        b0Var.f287931e = b;
        if (!C24564k0.m30743g(list2)) {
            list2 = null;
        }
        if (list2 == null) {
            list2 = C64186f0.f181907d;
        }
        List<String> b2 = C24564k0.m30738b(list2);
        C87412m.m108594g(b2, "<set-?>");
        b0Var.f287932f = b2;
        if (!C24564k0.m30743g(list3)) {
            list3 = null;
        }
        if (list3 == null) {
            list3 = C64186f0.f181907d;
        }
        List<String> b3 = C24564k0.m30738b(list3);
        C87412m.m108594g(b3, "<set-?>");
        b0Var.f287933g = b3;
        if (iArr == null) {
            iArr = new int[0];
        }
        b0Var.f287935i = iArr;
        b0Var.f287927a = str;
        b0Var.f287928b = i;
        b0Var.f287930d = z ^ true ? 1 : 0;
        new C100793b().mo140258e(b0Var, tVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ee  */
    /* renamed from: FC */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo137793FC(android.content.Context r9, p434ig.C98674g r10) {
        /*
            r8 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "albumInfoItem"
            gy3.C87412m.m108594g(r10, r0)
            java.util.List r0 = r10.mo55348A()
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x001d
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x001d
        L_0x001b:
            r0 = 1
            goto L_0x0039
        L_0x001d:
            java.util.Iterator r0 = r0.iterator()
        L_0x0021:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x001b
            java.lang.Object r1 = r0.next()
            ig.d r1 = (p434ig.C98672d) r1
            int r1 = r1.mo55274P()
            if (r1 != r2) goto L_0x0035
            r1 = 1
            goto L_0x0036
        L_0x0035:
            r1 = 0
        L_0x0036:
            if (r1 != 0) goto L_0x0021
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x007d
            r0 = 2131823490(0x7f110b82, float:1.9279781E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.util.List r10 = r10.mo55348A()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x004d:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L_0x0069
            java.lang.Object r6 = r10.next()
            r7 = r6
            ig.d r7 = (p434ig.C98672d) r7
            int r7 = r7.mo55274P()
            if (r7 != r2) goto L_0x0062
            r7 = 1
            goto L_0x0063
        L_0x0062:
            r7 = 0
        L_0x0063:
            if (r7 == 0) goto L_0x004d
            r5.add(r6)
            goto L_0x004d
        L_0x0069:
            int r10 = r5.size()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r1[r3] = r10
            java.lang.String r9 = r9.getString(r0, r1)
            java.lang.String r10 = "context.getString(R.stri…FAV_DATA_TYPE_IMG }.size)"
            gy3.C87412m.m108593f(r9, r10)
            return r9
        L_0x007d:
            java.util.List r0 = r10.mo55348A()
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 4
            if (r1 == 0) goto L_0x008e
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x008e
        L_0x008c:
            r0 = 1
            goto L_0x00aa
        L_0x008e:
            java.util.Iterator r0 = r0.iterator()
        L_0x0092:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x008c
            java.lang.Object r1 = r0.next()
            ig.d r1 = (p434ig.C98672d) r1
            int r1 = r1.mo55274P()
            if (r1 != r2) goto L_0x00a6
            r1 = 1
            goto L_0x00a7
        L_0x00a6:
            r1 = 0
        L_0x00a7:
            if (r1 != 0) goto L_0x0092
            r0 = 0
        L_0x00aa:
            if (r0 == 0) goto L_0x00ee
            r0 = 2131823491(0x7f110b83, float:1.9279783E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.util.List r10 = r10.mo55348A()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x00be:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L_0x00da
            java.lang.Object r6 = r10.next()
            r7 = r6
            ig.d r7 = (p434ig.C98672d) r7
            int r7 = r7.mo55274P()
            if (r7 != r2) goto L_0x00d3
            r7 = 1
            goto L_0x00d4
        L_0x00d3:
            r7 = 0
        L_0x00d4:
            if (r7 == 0) goto L_0x00be
            r5.add(r6)
            goto L_0x00be
        L_0x00da:
            int r10 = r5.size()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r1[r3] = r10
            java.lang.String r9 = r9.getString(r0, r1)
            java.lang.String r10 = "context.getString(R.stri…V_DATA_TYPE_VIDEO }.size)"
            gy3.C87412m.m108593f(r9, r10)
            return r9
        L_0x00ee:
            r0 = 2131823489(0x7f110b81, float:1.927978E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.util.List r10 = r10.mo55348A()
            int r10 = r10.size()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r1[r3] = r10
            java.lang.String r9 = r9.getString(r0, r1)
            java.lang.String r10 = "context.getString(R.stri…foItem.dataItemList.size)"
            gy3.C87412m.m108593f(r9, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mh0.C99864d.mo137793FC(android.content.Context, ig.g):java.lang.String");
    }

    /* renamed from: Ml */
    public String mo137794Ml(Context context, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "ac");
        C98671a aVar = new C98671a();
        aVar.mo141099d(str);
        C98674g gVar = new C98674g();
        gVar.mo141099d(aVar.f289309p);
        return mo137793FC(context, gVar);
    }

    /* renamed from: VP */
    public void mo137795VP(Context context, String str, C98674g gVar, C72963f4 f4Var) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "toUserName");
        C87412m.m108594g(gVar, "albumInfoAlbum");
        new C100793b().mo140259f(context, str, gVar, f4Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ee  */
    /* renamed from: XO */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo137796XO(android.content.Context r9, p434ig.C98680m r10) {
        /*
            r8 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "albumRecordInfo"
            gy3.C87412m.m108594g(r10, r0)
            java.util.List r0 = r10.mo138092A()
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x001d
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x001d
        L_0x001b:
            r0 = 1
            goto L_0x0039
        L_0x001d:
            java.util.Iterator r0 = r0.iterator()
        L_0x0021:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x001b
            java.lang.Object r1 = r0.next()
            ig.d r1 = (p434ig.C98672d) r1
            int r1 = r1.mo55274P()
            if (r1 != r2) goto L_0x0035
            r1 = 1
            goto L_0x0036
        L_0x0035:
            r1 = 0
        L_0x0036:
            if (r1 != 0) goto L_0x0021
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x007d
            r0 = 2131823490(0x7f110b82, float:1.9279781E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.util.List r10 = r10.mo138092A()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x004d:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L_0x0069
            java.lang.Object r6 = r10.next()
            r7 = r6
            ig.d r7 = (p434ig.C98672d) r7
            int r7 = r7.mo55274P()
            if (r7 != r2) goto L_0x0062
            r7 = 1
            goto L_0x0063
        L_0x0062:
            r7 = 0
        L_0x0063:
            if (r7 == 0) goto L_0x004d
            r5.add(r6)
            goto L_0x004d
        L_0x0069:
            int r10 = r5.size()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r1[r3] = r10
            java.lang.String r9 = r9.getString(r0, r1)
            java.lang.String r10 = "context.getString(R.stri…FAV_DATA_TYPE_IMG }.size)"
            gy3.C87412m.m108593f(r9, r10)
            return r9
        L_0x007d:
            java.util.List r0 = r10.mo138092A()
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 4
            if (r1 == 0) goto L_0x008e
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x008e
        L_0x008c:
            r0 = 1
            goto L_0x00aa
        L_0x008e:
            java.util.Iterator r0 = r0.iterator()
        L_0x0092:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x008c
            java.lang.Object r1 = r0.next()
            ig.d r1 = (p434ig.C98672d) r1
            int r1 = r1.mo55274P()
            if (r1 != r2) goto L_0x00a6
            r1 = 1
            goto L_0x00a7
        L_0x00a6:
            r1 = 0
        L_0x00a7:
            if (r1 != 0) goto L_0x0092
            r0 = 0
        L_0x00aa:
            if (r0 == 0) goto L_0x00ee
            r0 = 2131823491(0x7f110b83, float:1.9279783E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.util.List r10 = r10.mo138092A()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x00be:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L_0x00da
            java.lang.Object r6 = r10.next()
            r7 = r6
            ig.d r7 = (p434ig.C98672d) r7
            int r7 = r7.mo55274P()
            if (r7 != r2) goto L_0x00d3
            r7 = 1
            goto L_0x00d4
        L_0x00d3:
            r7 = 0
        L_0x00d4:
            if (r7 == 0) goto L_0x00be
            r5.add(r6)
            goto L_0x00be
        L_0x00da:
            int r10 = r5.size()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r1[r3] = r10
            java.lang.String r9 = r9.getString(r0, r1)
            java.lang.String r10 = "context.getString(R.stri…V_DATA_TYPE_VIDEO }.size)"
            gy3.C87412m.m108593f(r9, r10)
            return r9
        L_0x00ee:
            r0 = 2131823489(0x7f110b81, float:1.927978E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.util.List r10 = r10.mo138092A()
            int r10 = r10.size()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r1[r3] = r10
            java.lang.String r9 = r9.getString(r0, r1)
            java.lang.String r10 = "context.getString(R.stri…rdInfo.dataItemList.size)"
            gy3.C87412m.m108593f(r9, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mh0.C99864d.mo137796XO(android.content.Context, ig.m):java.lang.String");
    }

    /* renamed from: al */
    public String mo137797al(Context context, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "ac");
        C98671a aVar = new C98671a();
        aVar.mo141099d(str);
        C98674g gVar = new C98674g();
        gVar.mo141099d(aVar.f289309p);
        return '[' + mo137793FC(context, gVar) + ']';
    }

    /* renamed from: ep */
    public boolean mo137798ep(String str) {
        return C101888l.f300029a.mo141352a(str);
    }

    public void es0(Context context, String str, long j) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "talker");
        C100793b bVar = new C100793b();
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(j);
        C98671a aVar = new C98671a();
        String content = b002.getContent();
        C87412m.m108593f(content, "originalMsgInfo.content");
        aVar.mo141099d(content);
        C98674g gVar = new C98674g();
        gVar.mo141099d(aVar.f289309p);
        bVar.mo140259f(context, str, gVar, b002);
    }

    /* renamed from: fg */
    public boolean mo137800fg(C101841sc0 sc02, DoFavoriteEvent doFavoriteEvent, C72963f4 f4Var) {
        C87412m.m108594g(sc02, "dataProtoItem");
        C87412m.m108594g(doFavoriteEvent, "favEvent");
        C87412m.m108594g(f4Var, "msg");
        C98674g gVar = new C98674g();
        String content = f4Var.getContent();
        C87412m.m108593f(content, "msg.content");
        gVar.mo141099d(content);
        C98680m mVar = new C98680m();
        mVar.mo138093B(gVar.f289364h);
        C101834rc0 rc02 = new C101834rc0();
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        rc02.mo141265u('[' + mo137793FC(context, gVar) + ']');
        rc02.mo141259o(C101146j.m132603l(f4Var));
        rc02.mo141229B(f4Var.mo108774y2());
        rc02.mo141260p(35);
        byte[] bytes = (rc02 + "35" + System.currentTimeMillis()).getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        rc02.mo141257m(C90193h.m112878f(bytes));
        rc02.mo141232F(true);
        rc02.mo141234H(mVar.mo141118z());
        rc02.f299296c1 = sc02;
        rc02.mo141263s(C101146j.m132605n(sc02.f299405d));
        rc02.mo141264t(C101146j.m132606o(sc02.f299405d));
        rc02.mo141230C(C75569c4.m90685r(f4Var.f230724G));
        rc02.mo141237K(f4Var.getMsgId());
        doFavoriteEvent.f264674d.f264676a.f298618f.add(rc02);
        return false;
    }

    public String km0(List<? extends C98450d.C59881a> list) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C98450d.C59881a aVar = C98450d.C59881a.TYPE_VIDEO;
        C98450d.C59881a aVar2 = C98450d.C59881a.TYPE_IMG;
        C87412m.m108594g(list, "mediaType");
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C98450d.C59881a) it.next()) == aVar2) {
                    z4 = true;
                    continue;
                } else {
                    z4 = false;
                    continue;
                }
                if (!z4) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            Context context = MMApplicationContext.getContext();
            Object[] objArr = new Object[1];
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                if (((C98450d.C59881a) next) == aVar2) {
                    arrayList.add(next);
                }
            }
            objArr[0] = Integer.valueOf(arrayList.size());
            String string = context.getString(C0966R.string.f360260ct3, objArr);
            C87412m.m108593f(string, "getContext().getString(R…ediaType.TYPE_IMG }.size)");
            return string;
        }
        if (!list.isEmpty()) {
            Iterator<T> it4 = list.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                if (((C98450d.C59881a) it4.next()) == aVar) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (!z3) {
                    z2 = false;
                    break;
                }
            }
        }
        z2 = true;
        if (z2) {
            Context context2 = MMApplicationContext.getContext();
            Object[] objArr2 = new Object[1];
            ArrayList arrayList2 = new ArrayList();
            for (T next2 : list) {
                if (((C98450d.C59881a) next2) == aVar) {
                    arrayList2.add(next2);
                }
            }
            objArr2[0] = Integer.valueOf(arrayList2.size());
            String string2 = context2.getString(C0966R.string.ct4, objArr2);
            C87412m.m108593f(string2, "getContext().getString(R…iaType.TYPE_VIDEO }.size)");
            return string2;
        }
        String string3 = MMApplicationContext.getContext().getString(C0966R.string.f360259ct2, new Object[]{Integer.valueOf(list.size())});
        C87412m.m108593f(string3, "getContext().getString(R…deo_desc, mediaType.size)");
        return string3;
    }

    public String m30(C98680m mVar) {
        C87412m.m108594g(mVar, "albumRecordInfo");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        sb.append(mo137796XO(context, mVar));
        sb.append(']');
        return sb.toString();
    }

    public void wx0(HashSet<Class<? extends C98597b>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        hashSet.add(C99895t.class);
        hashSet.add(C101415b.class);
        hashSet.add(C99865e0.class);
        hashSet.add(C76757u.class);
    }

    public void zx0() {
        ((C76165c) C86312j.m106911c(C76165c.class)).stop();
    }
}
