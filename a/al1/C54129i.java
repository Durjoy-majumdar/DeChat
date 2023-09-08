package al1;

import android.os.Bundle;
import bl3.C39818r;
import cj1.C54738b1;
import cl1.C54991o;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import com.tencent.xweb.file.XVFSFile;
import di0.C86299o;
import fe1.C8014g;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import pe3.C89349b;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64197v;
import te3.C50168kr0;
import te3.C50355m51;
import te3.C51395th0;
import te3.C51938x81;
import te3.C52153yq0;
import te3.C64347eq2;

/* renamed from: al1.i */
public final class C54129i {

    /* renamed from: l */
    public static HashMap<Integer, C86299o> f151984l = new HashMap<>();

    /* renamed from: m */
    public static int f151985m = CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;

    /* renamed from: a */
    public final String f151986a = ("FinderLiveDataModel@" + hashCode());

    /* renamed from: b */
    public int f151987b;

    /* renamed from: c */
    public C54131l f151988c;

    /* renamed from: d */
    public ArrayList<C54127h> f151989d = new ArrayList<>();

    /* renamed from: e */
    public ArrayList<C54127h> f151990e = new ArrayList<>();

    /* renamed from: f */
    public C54738b1 f151991f;

    /* renamed from: g */
    public int f151992g;

    /* renamed from: h */
    public HashMap<Long, String> f151993h = new HashMap<>();

    /* renamed from: i */
    public ArrayList<String> f151994i = new ArrayList<>();

    /* renamed from: j */
    public C50355m51 f151995j;

    /* renamed from: k */
    public Bundle f151996k;

    /* renamed from: a */
    public final int mo74923a(List<C54127h> list) {
        List<C54127h> d = mo74926d(this.f151990e, list == null ? new ArrayList<>() : list);
        this.f151990e.addAll(d);
        String str = this.f151986a;
        StringBuilder sb = new StringBuilder();
        sb.append("#appendLiveData remoteSize=");
        sb.append(list != null ? Integer.valueOf(list.size()) : null);
        sb.append(", after filter size ");
        LinkedList linkedList = (LinkedList) d;
        sb.append(linkedList.size());
        sb.append(", now liveDataList.size=");
        sb.append(this.f151990e.size());
        Log.m105924i(str, sb.toString());
        return linkedList.size();
    }

    /* renamed from: b */
    public final C54127h mo74924b() {
        int size = this.f151990e.size();
        int c = mo74925c();
        boolean z = false;
        if (c >= 0 && c < size) {
            z = true;
        }
        if (z) {
            return (C54127h) C110818d0.m150917O(this.f151990e, mo74925c());
        }
        return null;
    }

    /* renamed from: c */
    public final int mo74925c() {
        String str = this.f151986a;
        Log.m105924i(str, "get curPos:" + this.f151987b);
        return this.f151987b;
    }

    /* renamed from: d */
    public final List<C54127h> mo74926d(List<C54127h> list, List<C54127h> list2) {
        LinkedList linkedList = new LinkedList();
        for (C54127h hVar : list2) {
            Iterator<C54127h> it = list.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (it.next().mo76f(hVar) == 0) {
                    break;
                }
                i++;
            }
            Iterator it4 = linkedList.iterator();
            int i2 = 0;
            while (true) {
                if (!it4.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (((C54127h) it4.next()).mo76f(hVar) == 0) {
                    break;
                }
                i2++;
            }
            if (i == -1 && i2 == -1) {
                linkedList.add(hVar);
            }
        }
        return linkedList;
    }

    /* renamed from: e */
    public final void mo74927e(C54738b1 b1Var) {
        C54738b1 b1Var2 = b1Var;
        Class cls = C54991o.class;
        C87412m.m108594g(b1Var2, "finderLiveConfig");
        this.f151991f = b1Var2;
        this.f151992g = b1Var2.f153431t;
        this.f151993h = b1Var2.f153433v;
        this.f151994i = b1Var2.f153432u;
        this.f151996k = b1Var2.f153435x;
        mo74928f(b1Var2.f153420i);
        int i = b1Var2.f153421j;
        int i2 = b1Var2.f153422k;
        int i3 = b1Var2.f153425n;
        C50168kr0 kr02 = b1Var2.f153427p;
        FinderObject finderObject = b1Var2.f153429r;
        C51395th0 th02 = b1Var2.f153430s;
        int i4 = b1Var2.f153431t;
        String str = b1Var2.f153428q;
        C51938x81 x812 = b1Var2.f153434w;
        C13604l<Float, Float> X0 = ((C8014g) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C8014g.class)).mo9104X0();
        C54131l lVar = r13;
        C54131l lVar2 = new C54131l((C89349b) null, 0, (String) null, (C50168kr0) null, (FinderObject) null, 0, (String) null, 0, 0.0f, 0.0f, 0, 0, (String) null, (C51395th0) null, 0, (LinkedList) null, 0, (C51938x81) null, false, 524287, (C8480h) null);
        C54131l lVar3 = lVar;
        lVar3.f152029i = ((Number) X0.f38555d).floatValue();
        lVar3.f152030j = ((Number) X0.f38556e).floatValue();
        lVar3.f152028h = 7;
        lVar3.f152031k = i2;
        lVar3.f152026f = i;
        lVar3.f152032l = i3;
        lVar3.f152024d = kr02;
        lVar3.f152033m = str;
        lVar3.f152025e = finderObject;
        lVar3.f152034n = th02;
        lVar3.f152035o = i4;
        lVar3.f152038r = x812;
        this.f151988c = lVar3;
        ArrayList<LiveConfig> arrayList = b1Var2.f153423l;
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        for (LiveConfig hVar : arrayList) {
            arrayList2.add(new C54127h(hVar));
        }
        mo74929g(new ArrayList(arrayList2));
        Integer num = null;
        if (this.f151990e.size() > 0 && b1Var2.f153427p != null) {
            C52153yq0 yq02 = new C52153yq0();
            C50168kr0 kr03 = b1Var2.f153427p;
            yq02.f145458d = kr03 != null ? kr03.f136997d : 0;
            yq02.f145459e = kr03 != null ? kr03.f136999f : null;
            this.f151990e.get(0).f151981h = yq02;
            ((C54991o) this.f151990e.get(0).f151978e.mo71262a(cls)).f154344n3 = yq02;
            ((C54991o) this.f151990e.get(0).f151978e.mo71262a(cls)).f154200F2 = this.f151990e.get(0).f151977d.f157048F;
        }
        String str2 = this.f151986a;
        StringBuilder sb = new StringBuilder();
        sb.append("checkstreamparams parseLiveConfigList ");
        C54738b1 b1Var3 = this.f151991f;
        C64347eq2 eq22 = b1Var3 != null ? b1Var3.f153411A : null;
        if (eq22 != null) {
            num = Integer.valueOf(eq22.hashCode());
        }
        sb.append(num);
        Log.m105924i(str2, sb.toString());
    }

    /* renamed from: f */
    public final void mo74928f(int i) {
        this.f151987b = i;
        String str = this.f151986a;
        Log.m105924i(str, "set curPos :" + this.f151987b);
    }

    /* renamed from: g */
    public final void mo74929g(ArrayList<C54127h> arrayList) {
        C87412m.m108594g(arrayList, "value");
        this.f151990e = arrayList;
        this.f151989d.clear();
    }

    /* renamed from: h */
    public final String mo74930h(List<C54127h> list) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                sb.append("******" + i + XVFSFile.PATH_SEPARATOR_CHAR);
                sb.append(((C54127h) next).mo74919c());
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "sb.toString()");
        return sb4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FinderLiveDataModel(" + hashCode() + "):");
        sb.append("init pos:" + mo74925c() + ';');
        StringBuilder sb4 = new StringBuilder();
        sb4.append("loaderParams:tab:");
        C54131l lVar = this.f151988c;
        C89349b bVar = null;
        sb4.append(lVar != null ? Integer.valueOf(lVar.f152026f) : null);
        sb4.append(",objectId:");
        C54131l lVar2 = this.f151988c;
        sb4.append(lVar2 != null ? Long.valueOf(lVar2.f152022b) : null);
        sb4.append(",lastBuf is null:");
        C54131l lVar3 = this.f151988c;
        if (lVar3 != null) {
            bVar = lVar3.f152021a;
        }
        sb4.append(bVar == null);
        sb4.append(';');
        sb.append(sb4.toString());
        int size = this.f151990e.size();
        if (size <= 0) {
            sb.append("live data is empty");
            String sb5 = sb.toString();
            C87412m.m108593f(sb5, "msg.toString()");
            return sb5;
        }
        for (int i = 0; i < size; i++) {
            sb.append("live_" + i + XVFSFile.PATH_SEPARATOR_CHAR + this.f151990e.get(i));
        }
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "msg.toString()");
        return sb6;
    }
}
