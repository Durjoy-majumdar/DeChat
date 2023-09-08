package vp1;

import android.util.Base64;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import je1.C9370r3;
import ob0.C11385n;
import ob0.C117747y;
import pc0.C11884l;
import pe3.C47465a;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import te3.C49583gn1;
import te3.C50194ky2;
import te3.C50327ly2;
import te3.C51427tp0;
import z04.C119027c;
import zc1.C66785b;

/* renamed from: vp1.d */
public final class C14927d implements C11385n {

    /* renamed from: e */
    public static final C14929b f40957e = new C14929b((C8480h) null);

    /* renamed from: f */
    public static final C13601g<C14927d> f40958f = C36568h.m40986b(C13602i.SYNCHRONIZED, C14928a.f40961d);

    /* renamed from: g */
    public static final String f40959g = "Finder.FinderBlackListCache";

    /* renamed from: d */
    public ArrayList<String> f40960d = new ArrayList<>();

    /* renamed from: vp1.d$a */
    public static final class C14928a extends C87413o implements C32224a<C14927d> {

        /* renamed from: d */
        public static final C14928a f40961d = new C14928a();

        public C14928a() {
            super(0);
        }

        public Object invoke() {
            return new C14927d();
        }
    }

    /* renamed from: vp1.d$b */
    public static final class C14929b {
        public C14929b(C8480h hVar) {
        }

        /* renamed from: a */
        public final C14927d mo13977a() {
            return C14927d.f40958f.getValue();
        }
    }

    /* renamed from: a */
    public final void mo13976a() {
        C86709a0.m107524d().mo123455a(3528, this);
        C86709a0.m107524d().mo123455a(3990, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2;
        Integer num = null;
        if (yVar instanceof C9370r3) {
            String str3 = f40959g;
            Log.m105924i(str3, "NetSceneFinderGetTagContact errType " + i + ", errCode " + i2 + ", errMsg " + str);
            if (i == 0 && i2 == 0) {
                C47465a aVar = ((C9370r3) yVar).f29261g.f127056b.f127083a;
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTagContactResp");
                LinkedList<C49583gn1> linkedList = ((C51427tp0) aVar).f142317d;
                StringBuilder sb = new StringBuilder();
                sb.append("refreshByGetTagContact size ");
                if (linkedList != null) {
                    num = Integer.valueOf(linkedList.size());
                }
                sb.append(num);
                Log.m105918d(str3, sb.toString());
                this.f40960d.clear();
                if (linkedList != null) {
                    for (C49583gn1 gn12 : linkedList) {
                        ArrayList<String> arrayList = this.f40960d;
                        FinderContact finderContact = gn12.f134140d;
                        if (finderContact == null || (str2 = finderContact.username) == null) {
                            str2 = "";
                        }
                        arrayList.add(str2);
                    }
                }
            }
        } else if (yVar instanceof C11884l) {
            String str4 = f40959g;
            Log.m105924i(str4, "NetSceneBatchSetBlackList errType " + i + ", errCode " + i2 + ", errMsg " + str);
            if (i == 0 && i2 == 0) {
                LinkedList<C50327ly2> linkedList2 = ((C11884l) yVar).mo11760j1().f138522e;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("refreshByBatchSetBlackList size ");
                if (linkedList2 != null) {
                    num = Integer.valueOf(linkedList2.size());
                }
                sb4.append(num);
                Log.m105918d(str4, sb4.toString());
                if (linkedList2 != null) {
                    for (C50327ly2 ly22 : linkedList2) {
                        C50194ky2 ky22 = ly22.f137716e;
                        int i3 = ky22.f137103f;
                        if (i3 != 1) {
                            if (i3 == 2 && this.f40960d.contains(ky22.f137101d)) {
                                String str5 = f40959g;
                                Log.m105918d(str5, "refreshByBatchSetBlackList del " + ly22.f137716e.f137101d);
                                this.f40960d.remove(ly22.f137716e.f137101d);
                            }
                        } else if (!this.f40960d.contains(ky22.f137101d)) {
                            String str6 = f40959g;
                            Log.m105918d(str6, "refreshByBatchSetBlackList add " + ly22.f137716e.f137101d);
                            this.f40960d.add(ly22.f137716e.f137101d);
                        }
                    }
                }
            }
        }
        String str7 = f40959g;
        Log.m105918d(str7, "saveCache,size = " + this.f40960d.size());
        String listToString = Util.listToString(this.f40960d, ",");
        String O5 = C66785b.f191882e.mo90662O5();
        Charset charset = C119027c.f356488a;
        byte[] bytes = O5.getBytes(charset);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(bytes, 0);
        C87412m.m108593f(encodeToString, "encodeToString(finderUse…eArray(), Base64.DEFAULT)");
        StringBuilder sb5 = new StringBuilder();
        sb5.append(C86709a0.m107535s().f251807e + "finder/black_list/");
        sb5.append(encodeToString);
        String sb6 = sb5.toString();
        C87412m.m108593f(listToString, "content");
        byte[] bytes2 = listToString.getBytes(charset);
        C87412m.m108593f(bytes2, "this as java.lang.String).getBytes(charset)");
        C86013q1.m106438T(sb6, bytes2, 0, bytes2.length);
    }
}
