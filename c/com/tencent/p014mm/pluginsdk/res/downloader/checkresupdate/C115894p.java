package com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate;

import android.database.SQLException;
import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C115913v;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.wcdb.database.SQLiteException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import pd3.C89346a;
import te3.C118473ut3;
import te3.C48908bu3;
import te3.C51297su;
import te3.C64245au3;
import te3.C64297cu3;
import u24.C90595a;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p */
public abstract class C115894p extends C117747y implements C1311n {

    /* renamed from: f */
    public static final SparseArray<C89346a> f347753f = new SparseArray<>();

    /* renamed from: d */
    public volatile C11385n f347754d;

    /* renamed from: e */
    public final List<C64297cu3> f347755e = new LinkedList();

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p$a */
    public class C115895a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List f347756d;

        public C115895a(List list) {
            this.f347756d = list;
        }

        public void run() {
            for (C48908bu3 bu32 : this.f347756d) {
                String k1 = C115894p.this.mo81282k1();
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(bu32.f131314d);
                objArr[1] = Util.isNullOrNil((List) bu32.f131315e) ? "null" : String.valueOf(bu32.f131315e.size());
                Log.m105925i(k1, "resType(%d) responses.size() = %s", objArr);
                if (!Util.isNullOrNil((List) bu32.f131315e)) {
                    Iterator<C118473ut3> it = bu32.f131315e.iterator();
                    while (it.hasNext()) {
                        C118473ut3 next = it.next();
                        C115894p pVar = C115894p.this;
                        int i = bu32.f131314d;
                        if (next == null) {
                            pVar.getClass();
                        } else {
                            Log.m105925i(pVar.mo81282k1(), "handleOperation --START--, resType = %d, subType = %d, res.Oper = %d", Integer.valueOf(i), Integer.valueOf(next.f354482d), Integer.valueOf(next.f354485g));
                            if (next.f354483e != null) {
                                Log.m105925i(pVar.mo81282k1(), "resource.Info.FileFlag %d ", Integer.valueOf(next.f354483e.f259946g));
                            }
                            int i2 = next.f354485g;
                            if (i2 == 0) {
                                Log.m105924i(pVar.mo81282k1(), "just do nothing");
                            } else {
                                if ((i2 & 1) > 0) {
                                    Log.m105924i(pVar.mo81282k1(), "do cache");
                                    CheckResUpdateHelper.m162971c().mo176404e(i, next, false);
                                }
                                if ((next.f354485g & 2) > 0) {
                                    Log.m105924i(pVar.mo81282k1(), "do decrypt");
                                    CheckResUpdateHelper.m162971c().mo176405f(i, next, false, false);
                                }
                                if ((next.f354485g & 4) > 0) {
                                    Log.m105924i(pVar.mo81282k1(), "do delete");
                                    CheckResUpdateHelper.m162971c().mo176406g(i, next, false);
                                }
                                Log.m105925i(pVar.mo81282k1(), "handleOperation --END--, resType = %d, subType = %d, res.Oper = %d", Integer.valueOf(i), Integer.valueOf(next.f354482d), Integer.valueOf(next.f354485g));
                            }
                        }
                    }
                }
            }
        }
    }

    public C115894p() {
        for (int i : C115890j.f347725e) {
            C89346a aVar = f347753f.get(i);
            if (aVar == null || !aVar.mo121562a(i)) {
                C64297cu3 cu32 = new C64297cu3();
                cu32.f182568d = i;
                this.f347755e.add(cu32);
            }
        }
    }

    public final int doScene(C114770g gVar, C11385n nVar) {
        this.f347754d = nVar;
        Log.m105918d(mo81282k1(), "before dispatch");
        try {
            for (C64297cu3 next : this.f347755e) {
                List<C115913v> a = C115885g.m163000a(next.f182568d);
                StringBuilder sb = new StringBuilder("{ ");
                for (C115913v next2 : a) {
                    int i = Util.getInt(next2.field_fileVersion, -1);
                    if (i >= 0) {
                        if (37 != next2.field_resType || !TextUtils.isEmpty(CheckResUpdateHelper.m162971c().mo176402b(next2.field_resType, next2.field_subType))) {
                            if (96 == next2.field_resType && TextUtils.isEmpty(CheckResUpdateHelper.m162971c().mo176402b(next2.field_resType, next2.field_subType))) {
                                CheckResUpdateHelper.m162971c().mo176403d(next2.field_resType, next2.field_subType, Util.getInt(next2.field_fileVersion, -1), false);
                            }
                            if (38 == next2.field_resType && next2.field_needRetry && TextUtils.isEmpty(CheckResUpdateHelper.m162971c().mo176402b(next2.field_resType, next2.field_subType))) {
                                Log.m105925i(mo81282k1(), "before doScene, res(%d.%d) needRetry and cachedFilePath isEmpty, skip add fileVersion into req", Integer.valueOf(next2.field_resType), Integer.valueOf(next2.field_subType));
                            } else if (83 != next2.field_resType || !TextUtils.isEmpty(CheckResUpdateHelper.m162971c().mo176402b(next2.field_resType, next2.field_subType))) {
                                C64245au3 au32 = new C64245au3();
                                au32.f182162d = next2.field_subType;
                                au32.f182163e = i;
                                au32.f182164f = next2.field_keyVersion;
                                au32.f182165g = next2.field_EID;
                                next.f182569e.add(au32);
                                if (BuildInfo.DEBUG) {
                                    if (C90595a.m113497a(new int[]{85, 87}, next2.field_resType) && TextUtils.isEmpty(CheckResUpdateHelper.m162971c().mo176402b(next2.field_resType, next2.field_subType))) {
                                        au32.f182163e = 0;
                                    }
                                }
                                sb.append(next2.field_subType);
                                sb.append(", ");
                            } else {
                                CheckResUpdateHelper.m162971c().mo176403d(next2.field_resType, next2.field_subType, Util.getInt(next2.field_fileVersion, -1), false);
                            }
                        } else {
                            byte[] bArr = C115890j.f347721a;
                            CheckResUpdateHelper.m162971c().mo176403d(next2.field_resType, next2.field_subType, Util.getInt(next2.field_fileVersion, -1), false);
                        }
                    }
                }
                sb.append(" }");
                Log.m105925i(mo81282k1(), "before doScene, add subtypeList(%s) in type(%d)", sb.toString(), Integer.valueOf(next.f182568d));
            }
            return dispatch(gVar, mo81281j1(), this);
        } catch (SQLException | SQLiteException e) {
            Log.m105921e(mo81282k1(), "doScene get SQLException(%s), return -1", e);
            return -1;
        }
    }

    /* renamed from: j1 */
    public abstract C114799u mo81281j1();

    /* renamed from: k1 */
    public abstract String mo81282k1();

    /* renamed from: l1 */
    public abstract C51297su mo81283l1(C114799u uVar);

    public final void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i(mo81282k1(), "onGYNetEnd errType(%d), errCode(%d)", Integer.valueOf(i2), Integer.valueOf(i3));
        if (i2 == 0 && i3 == 0) {
            C51297su l1 = mo81283l1(uVar);
            String k1 = mo81282k1();
            Object[] objArr = new Object[1];
            objArr[0] = Util.isNullOrNil((List) l1.f141753d) ? "null" : String.valueOf(l1.f141753d.size());
            Log.m105925i(k1, "response.Res.size() = %s", objArr);
            if (!Util.isNullOrNil((List) l1.f141753d)) {
                ThreadPool.post(new C115895a(l1.f141753d), "NetSceneCheckResUpdate-ResponseHandlingThread");
            }
        }
        this.f347754d.onSceneEnd(i2, i3, str, this);
    }
}
