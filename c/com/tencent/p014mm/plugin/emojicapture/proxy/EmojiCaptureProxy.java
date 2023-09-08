package com.tencent.p014mm.plugin.emojicapture.proxy;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.remoteservice.C96897a;
import com.tencent.p014mm.remoteservice.C96905d;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import di3.C86312j;
import ef3.C86513a;
import ef3.C86514b;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import i61.C98602h;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import lc3.C10485b;
import p156gj.C107835h0;
import p207nl.C89008j;
import p490dl.C97496s;
import p911ml.C99928o;
import qo3.C47883u;
import qo3.C77426q;
import uh3.C52577b;
import wh3.C102451g;
import x61.C102566a;
import z04.C112551y;
import z51.C39315g;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001>B\u0011\u0012\b\u0010;\u001a\u0004\u0018\u000106¢\u0006\u0004\b<\u0010=J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fJ\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u0010\u001a\u00020\tJ\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u0012\u001a\u00020\fJ\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0006J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0006H\u0007J\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0007J\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J\u0016\u0010!\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006J\u0018\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0007J\u0006\u0010#\u001a\u00020\tJ\b\u0010$\u001a\u00020\tH\u0007J\u0006\u0010%\u001a\u00020\u0004J\b\u0010&\u001a\u00020\u0004H\u0007J\u0012\u0010'\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010(\u001a\u00020\tH\u0007J\b\u0010)\u001a\u00020\tH\u0007J\b\u0010*\u001a\u00020\u0006H\u0007J\u001a\u0010.\u001a\u0004\u0018\u00010,2\u0006\u0010+\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0007J\b\u0010/\u001a\u00020\fH\u0007J\u0006\u00100\u001a\u00020\u0004J\b\u00101\u001a\u00020\u0004H\u0007J \u00105\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00132\u0006\u00104\u001a\u00020\tH\u0016R\u0019\u0010;\u001a\u0004\u0018\u0001068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006?"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emojicapture/proxy/EmojiCaptureProxy;", "Lcom/tencent/mm/remoteservice/a;", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "emojiInfo", "Lrx3/b0;", "createEmojiInfo", "", "key", "getDynamicConfig", "", "getEnableAutoRotate", "Lcom/tencent/mm/storage/y1$a;", "", "defva", "getInt", "getForbidLensId", "isSpringFestivalEnable", "getDeviceInfoConfig", "getUseGpuSegment", "Landroid/os/Bundle;", "bundle", "createEmojiInfoRemote", "md5", "deleteEmojiInfoByMd5", "deleteEmojiInfoByMd5Remote", "", "timeEnter", "deleteEmojiInfoByEnterTime", "deleteEmojiInfoByEnterTimeRemote", "updateEmojiInfo", "updateEmojiInfoRemote", "filePath", "mixingMd5", "postUploadTask", "postUploadTaskRemote", "useCPUCrop", "checkUseCPUCrop", "showImitateDialog", "showImitateDialogRemote", "getDynamicConfigInMM", "isSpringFestivalEnableRemote", "getEnableAutoRotateRemote", "getDeviceInfoConfigRemote", "_key", "", "defval", "getConfigStorage", "getUseGpuSegmentRemote", "getLensList", "getLensListRemote", "methodName", "data", "clientCall", "onCallback", "Lcom/tencent/mm/remoteservice/d;", "f", "Lcom/tencent/mm/remoteservice/d;", "getServerProxy", "()Lcom/tencent/mm/remoteservice/d;", "serverProxy", "<init>", "(Lcom/tencent/mm/remoteservice/d;)V", "a", "plugin-emojicapture_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emojicapture.proxy.EmojiCaptureProxy */
public final class EmojiCaptureProxy extends C96897a {

    /* renamed from: h */
    public static final C93278a f269148h = new C93278a((C8480h) null);

    /* renamed from: i */
    public static EmojiCaptureProxy f269149i = new EmojiCaptureProxy(new C96905d(MMApplicationContext.getContext()));

    /* renamed from: j */
    public static int f269150j;

    /* renamed from: n */
    public static boolean f269151n = true;

    /* renamed from: f */
    public final C96905d f269152f;

    /* renamed from: g */
    public final String f269153g = "result_key";

    /* renamed from: com.tencent.mm.plugin.emojicapture.proxy.EmojiCaptureProxy$a */
    public static final class C93278a {
        public C93278a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo127970a() {
            EmojiCaptureProxy.f269150j = EmojiCaptureProxy.f269150j + 1;
            if (EmojiCaptureProxy.f269151n) {
                EmojiCaptureProxy.f269151n = false;
                EmojiCaptureProxy.f269149i = new EmojiCaptureProxy(new C96905d(MMApplicationContext.getContext()));
            }
        }

        /* renamed from: b */
        public final void mo127971b() {
            EmojiCaptureProxy.f269150j = EmojiCaptureProxy.f269150j - 1;
            if (EmojiCaptureProxy.f269150j <= 0) {
                EmojiCaptureProxy.f269151n = true;
                C96905d serverProxy = EmojiCaptureProxy.f269149i.getServerProxy();
                if (serverProxy != null) {
                    serverProxy.mo135260d();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.proxy.EmojiCaptureProxy$b */
    public static final class C93279b implements C47883u {

        /* renamed from: a */
        public static final C93279b f269154a = new C93279b();

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
        }
    }

    public EmojiCaptureProxy(C96905d dVar) {
        super(dVar);
        this.f269152f = dVar;
    }

    /* renamed from: a */
    public Bundle mo127939a(Object... objArr) {
        C87412m.m108594g(objArr, "params");
        Bundle bundle = new Bundle();
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            C72994y1.C72995a aVar = objArr[i];
            if (aVar instanceof Bundle) {
                Bundle bundle2 = objArr[i];
                C87412m.m108592e(bundle2, "null cannot be cast to non-null type android.os.Bundle");
                bundle.putBundle("" + i, bundle2);
            } else if (aVar instanceof Parcelable) {
                Parcelable parcelable = objArr[i];
                C87412m.m108592e(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("" + i, parcelable);
            } else if (aVar instanceof C72994y1.C72995a) {
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.storage.ConstantsStorage.BusinessInfoKey");
                Log.m105925i("MicroMsg.EmojiCaptureProxy", "objectsToBundle: %s", Integer.valueOf(aVar.ordinal()));
                C72994y1.C72995a aVar2 = objArr[i];
                C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.storage.ConstantsStorage.BusinessInfoKey");
                bundle.putInt("" + i, aVar2.ordinal());
            } else {
                Serializable serializable = objArr[i];
                C87412m.m108592e(serializable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("" + i, serializable);
            }
        }
        return bundle;
    }

    @C86514b
    public final boolean checkUseCPUCrop() {
        Log.printInfoStack("MicroMsg.EmojiCaptureProxy", "checkUseCPUCrop", new Object[0]);
        return ((C102566a.C102567a) C102566a.f302002b.mo138761d()).f302005b;
    }

    public final void createEmojiInfo(EmojiInfo emojiInfo) {
        C87412m.m108594g(emojiInfo, "emojiInfo");
        Log.m105924i("MicroMsg.EmojiCaptureProxy", "createEmojiInfo: " + emojiInfo.getMd5());
        Bundle bundle = new Bundle();
        bundle.setClassLoader(EmojiInfo.class.getClassLoader());
        bundle.putParcelable("emoji", emojiInfo);
        REMOTE_CALL("createEmojiInfoRemote", bundle);
    }

    @C86514b
    public final void createEmojiInfoRemote(Bundle bundle) {
        Class cls = C39315g.class;
        C87412m.m108594g(bundle, "bundle");
        bundle.setClassLoader(EmojiInfo.class.getClassLoader());
        EmojiInfo emojiInfo = (EmojiInfo) bundle.getParcelable("emoji");
        StringBuilder sb = new StringBuilder();
        sb.append("createEmojiInfoRemote: ");
        sb.append(emojiInfo != null ? emojiInfo.getMd5() : null);
        Log.m105924i("MicroMsg.EmojiCaptureProxy", sb.toString());
        if (emojiInfo != null) {
            ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo138033r(emojiInfo.getMd5(), 0, 2, emojiInfo.field_size);
            ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo138019f(emojiInfo);
            ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo138029o(emojiInfo);
            return;
        }
        EmojiCaptureReporter.m117777c(31, 1);
        Log.m105924i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markProxyCallFailed");
        C115669n.INSTANCE.mo175912v(1012, 59);
    }

    public final void deleteEmojiInfoByEnterTime(long j) {
        Log.m105924i("MicroMsg.EmojiCaptureProxy", "deleteEmojiInfoByEnterTime: " + j);
        REMOTE_CALL("deleteEmojiInfoByEnterTimeRemote", Long.valueOf(j));
    }

    @C86514b
    public final void deleteEmojiInfoByEnterTimeRemote(long j) {
        Log.m105924i("MicroMsg.EmojiCaptureProxy", "deleteEmojiInfoByEnterTimeRemote: " + j);
        C102451g d = ((C39315g) C86312j.m106911c(C39315g.class)).mo58034O6().mo57717d();
        if (j == 0) {
            d.getClass();
            return;
        }
        ISQLiteDatabase iSQLiteDatabase = d.f301704d;
        if (iSQLiteDatabase.delete("EmojiInfo", "captureEnterTime=" + j, (String[]) null) > 0) {
            d.doNotify("event_update_emoji");
        }
    }

    public final void deleteEmojiInfoByMd5(String str) {
        C87412m.m108594g(str, "md5");
        Log.m105924i("MicroMsg.EmojiCaptureProxy", "deleteEmojiInfo: " + str);
        REMOTE_CALL("deleteEmojiInfoByMd5Remote", str);
    }

    @C86514b
    public final void deleteEmojiInfoByMd5Remote(String str) {
        C87412m.m108594g(str, "md5");
        Log.m105924i("MicroMsg.EmojiCaptureProxy", "deleteEmojiInfoByMd5Remote: " + str);
        ((C39315g) C86312j.m106911c(C39315g.class)).mo58034O6().mo57717d().mo142043TE(str);
    }

    @C86514b
    public final Object getConfigStorage(int i, Object obj) {
        C87412m.m108594g(obj, "defval");
        C72994y1.C72995a[] aVarArr = (C72994y1.C72995a[]) C72994y1.C72995a.class.getEnumConstants();
        C72994y1.C72995a aVar = aVarArr != null ? aVarArr[i] : null;
        Log.m105925i("MicroMsg.EmojiCaptureProxy", "getConfigStorage, %s %s", aVar, obj);
        return C86709a0.m107535s().mo121142i().mo119685f(aVar, obj);
    }

    public final String getDeviceInfoConfig() {
        Object REMOTE_CALL = REMOTE_CALL("getDeviceInfoConfigRemote", new Object[0]);
        if (REMOTE_CALL instanceof String) {
            return (String) REMOTE_CALL;
        }
        return null;
    }

    @C86514b
    public final String getDeviceInfoConfigRemote() {
        String Lo = C86709a0.m107535s().mo121144k().mo119656Lo(77825);
        C87412m.m108593f(Lo, "storage().getServerCfgIn…RINFO_SERVER_CONFIG_INFO)");
        return Lo;
    }

    public final String getDynamicConfig(String str) {
        C87412m.m108594g(str, "key");
        Object REMOTE_CALL = REMOTE_CALL("getDynamicConfigInMM", str);
        Log.m105925i("MicroMsg.EmojiCaptureProxy", "getDynamicConfig, key: %s, value: %s", str, REMOTE_CALL);
        return REMOTE_CALL == null ? "" : (String) REMOTE_CALL;
    }

    @C86514b
    public final String getDynamicConfigInMM(String str) {
        C87412m.m108594g(str, "key");
        return ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c(str);
    }

    public final boolean getEnableAutoRotate() {
        return C87412m.m108589b(REMOTE_CALL("getEnableAutoRotateRemote", new Object[0]), Boolean.TRUE);
    }

    @C86514b
    public final boolean getEnableAutoRotateRemote() {
        return C107835h0.f322845b.f322800O;
    }

    public final String getForbidLensId() {
        Object REMOTE_CALL = REMOTE_CALL("getDynamicConfigInMM", "EmotionSpringFestivalPendantBlockedIdList");
        if (REMOTE_CALL instanceof String) {
            return (String) REMOTE_CALL;
        }
        return null;
    }

    public final int getInt(C72994y1.C72995a aVar, int i) {
        C87412m.m108594g(aVar, "key");
        Log.m105925i("MicroMsg.EmojiCaptureProxy", "getInt %s %s", aVar, Integer.valueOf(i));
        Object REMOTE_CALL = REMOTE_CALL("getConfigStorage", aVar, Integer.valueOf(i));
        Log.m105925i("MicroMsg.EmojiCaptureProxy", "getInt %s %s and get val %s", aVar, Integer.valueOf(i), REMOTE_CALL);
        return REMOTE_CALL == null ? i : Util.getInt(REMOTE_CALL.toString(), i);
    }

    public final void getLensList() {
        REMOTE_CALL("getLensListRemote", new Object[0]);
    }

    @C86514b
    public final void getLensListRemote() {
        C86709a0.m107529k().f251779b.mo123460f(new C52577b());
    }

    public final C96905d getServerProxy() {
        return this.f269152f;
    }

    public final int getUseGpuSegment() {
        Object REMOTE_CALL = REMOTE_CALL("getUseGpuSegmentRemote", new Object[0]);
        if (REMOTE_CALL instanceof Integer) {
            return ((Number) REMOTE_CALL).intValue();
        }
        return 0;
    }

    @C86514b
    public final int getUseGpuSegmentRemote() {
        try {
            return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_emoji_segment_gpu, 1);
        } catch (Exception unused) {
            return 1;
        }
    }

    public final boolean isSpringFestivalEnable() {
        return C87412m.m108589b(REMOTE_CALL("isSpringFestivalEnableRemote", new Object[0]), Boolean.TRUE);
    }

    @C86514b
    public final boolean isSpringFestivalEnableRemote() {
        C97496s.m125615c();
        return false;
    }

    public void onCallback(String str, Bundle bundle, boolean z) {
        C87412m.m108594g(str, "methodName");
        C87412m.m108594g(bundle, "data");
        Log.m105925i("MicroMsg.EmojiCaptureProxy", "class:%s, method:%s, clientCall:%B", EmojiCaptureProxy.class.getName(), str, Boolean.valueOf(z));
        Method method = null;
        try {
            Method[] methods = EmojiCaptureProxy.class.getMethods();
            C87412m.m108593f(methods, "methods");
            int length = methods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Method method2 = methods[i];
                if (C112551y.m153809i(method2.getName(), str, true)) {
                    method = method2;
                    break;
                }
                i++;
            }
            if (method != null) {
                if (method.isAnnotationPresent(z ? C86513a.class : C86514b.class)) {
                    Object[] args = getArgs(bundle);
                    Object invoke = method.invoke(this, Arrays.copyOf(args, args.length));
                    if (C87412m.m108589b(method.getReturnType(), Void.TYPE)) {
                        return;
                    }
                    if (invoke instanceof Parcelable) {
                        bundle.putParcelable(this.f269153g, (Parcelable) invoke);
                        return;
                    }
                    if (C87412m.m108589b("getConfigStorage", str)) {
                        Log.m105925i("MicroMsg.EmojiCaptureProxy", "put result as Serializable: %s", (Serializable) invoke);
                    }
                    bundle.putSerializable(this.f269153g, (Serializable) invoke);
                }
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.EmojiCaptureProxy", "exception:%s", Util.stackTraceToString(e));
        }
    }

    public final void postUploadTask(String str, String str2) {
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        C87412m.m108594g(str2, "mixingMd5");
        Log.m105924i("MicroMsg.EmojiCaptureProxy", "postUploadTask: " + str + ", " + str2);
        REMOTE_CALL("postUploadTaskRemote", str, str2);
    }

    @C86514b
    public final void postUploadTaskRemote(String str, String str2) {
        Class cls = C39315g.class;
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        C87412m.m108594g(str2, "mixingMd5");
        Log.m105924i("MicroMsg.EmojiCaptureProxy", "postUploadTaskRemote: " + str + ", " + str2);
        int l = (int) C86013q1.m106451l(str);
        EmojiInfo G = ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo137999G(str2);
        if (G != null) {
            if (l <= 0) {
                G.field_captureUploadErrCode = 12;
                G.field_captureStatus = 2;
                ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo138019f(G);
                EmojiCaptureReporter.m117778d(G.field_captureEnterTime, 4, G.field_captureScene);
                return;
            }
            String q = C86013q1.m106456q(str);
            String str3 = C89008j.f256613a.mo123385d() + q;
            C86013q1.m106463x(str, str3);
            Log.m105924i("MicroMsg.EmojiCaptureProxy", "upload file " + str3 + " length is " + l);
            ((C39315g) C86312j.m106911c(cls)).mo58034O6().mo57717d().mo142043TE(G.getMd5());
            G.field_md5 = q;
            G.field_captureStatus = 3;
            G.field_size = (int) C86013q1.m106451l(str3);
            if (ImgUtil.isWXGF(str3)) {
                G.field_wxamMd5 = q;
                G.field_externMd5 = q;
            }
            ((C39315g) C86312j.m106911c(cls)).mo58034O6().mo57717d().mo142040Ow(G);
            C99928o.f292790a.mo139268a(G);
        }
    }

    public final void showImitateDialog() {
        REMOTE_CALL("showImitateDialogRemote", new Object[0]);
    }

    @C86514b
    public final void showImitateDialogRemote() {
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.bzk);
        C87412m.m108593f(string, "getContext().resources.g…g_first_open_imitate_msg)");
        C77426q qVar = new C77426q(MMApplicationContext.getContext());
        qVar.mo107595g(string);
        qVar.mo107601m(C0966R.string.bzj);
        qVar.mo107600l(C93279b.f269154a);
        qVar.mo107603o();
    }

    public final void updateEmojiInfo(EmojiInfo emojiInfo) {
        C87412m.m108594g(emojiInfo, "emojiInfo");
        Log.m105924i("MicroMsg.EmojiCaptureProxy", "updateEmojiInfo: " + emojiInfo.getMd5());
        Bundle bundle = new Bundle();
        bundle.setClassLoader(EmojiInfo.class.getClassLoader());
        bundle.putParcelable("emoji", emojiInfo);
        REMOTE_CALL("updateEmojiInfoRemote", bundle);
    }

    @C86514b
    public final void updateEmojiInfoRemote(Bundle bundle) {
        C87412m.m108594g(bundle, "bundle");
        bundle.setClassLoader(EmojiInfo.class.getClassLoader());
        EmojiInfo emojiInfo = (EmojiInfo) bundle.getParcelable("emoji");
        StringBuilder sb = new StringBuilder();
        sb.append("updateEmojiInfoRemote: ");
        sb.append(emojiInfo != null ? emojiInfo.getMd5() : null);
        Log.m105924i("MicroMsg.EmojiCaptureProxy", sb.toString());
        if (emojiInfo != null) {
            ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138019f(emojiInfo);
            return;
        }
        EmojiCaptureReporter.m117777c(31, 1);
        Log.m105924i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markProxyCallFailed");
        C115669n.INSTANCE.mo175912v(1012, 59);
    }

    public final boolean useCPUCrop() {
        Log.printInfoStack("MicroMsg.EmojiCaptureProxy", "useCPUCrop", new Object[0]);
        Object REMOTE_CALL = REMOTE_CALL("checkUseCPUCrop", new Object[0]);
        C87412m.m108592e(REMOTE_CALL, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) REMOTE_CALL).booleanValue();
    }
}
