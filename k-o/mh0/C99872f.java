package mh0;

import a14.C0000n0;
import a14.C53934p0;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.WCWebUpdater;
import di3.C7335d;
import di3.C86312j;
import f40.C86709a0;
import fd3.C97862e;
import fd3.C97866g;
import fd3.C97867h;
import fd3.C97872k;
import fy3.C32227p;
import gy3.C87412m;
import hd0.C98408n0;
import hd0.C98410o0;
import i40.C60247c;
import i40.C76285g;
import i40.C98597b;
import i40.C98598e;
import ic3.C98663a;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.ResultKt;
import nh0.C100114a;
import og2.C100338g;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p663qo.C101211h;
import p663qo.C101213l;
import p682rz.C101480j;
import p682rz.C101488s;
import p749xh.C102653l;
import p753xp.C102704b;
import p867wp.C102479b;
import ph0.C100792a;
import qg2.C101176x;
import qg2.C47838o;
import rh0.C101376a;
import rx3.C13598b0;
import sx3.C110818d0;
import wx3.C15601d;
import xc3.C102617c;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: mh0.f */
public class C99872f extends C101176x<C100114a> {

    /* renamed from: g */
    public final C98124g.C98125a f292644g = new C99873a(this);

    /* renamed from: mh0.f$a */
    public static final class C99873a implements C98124g.C98125a {

        /* renamed from: d */
        public final /* synthetic */ C99872f f292645d;

        /* renamed from: mh0.f$a$a */
        public static final class C99874a implements C47838o.C47839a {

            /* renamed from: a */
            public final /* synthetic */ C100114a f292646a;

            /* renamed from: b */
            public final /* synthetic */ C99872f f292647b;

            /* renamed from: c */
            public final /* synthetic */ C98121d f292648c;

            public C99874a(C100114a aVar, C99872f fVar, C98121d dVar) {
                this.f292646a = aVar;
                this.f292647b = fVar;
                this.f292648c = dVar;
            }

            /* renamed from: a */
            public final void mo72581a(String str, int i, int i2) {
                C39622i0 a;
                C39622i0 a2;
                Class<C60247c> cls = C60247c.class;
                Class cls2 = C101376a.class;
                Log.m105925i("MicroMsg.AlbumMsgCDNService", "summersafecdn NetSceneCheckMd5 callback [%d, %d], [%s]", Integer.valueOf(i), Integer.valueOf(i2), str);
                if (i == 4 && i2 == 102) {
                    Log.m105925i("MicroMsg.AlbumMsgCDNService", "summersafecdn NetSceneCheckMd5 MM_ERR_GET_AESKEY_FAILED old status[%d, %d, %d]", Integer.valueOf(this.f292646a.getStatus()), Integer.valueOf(this.f292646a.mo142343A2()), Integer.valueOf(this.f292646a.mo142345C2()));
                    this.f292646a.mo142360V2(0);
                    this.f292646a.mo142363Y2(0);
                    this.f292646a.mo142365d(0);
                    C100114a aVar = this.f292646a;
                    synchronized (C60247c.f171776h) {
                        C86709a0.m107523b().mo121108c();
                        if (cls.isAssignableFrom(cls2)) {
                            a2 = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls2);
                        } else {
                            throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                        }
                    }
                    aVar.updateToDB(((C101376a) a2).getDB(), true);
                    this.f292647b.mo139223g(this.f292646a, false);
                    return;
                }
                this.f292646a.mo142346H2(str);
                this.f292646a.mo142364a1(this.f292648c.field_fileId);
                C100114a aVar2 = this.f292646a;
                synchronized (C60247c.f171776h) {
                    C86709a0.m107523b().mo121108c();
                    if (cls.isAssignableFrom(cls2)) {
                        a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls2);
                    } else {
                        throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                    }
                }
                aVar2.updateToDB(((C101376a) a).getDB(), true);
                this.f292647b.mo140622e();
            }
        }

        public C99873a(C99872f fVar) {
            this.f292645d = fVar;
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            String str2 = str;
            int i2 = i;
            C98120c cVar2 = cVar;
            C98121d dVar2 = dVar;
            C87412m.m108594g(str2, "mediaId");
            Log.m105927v("MicroMsg.AlbumMsgCDNService", "cdn transfer callback, startRet[%d], mediaId[%s]", Integer.valueOf(i), str2);
            if (cVar2 != null) {
                Log.m105927v("MicroMsg.AlbumMsgCDNService", "cdn transfer callback, mediaid[%s], totallen[%d], offset[%d]", cVar2.f287607a, Long.valueOf(cVar2.field_toltalLength), Long.valueOf(cVar2.field_finishedLength));
            }
            if (i2 == -21006 || i2 == -21005) {
                this.f292645d.mo140622e();
                return 0;
            }
            SelectSql F2 = C102653l.m135584F2(str);
            C101376a.C101377a aVar = C101376a.f296957i;
            C100114a aVar2 = (C100114a) F2.singleQuery(aVar.mo140861a().getDB(), C100114a.class);
            if (aVar2 == null) {
                Log.m105929w("MicroMsg.AlbumMsgCDNService", "onCdnCallback info null, mediaId[%s]", str2);
                this.f292645d.mo140622e();
                return 0;
            }
            if (i2 != 0) {
                Log.m105929w("MicroMsg.AlbumMsgCDNService", "tran fail, startRet[%d], mediaId[%s], type[%d]", Integer.valueOf(i), str2, Integer.valueOf(aVar2.getType()));
                if (-5103059 == i2) {
                    aVar2.mo142365d(4);
                } else {
                    aVar2.mo142365d(3);
                }
                aVar2.mo142350L2(i2);
                aVar2.updateToDB(aVar.mo140861a().getDB(), true);
                this.f292645d.mo140622e();
            } else if (cVar2 != null) {
                aVar2.mo142360V2((int) cVar2.field_finishedLength);
                aVar2.mo142363Y2((int) cVar2.field_toltalLength);
                aVar2.mo142365d(1);
                aVar2.updateToDB(aVar.mo140861a().getDB(), true);
            } else if (dVar2 != null) {
                Object[] objArr = new Object[8];
                objArr[0] = Integer.valueOf(dVar2.field_retCode);
                objArr[1] = Integer.valueOf(dVar2.field_UploadHitCacheType);
                objArr[2] = Boolean.valueOf(z);
                objArr[3] = Boolean.valueOf(dVar2.field_exist_whencheck);
                objArr[4] = Util.secPrint(dVar2.field_aesKey);
                objArr[5] = dVar2.field_filemd5;
                objArr[6] = str2;
                objArr[7] = Boolean.valueOf(1 == aVar2.getType());
                Log.m105925i("MicroMsg.AlbumMsgCDNService", "summersafecdn cdnCallback upload attach by cdn, retCode:%d isHitCacheUpload: %d, onlyCheckExist[%b], exist[%b], aesKey[%s], md5[%s], mediaId:%s, isDownload:%b", objArr);
                int i3 = dVar2.field_retCode;
                if (i3 >= 0) {
                    aVar2.mo142365d(2);
                    if (1 == aVar2.getType()) {
                        C99872f fVar = this.f292645d;
                        String str3 = aVar2.getPath() + ".temp";
                        String path = aVar2.getPath();
                        C87412m.m108593f(path, "info.path");
                        fVar.getClass();
                        if (Util.isNullOrNil(str3) || Util.isNullOrNil(path)) {
                            Log.m105928w("MicroMsg.AlbumMsgCDNService", "do rename and copy file, but path error");
                        } else {
                            C86009m1 m1Var = new C86009m1(str3);
                            C86009m1 m1Var2 = new C86009m1(path);
                            if (m1Var.mo119967g()) {
                                Log.m105927v("MicroMsg.AlbumMsgCDNService", "rename file suc:%b, old:%s, new:%s", Boolean.valueOf(m1Var.mo119988y(m1Var2)), str3, m1Var2);
                            }
                        }
                        C102479b Bg = ((C102704b) C86312j.m106911c(C102704b.class)).mo138748Bg(aVar2.getPath(), 98, (String) null, (byte[]) null);
                        Log.m105919d("MicroMsg.AlbumMsgCDNService", "albumCheckDup %s ret:%s hitCache:%s deleteResult:%s copyResult:%s replaceResult:%s", aVar2.getPath(), Integer.valueOf(Bg.f301760a), Boolean.valueOf(Bg.f301761b), Boolean.FALSE, Boolean.valueOf(Bg.f301762c), Long.valueOf(Bg.f301763d));
                        C102653l.m135586l2(aVar2, true).execute(aVar.mo140861a().getDB());
                    } else {
                        Log.m105925i("MicroMsg.AlbumMsgCDNService", "transfer done, mediaid=%s, md5=%s, record_localId: " + aVar2.mo142385z2(), dVar2.f287609a, str2);
                        Log.m105919d("MicroMsg.AlbumMsgCDNService", "transfer done, completeInfo=%s", dVar2);
                        Log.m105919d("MicroMsg.AlbumMsgCDNService", "summersafecdn cdnCallback upload field_aesKey[%s], field_fileId[%s]", dVar2.field_aesKey, dVar2.field_fileId);
                        if (dVar.mo137409b()) {
                            Log.m105925i("MicroMsg.AlbumMsgCDNService", "summersafecdn isUploadBySafeCDNWithMD5 field_upload_by_safecdn[%b], field_UploadHitCacheType[%d], crc[%d], aeskey[%s], newmd5[%s]", Boolean.valueOf(dVar2.field_upload_by_safecdn), Integer.valueOf(dVar2.field_UploadHitCacheType), Integer.valueOf(dVar2.field_filecrc), dVar2.field_aesKey, dVar2.field_mp4identifymd5);
                            C86709a0.m107529k().f251779b.mo123460f(new C47838o(dVar2.field_fileId, dVar2.field_filemd5, dVar2.field_mp4identifymd5, dVar2.field_filecrc, new C99874a(aVar2, this.f292645d, dVar2)));
                            return 0;
                        }
                        aVar2.mo142346H2(dVar2.field_aesKey);
                        aVar2.mo142364a1(dVar2.field_fileId);
                        aVar2.updateToDB(aVar.mo140861a().getDB(), true);
                    }
                } else {
                    Log.m105921e("MicroMsg.AlbumMsgCDNService", "transfer error, mediaid=%s, retCode:%d", dVar2.f287609a, Integer.valueOf(i3));
                    if (-5103059 == dVar2.field_retCode) {
                        aVar2.mo142365d(4);
                    } else {
                        aVar2.mo142365d(3);
                    }
                    aVar2.mo142350L2(dVar2.field_retCode);
                    aVar2.updateToDB(aVar.mo140861a().getDB(), true);
                }
                this.f292645d.mo140622e();
            }
            return 0;
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(byteArrayOutputStream, "buff");
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(bArr, "inbuf");
            return null;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.album.AlbumMsgCdnService$doJob$1", mo125469f = "AlbumMsgCdnService.kt", mo125470l = {207}, mo125471m = "invokeSuspend")
    /* renamed from: mh0.f$b */
    public static final class C99875b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f292649d;

        /* renamed from: e */
        public /* synthetic */ Object f292650e;

        /* renamed from: f */
        public final /* synthetic */ C100114a f292651f;

        /* renamed from: g */
        public final /* synthetic */ C99872f f292652g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99875b(C100114a aVar, C99872f fVar, C15601d<? super C99875b> dVar) {
            super(2, dVar);
            this.f292651f = aVar;
            this.f292652g = fVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C99875b bVar = new C99875b(this.f292651f, this.f292652g, dVar);
            bVar.f292650e = obj;
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C99875b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C39622i0 a;
            C13598b0 b0Var;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f292649d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C0000n0 n0Var = (C0000n0) this.f292650e;
                C97867h hVar = new C97867h();
                hVar.f287089h = this.f292651f.mo142385z2();
                hVar.f287083b = 1;
                hVar.f287082a = 2;
                C100792a aVar2 = C100792a.f295260a;
                String o2 = this.f292651f.mo142372o2();
                C87412m.m108593f(o2, "info.dataId");
                String B2 = this.f292651f.mo142344B2();
                C87412m.m108593f(B2, "info.toUser");
                hVar.f287086e = aVar2.mo140252x(o2, B2, this.f292651f.mo142385z2(), 1);
                String o25 = this.f292651f.mo142372o2();
                C87412m.m108593f(o25, "info.dataId");
                String B22 = this.f292651f.mo142344B2();
                C87412m.m108593f(B22, "info.toUser");
                hVar.f287087f = aVar2.mo140247s(o25, B22, this.f292651f.mo142385z2());
                String o26 = this.f292651f.mo142372o2();
                String B23 = this.f292651f.mo142344B2();
                C87412m.m108593f(B23, "info.toUser");
                hVar.f287085d = aVar2.mo140240l(o26, "pic", B23, this.f292651f.mo142385z2(), 1);
                if (this.f292651f.mo142381v2()) {
                    hVar.f287082a = 1;
                } else {
                    String o27 = this.f292651f.mo142372o2();
                    String B24 = this.f292651f.mo142344B2();
                    C87412m.m108593f(B24, "info.toUser");
                    hVar.f287087f = aVar2.mo140240l(o27, "pic", B24, this.f292651f.mo142385z2(), 1);
                }
                this.f292651f.mo142353O2(hVar.f287082a);
                C7335d c = C86312j.m106911c(C102617c.class);
                C87412m.m108593f(c, "getService(ICGIParallelU…oaderService::class.java)");
                this.f292650e = n0Var;
                this.f292649d = 1;
                obj = ((C102617c) c).Sa0(hVar, MAlarmHandler.NEXT_FIRE_INTERVAL, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C0000n0 n0Var2 = (C0000n0) this.f292650e;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C97866g gVar = (C97866g) obj;
            if (gVar != null) {
                C100114a aVar3 = this.f292651f;
                C99872f fVar = this.f292652g;
                C97862e eVar = gVar.f287078a;
                if (eVar == C97862e.Success) {
                    C97872k.C97873a aVar4 = gVar.f287079b;
                    if (aVar4 != null) {
                        aVar3.mo142346H2(aVar4.f287110b);
                        aVar3.mo142364a1(aVar4.f287109a);
                        aVar3.mo142365d(2);
                        aVar3.mo142360V2((int) aVar4.f287112d);
                        aVar3.mo142363Y2((int) aVar4.f287112d);
                        Log.m105924i("MicroMsg.AlbumMsgCDNService", "[checkUseCgi]process img checkCdn success, ret: " + gVar.f287080c + ", uploadID: " + gVar.f287081d + ", mediaId:[" + aVar3.mo142384y2() + "], dataId:[" + aVar3.mo142372o2() + ']');
                        b0Var = C13598b0.f38549a;
                    } else {
                        b0Var = null;
                    }
                    if (b0Var == null) {
                        aVar3.mo142365d(3);
                    }
                    Log.m105924i("MicroMsg.AlbumMsgCDNService", "[checkUseCgi]process img checkCdn error, ret: " + gVar.f287080c + ", uploadID: " + gVar.f287081d + ", mediaId:[" + aVar3.mo142384y2() + "], dataId:[" + aVar3.mo142372o2() + ']');
                } else if (eVar == C97862e.StartFail || eVar == C97862e.Fail) {
                    aVar3.mo142365d(3);
                    Log.m105924i("MicroMsg.AlbumMsgCDNService", "[checkUseCgi]process img checkCdn error, ret: " + gVar.f287080c + ", uploadID: " + gVar.f287081d + ", mediaId:[" + aVar3.mo142384y2() + "], dataId:[" + aVar3.mo142372o2() + ']');
                }
                Class cls = C101376a.class;
                synchronized (C60247c.f171776h) {
                    C86709a0.m107523b().mo121108c();
                    if (C60247c.class.isAssignableFrom(cls)) {
                        a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
                    } else {
                        throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                    }
                }
                aVar3.updateToDB(((C101376a) a).getDB(), true);
                fVar.mo140622e();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: mh0.f$c */
    public static final class C99876c implements C101480j.C101481a {

        /* renamed from: a */
        public final /* synthetic */ C100114a f292653a;

        /* renamed from: b */
        public final /* synthetic */ C99872f f292654b;

        public C99876c(C100114a aVar, C99872f fVar) {
            this.f292653a = aVar;
            this.f292654b = fVar;
        }

        /* renamed from: a */
        public void mo139224a(List<Integer> list, List<String> list2, List<String> list3, List<Integer> list4) {
            ArrayList arrayList;
            C39622i0 a;
            C39622i0 a2;
            C39622i0 a3;
            C39622i0 a4;
            C39622i0 a5;
            Integer num;
            List<Integer> list5 = list;
            List<String> list6 = list2;
            List<String> list7 = list3;
            List<Integer> list8 = list4;
            Class<C60247c> cls = C60247c.class;
            Class cls2 = C101376a.class;
            Integer num2 = list5 != null ? (Integer) C110818d0.m150916N(list) : null;
            String str = list6 != null ? (String) C110818d0.m150916N(list2) : null;
            boolean z = false;
            this.f292653a.mo142349K2((long) ((list8 == null || (num = (Integer) C110818d0.m150916N(list4)) == null) ? 0 : num.intValue()));
            this.f292653a.mo142352N2(str);
            if (num2 != null && num2.intValue() == -50009) {
                this.f292653a.mo142365d(0);
                C100114a aVar = this.f292653a;
                synchronized (C60247c.f171776h) {
                    C86709a0.m107523b().mo121108c();
                    if (cls.isAssignableFrom(cls2)) {
                        a5 = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls2);
                    } else {
                        throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                    }
                }
                aVar.updateToDB(((C101376a) a5).getDB(), true);
                Log.m105924i("MicroMsg.AlbumMsgCDNService", "onImportFinish done, status wait, retList: " + list5 + ", fileNameList: " + list6 + ", importPathList: " + list7 + ", durationList: " + list8 + ", mediaId:[" + this.f292653a.mo142384y2() + "], dataId:[" + this.f292653a.mo142372o2() + ']');
                this.f292654b.mo140622e();
                return;
            }
            if (str == null || str.length() == 0) {
                Log.m105924i("MicroMsg.AlbumMsgCDNService", "onImportFinish error, fileName is empty, retList: " + list5 + ", fileNameList: " + list6 + ", importPathList: " + list7 + ", durationList: " + list8 + ", mediaId:[" + this.f292653a.mo142384y2() + "], dataId:[" + this.f292653a.mo142372o2() + ']');
                this.f292653a.mo142365d(3);
                C100114a aVar2 = this.f292653a;
                synchronized (C60247c.f171776h) {
                    C86709a0.m107523b().mo121108c();
                    if (cls.isAssignableFrom(cls2)) {
                        a4 = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls2);
                    } else {
                        throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                    }
                }
                aVar2.updateToDB(((C101376a) a4).getDB(), true);
                this.f292654b.mo140622e();
                return;
            }
            if (num2 != null && num2.intValue() == 0) {
                this.f292653a.mo142365d(1);
                C100114a aVar3 = this.f292653a;
                synchronized (C60247c.f171776h) {
                    C86709a0.m107523b().mo121108c();
                    if (cls.isAssignableFrom(cls2)) {
                        a3 = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls2);
                    } else {
                        throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                    }
                }
                aVar3.updateToDB(((C101376a) a3).getDB(), true);
            }
            if (list5 != null) {
                arrayList = new ArrayList();
                for (T next : list) {
                    int intValue = ((Number) next).intValue();
                    if (!(intValue == 1 || intValue == 2 || intValue == -50006 || intValue == 0)) {
                        arrayList.add(next);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null && (!arrayList.isEmpty())) {
                z = true;
            }
            if (z) {
                this.f292653a.mo142365d(3);
                C100114a aVar4 = this.f292653a;
                synchronized (C60247c.f171776h) {
                    C86709a0.m107523b().mo121108c();
                    if (cls.isAssignableFrom(cls2)) {
                        a2 = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls2);
                    } else {
                        throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                    }
                }
                aVar4.updateToDB(((C101376a) a2).getDB(), true);
                Log.m105924i("MicroMsg.AlbumMsgCDNService", "onImportFinish error, retList: " + list5 + ", fileNameList: " + list6 + ", importPathList: " + list7 + ", durationList: " + list8 + ", mediaId:[" + this.f292653a.mo142384y2() + "], dataId:[" + this.f292653a.mo142372o2() + ']');
                this.f292654b.mo140622e();
                return;
            }
            this.f292653a.mo142365d(1);
            C100114a aVar5 = this.f292653a;
            synchronized (C60247c.f171776h) {
                C86709a0.m107523b().mo121108c();
                if (cls.isAssignableFrom(cls2)) {
                    a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls2);
                } else {
                    throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
            }
            aVar5.updateToDB(((C101376a) a).getDB(), true);
            Log.m105924i("MicroMsg.AlbumMsgCDNService", "onImportFinish done, status tran, retList: " + list5 + ", fileNameList: " + list6 + ", importPathList: " + list7 + ", durationList: " + list8 + ", mediaId:[" + this.f292653a.mo142384y2() + "], dataId:[" + this.f292653a.mo142372o2() + ']');
        }

        /* renamed from: b */
        public void mo139225b(String str, C98663a aVar) {
            if (str == null || str.length() == 0) {
                Log.m105924i("MicroMsg.AlbumMsgCDNService", "onUploadFinish, fileName is empty");
                this.f292654b.mo140622e();
                return;
            }
            SelectSql E2 = C102653l.m135583E2(str);
            C101376a.C101377a aVar2 = C101376a.f296957i;
            C100114a aVar3 = (C100114a) E2.singleQuery(aVar2.mo140861a().getDB(), C100114a.class);
            if (aVar3 == null) {
                aVar3 = this.f292653a;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onUploadFinish, file name = ");
            sb.append(str);
            sb.append(", video msg = ");
            String str2 = null;
            sb.append(aVar != null ? aVar.mo141118z() : null);
            sb.append(", mediaId:[");
            sb.append(aVar3.mo142384y2());
            sb.append("], dataId:[");
            sb.append(aVar3.mo142372o2());
            sb.append(']');
            Log.m105924i("MicroMsg.AlbumMsgCDNService", sb.toString());
            aVar3.mo142365d(2);
            if (aVar != null) {
                str2 = aVar.mo141118z();
            }
            aVar3.mo142351M2(str2);
            aVar3.updateToDB(aVar2.mo140861a().getDB(), true);
            this.f292654b.mo140622e();
        }

        /* renamed from: c */
        public void mo139226c(String str) {
            if (str == null || str.length() == 0) {
                Log.m105924i("MicroMsg.AlbumMsgCDNService", "onUploadError, fileName is empty");
                this.f292654b.mo140622e();
                return;
            }
            SelectSql E2 = C102653l.m135583E2(str);
            C101376a.C101377a aVar = C101376a.f296957i;
            C100114a aVar2 = (C100114a) E2.singleQuery(aVar.mo140861a().getDB(), C100114a.class);
            if (aVar2 == null) {
                aVar2 = this.f292653a;
            }
            Log.m105924i("MicroMsg.AlbumMsgCDNService", "onUploadError, file name = " + str + ", mediaId:[" + aVar2.mo142384y2() + "], dataId:[" + aVar2.mo142372o2() + ']');
            aVar2.mo142365d(3);
            aVar2.updateToDB(aVar.mo140861a().getDB(), true);
            this.f292654b.mo140622e();
        }

        /* renamed from: d */
        public void mo139227d(String str, C98663a aVar) {
            if (aVar != null) {
                C100114a aVar2 = this.f292653a;
                if (C87412m.m108589b(str, aVar.mo55228m0())) {
                    String m0 = aVar.mo55228m0();
                    if (m0 == null) {
                        m0 = aVar2.mo142376s2();
                    }
                    SelectSql E2 = C102653l.m135583E2(m0);
                    C101376a.C101377a aVar3 = C101376a.f296957i;
                    C100114a aVar4 = (C100114a) E2.singleQuery(aVar3.mo140861a().getDB(), C100114a.class);
                    if (aVar4 != null) {
                        aVar4.mo142351M2(aVar.mo141118z());
                    }
                    if (aVar4 != null) {
                        aVar4.mo142365d(1);
                    }
                    if (aVar4 != null) {
                        aVar4.updateToDB(aVar3.mo140861a().getDB(), true);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("onUploadProgress, file name = ");
                    sb.append(str);
                    sb.append(", video msg = ");
                    sb.append(aVar.mo141118z());
                    sb.append(", mediaId:[");
                    String str2 = null;
                    sb.append(aVar4 != null ? aVar4.mo142384y2() : null);
                    sb.append("], dataId:[");
                    if (aVar4 != null) {
                        str2 = aVar4.mo142372o2();
                    }
                    sb.append(str2);
                    sb.append(']');
                    Log.m105918d("MicroMsg.AlbumMsgCDNService", sb.toString());
                }
            }
        }
    }

    public C99872f() {
        super(3, 300000);
    }

    /* renamed from: a */
    public void mo139220a(C100338g gVar) {
        C39622i0 a;
        if (gVar == null) {
            Log.m105928w("MicroMsg.AlbumMsgCDNService", "cancelJob info null");
        } else if (gVar instanceof C102653l) {
            C102653l lVar = (C102653l) gVar;
            ((C101213l) C86312j.m106911c(C101213l.class)).gn0(lVar.mo142384y2());
            Class cls = C101376a.class;
            synchronized (C60247c.f171776h) {
                C86709a0.m107523b().mo121108c();
                if (C60247c.class.isAssignableFrom(cls)) {
                    a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
                } else {
                    throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
            }
            int execute = C102653l.m135586l2(lVar, false).execute(((C101376a) a).getDB());
            this.f296153e.remove(gVar);
            this.f296152d.remove(gVar.getKey());
            mo140622e();
            Log.m105924i("MicroMsg.AlbumMsgCDNService", "cancelJob result: " + execute + ", mediaId: " + lVar.mo142384y2());
        }
    }

    /* renamed from: b */
    public void mo139221b(C100338g gVar) {
        C87412m.m108594g(gVar, "info");
        if (gVar instanceof C100114a) {
            mo139223g((C100114a) gVar, true);
        }
    }

    /* renamed from: d */
    public List<C100114a> mo139222d() {
        C39622i0 a;
        C98597b.C60245a aVar = C98597b.f289091e;
        C7335d c = C86312j.m106911c(C99864d.class);
        C87412m.m108593f(c, "getService(AlbumFeatureService::class.java)");
        C99895t tVar = (C99895t) aVar.mo85231a((C98598e) c, C99895t.class);
        SingleTable singleTable = C102653l.f302517C;
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        Column column = C102653l.f302520F;
        ArrayList arrayList = new ArrayList();
        arrayList.add("3");
        arrayList.add(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
        arrayList.add("2");
        arrayList.add("-1");
        C13598b0 b0Var = C13598b0.f38549a;
        SelectSql build = C102653l.f302517C.select((List<? extends ISqlColumn>) linkedList).where(column.notInString(arrayList)).orderBy((List<? extends ISqlOrder>) linkedList2).groupBy((List<? extends Column>) linkedList3).build();
        Class cls = C101376a.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        List<C100114a> multiQuery = build.multiQuery(((C101376a) a).getDB(), C100114a.class);
        Log.m105919d("MicroMsg.AlbumMsgCDNService", "get to do jobs, size %d", Integer.valueOf(multiQuery.size()));
        return multiQuery;
    }

    /* renamed from: g */
    public final void mo139223g(C100114a aVar, boolean z) {
        C100114a aVar2 = aVar;
        Class cls = C101480j.class;
        Class cls2 = C101213l.class;
        Log.m105925i("MicroMsg.AlbumMsgCDNService", "summersafecdn doJob, md5:%s, dataId: " + aVar.mo142372o2() + ", imgId: " + aVar.mo142385z2() + ", mediaId:%s, fileType:%s, jobType[%d], jobStatus[%s]", aVar.mo142384y2(), aVar.mo142384y2(), Integer.valueOf(aVar.mo142378t2()), Integer.valueOf(aVar.getType()), Integer.valueOf(aVar.getStatus()));
        if (-1 != aVar.getStatus()) {
            SelectSql F2 = C102653l.m135584F2(aVar.mo142384y2());
            C101376a.C101377a aVar3 = C101376a.f296957i;
            if (((C100114a) F2.singleQuery(aVar3.mo140861a().getDB(), C100114a.class)) == null) {
                Log.m105924i("MicroMsg.AlbumMsgCDNService", "summersafecdn doJob cancel, because cdnInfo is not exist in db");
                mo140622e();
            } else if (aVar.mo142378t2() == 4) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(aVar.getPath());
                boolean v2 = aVar.mo142381v2();
                if (!arrayList.isEmpty()) {
                    C99876c cVar = new C99876c(aVar2, this);
                    C98408n0 f = ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137720f(aVar.mo142376s2());
                    String s2 = aVar.mo142376s2();
                    C87412m.m108593f(s2, "info.fileName");
                    if ((s2.length() > 0) && C86013q1.m106450k(aVar.getPath()) && f != null) {
                        Log.m105924i("MicroMsg.AlbumMsgCDNService", "resumeVideoUpload, video doJob TYPE_UPLOAD, fileName[" + aVar.mo142376s2() + "], msgLocalId[" + aVar.mo142385z2() + "], type[" + aVar.mo142378t2() + "], aesKey[" + aVar.mo142369m2() + "], fileId[" + aVar.mo142371o1() + "], mediaId:[" + aVar.mo142384y2() + "], dataId:[" + aVar.mo142372o2() + ']');
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(aVar.mo142376s2());
                        ((C101480j) C86312j.m106911c(cls)).mo140783Wn(aVar.mo142385z2(), arrayList2, cVar);
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("importVideoForUpload, video doJob TYPE_UPLOAD, fileName[");
                    sb.append(aVar.mo142376s2());
                    sb.append("], path:[");
                    sb.append(aVar.getPath());
                    sb.append("], videoInfoExist:[");
                    sb.append(f != null);
                    sb.append("] msgLocalId[");
                    sb.append(aVar.mo142385z2());
                    sb.append("], toUser[");
                    sb.append(aVar.mo142344B2());
                    sb.append("], type[");
                    sb.append(aVar.mo142378t2());
                    sb.append("], aesKey[");
                    sb.append(aVar.mo142369m2());
                    sb.append("], fileId[");
                    sb.append(aVar.mo142371o1());
                    sb.append("], mediaId:[");
                    sb.append(aVar.mo142384y2());
                    sb.append("], dataId:[");
                    sb.append(aVar.mo142372o2());
                    sb.append(']');
                    Log.m105924i("MicroMsg.AlbumMsgCDNService", sb.toString());
                    ((C101480j) C86312j.m106911c(cls)).mo140785jd(arrayList, true, v2, aVar.mo142385z2(), aVar.mo142344B2(), cVar);
                    return;
                }
                aVar2.mo142365d(3);
                aVar2.updateToDB(aVar3.mo140861a().getDB(), true);
                Log.m105924i("MicroMsg.AlbumMsgCDNService", "processVideo error, video path is empty, mediaId:[" + aVar.mo142384y2() + "], dataId:[" + aVar.mo142372o2() + ']');
                mo140622e();
            } else if (aVar.mo142370n2()) {
                C98597b.C60245a aVar4 = C98597b.f289091e;
                C7335d c = C86312j.m106911c(C99864d.class);
                C87412m.m108593f(c, "getService(AlbumFeatureService::class.java)");
                C98598e eVar = ((C76757u) aVar4.mo85231a((C98598e) c, C76757u.class)).f289092d;
                eVar.requireAccountInitialized();
                C76285g gVar = eVar.f289095f;
                LifecycleScope lifecycleScope = gVar != null ? gVar.f223480f : null;
                if (lifecycleScope != null) {
                    LifecycleScope.launchDefault$default(lifecycleScope, (C53934p0) null, new C99875b(aVar2, this, (C15601d<? super C99875b>) null), 1, (Object) null);
                }
            } else {
                C98124g gVar2 = new C98124g();
                gVar2.f287660d = "task_AlbumMsgCDNService";
                gVar2.f287662f = this.f292644g;
                gVar2.field_mediaId = aVar.mo142384y2();
                if (2 == aVar.getType()) {
                    gVar2.f287661e = true;
                    gVar2.field_priority = 2;
                    gVar2.field_needStorage = false;
                    gVar2.field_totalLen = aVar.mo142345C2();
                    gVar2.f287662f = this.f292644g;
                    gVar2.field_filemd5 = aVar.mo142375r2();
                    C100792a aVar5 = C100792a.f295260a;
                    String o2 = aVar.mo142372o2();
                    String B2 = aVar.mo142344B2();
                    C87412m.m108593f(B2, "info.toUser");
                    gVar2.field_fullpath = aVar5.mo140240l(o2, "pic", B2, aVar.mo142385z2(), 1);
                    if (!aVar.mo142381v2() || !aVar.mo142379u2()) {
                        String o25 = aVar.mo142372o2();
                        String B22 = aVar.mo142344B2();
                        C87412m.m108593f(B22, "info.toUser");
                        gVar2.field_midimgpath = aVar5.mo140240l(o25, "pic", B22, aVar.mo142385z2(), 1);
                    } else {
                        String o26 = aVar.mo142372o2();
                        C87412m.m108593f(o26, "info.dataId");
                        String B23 = aVar.mo142344B2();
                        C87412m.m108593f(B23, "info.toUser");
                        gVar2.field_midimgpath = aVar5.mo140247s(o26, B23, aVar.mo142385z2());
                    }
                    String o27 = aVar.mo142372o2();
                    C87412m.m108593f(o27, "info.dataId");
                    String B24 = aVar.mo142344B2();
                    C87412m.m108593f(B24, "info.toUser");
                    gVar2.field_thumbpath = aVar5.mo140252x(o27, B24, aVar.mo142385z2(), 1);
                    gVar2.field_fileType = aVar.mo142378t2();
                    gVar2.field_talker = aVar.mo142344B2();
                    gVar2.field_force_aeskeycdn = false;
                    gVar2.field_trysafecdn = true;
                    gVar2.field_enable_hitcheck = z;
                    String m2 = aVar.mo142369m2();
                    if (m2 == null || m2.length() == 0) {
                        gVar2.field_aesKey = ((C101211h) C86312j.m106911c(C101211h.class)).mo140293rN();
                    } else {
                        gVar2.field_aesKey = aVar.mo142369m2();
                    }
                    gVar2.field_fileId = aVar.mo142371o1();
                    Log.m105925i("MicroMsg.AlbumMsgCDNService", "summersafecdn img doJob TYPE_UPLOAD addSendTask field_force_aeskeycdn:%b, type[%d], aesKey[%s], fileId[%s], force_aeskeycdn[%b] trysafecdn[%b] enable_hitcheck[%b], mediaId:%s", Boolean.valueOf(gVar2.field_force_aeskeycdn), Integer.valueOf(gVar2.field_fileType), gVar2.field_aesKey, gVar2.field_fileId, Boolean.valueOf(gVar2.field_force_aeskeycdn), Boolean.valueOf(gVar2.field_trysafecdn), Boolean.valueOf(gVar2.field_enable_hitcheck), gVar2.field_mediaId);
                    ((C101213l) C86312j.m106911c(cls2)).if0(gVar2);
                } else {
                    gVar2.f287661e = false;
                    gVar2.field_priority = 2;
                    gVar2.field_needStorage = false;
                    gVar2.field_totalLen = aVar.mo142345C2();
                    gVar2.field_aesKey = aVar.mo142369m2();
                    gVar2.field_fileId = aVar.mo142371o1();
                    gVar2.f287662f = this.f292644g;
                    gVar2.field_fullpath = aVar.getPath() + ".temp";
                    gVar2.field_fileType = aVar.mo142378t2();
                    Log.m105925i("MicroMsg.AlbumMsgCDNService", "summersafecdn img doJob TYPE_DOWNLOAD addSendTask field_force_aeskeycdn:%b, type[%d], aesKey[%s], fileId[%s], force_aeskeycdn[%b] trysafecdn[%b] enable_hitcheck[%b], mediaId:%s", Boolean.valueOf(gVar2.field_force_aeskeycdn), Integer.valueOf(gVar2.field_fileType), gVar2.field_aesKey, gVar2.field_fileId, Boolean.valueOf(gVar2.field_force_aeskeycdn), Boolean.valueOf(gVar2.field_trysafecdn), Boolean.valueOf(gVar2.field_enable_hitcheck), gVar2.field_mediaId);
                    ((C101213l) C86312j.m106911c(cls2)).xf0(gVar2);
                }
                Log.m105919d("MicroMsg.AlbumMsgCDNService", "summersafecdn img doJob, isSend:%B totallen:%d, aseKey:%s, url[%s], fullPath[%s], fileType[%d], enable_hitcheck[%b], force_aeskeycdn[%b]", Boolean.valueOf(gVar2.f287661e), Integer.valueOf(gVar2.field_totalLen), gVar2.field_aesKey, gVar2.field_fileId, gVar2.field_fullpath, Integer.valueOf(gVar2.field_fileType), Boolean.valueOf(gVar2.field_enable_hitcheck), Boolean.valueOf(gVar2.field_force_aeskeycdn));
            }
        }
    }
}
