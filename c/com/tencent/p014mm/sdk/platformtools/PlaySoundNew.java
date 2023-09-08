package com.tencent.p014mm.sdk.platformtools;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import p294b7.C16739c;
import p295b8.C16760a;
import p295b8.C16765c;
import p300c8.C16871d;
import p300c8.C16875m;
import p300c8.C79940c;
import p300c8.C79950j;
import p300c8.C79967x;
import p370p7.C21941l;
import p396x6.C22995c;
import p396x6.C22996d;
import p396x6.C23023u;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002()B\t\b\u0002¢\u0006\u0004\b&\u0010'J<\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007J<\u0010\u000f\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007J2\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007J2\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\b\u0010\u0014\u001a\u00020\rH\u0002J\u001e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR0\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00160\u001dj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0016`\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\u0016\u0010$\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006*"}, mo182094d2 = {"Lcom/tencent/mm/sdk/platformtools/PlaySoundNew;", "", "Landroid/content/Context;", "context", "", "pathId", "Lcom/tencent/mm/sdk/platformtools/PlaySoundNew$SPEAKERON;", "speakeron", "stream", "", "looping", "Lcom/tencent/mm/sdk/platformtools/PlaySoundNew$OnPlayCompletionListener;", "listener", "Lrx3/b0;", "playRootTP", "playRootExo", "play", "assetId", "assetHitRateControl", "updateAssetPlayTime", "evictOutDateRateControlInfo", "enable", "", "rateControl", "evictRateControl", "setRateControlParam", "", "TAG", "Ljava/lang/String;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "autoRateControlAssetInfo", "Ljava/util/HashMap;", "rateControlTime", "J", "evictRateControlTime", "enableRateControl", "Z", "<init>", "()V", "OnPlayCompletionListener", "SPEAKERON", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.platformtools.PlaySoundNew */
public final class PlaySoundNew {
    public static final PlaySoundNew INSTANCE = new PlaySoundNew();
    private static final String TAG = "MicroMsg.PlaySoundNew";
    private static final HashMap<Integer, Long> autoRateControlAssetInfo = new HashMap<>();
    private static boolean enableRateControl = true;
    private static long evictRateControlTime = 1000;
    private static long rateControlTime = 200;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/sdk/platformtools/PlaySoundNew$OnPlayCompletionListener;", "", "Lrx3/b0;", "onCompletion", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.sdk.platformtools.PlaySoundNew$OnPlayCompletionListener */
    public interface OnPlayCompletionListener {
        void onCompletion();
    }

    @Metadata(mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/sdk/platformtools/PlaySoundNew$SPEAKERON;", "", "(Ljava/lang/String;I)V", "NOTSET", "ON", "OFF", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.platformtools.PlaySoundNew$SPEAKERON */
    public enum SPEAKERON {
        NOTSET,
        ON,
        OFF
    }

    private PlaySoundNew() {
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean assetHitRateControl(int r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = enableRateControl     // Catch:{ all -> 0x003f }
            r1 = 0
            if (r0 != 0) goto L_0x0008
            monitor-exit(r6)
            return r1
        L_0x0008:
            java.util.HashMap<java.lang.Integer, java.lang.Long> r0 = autoRateControlAssetInfo     // Catch:{ all -> 0x003f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x003f }
            boolean r2 = r0.containsKey(r2)     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x003d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x003f }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ all -> 0x003f }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x003f }
            if (r7 != 0) goto L_0x0026
            r2 = -1
            java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x003f }
        L_0x0026:
            long r2 = r7.longValue()     // Catch:{ all -> 0x003f }
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x003d
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r2)     // Catch:{ all -> 0x003f }
            long r4 = rateControlTime     // Catch:{ all -> 0x003f }
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x003b
            r1 = 1
        L_0x003b:
            monitor-exit(r6)
            return r1
        L_0x003d:
            monitor-exit(r6)
            return r1
        L_0x003f:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.PlaySoundNew.assetHitRateControl(int):boolean");
    }

    private final void evictOutDateRateControlInfo() {
        long currentTicks = Util.currentTicks();
        HashMap<Integer, Long> hashMap = autoRateControlAssetInfo;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<Integer, Long>> it = hashMap.entrySet().iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            if (currentTicks - ((Number) next.getValue()).longValue() < evictRateControlTime) {
                z = false;
            }
            if (z) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        Set<Number> keySet = linkedHashMap.keySet();
        if (!keySet.isEmpty()) {
            for (Number intValue : keySet) {
                int intValue2 = intValue.intValue();
                Log.m105924i(TAG, "evictOutDateRateControlInfo:" + intValue2);
                autoRateControlAssetInfo.remove(Integer.valueOf(intValue2));
            }
        }
    }

    public static final void play(Context context, int i, SPEAKERON speakeron, boolean z, OnPlayCompletionListener onPlayCompletionListener) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(speakeron, "speakeron");
        playRootTP(context, i, speakeron, -1, z, onPlayCompletionListener);
    }

    public static final void playRootExo(Context context, int i, SPEAKERON speakeron, int i2, boolean z, OnPlayCompletionListener onPlayCompletionListener) {
        Context context2 = context;
        SPEAKERON speakeron2 = speakeron;
        int i3 = i2;
        OnPlayCompletionListener onPlayCompletionListener2 = onPlayCompletionListener;
        C87412m.m108594g(speakeron2, "speakeron");
        if (context2 == null) {
            Log.m105921e(TAG, "play Err context:%s pathId:%d speekeron:%s looping:%b listener:%s", context2, Integer.valueOf(i), speakeron2, Boolean.valueOf(z), onPlayCompletionListener2);
            return;
        }
        String string = context.getString(i);
        C87412m.m108593f(string, "context.getString(pathId)");
        C23023u uVar = new C23023u(new C22996d(context2), new C16765c(new C16760a.C16761a(new C16875m((Handler) null, (C16871d.C16872a) null))), new C22995c());
        if (speakeron2 != SPEAKERON.NOTSET && -1 == i3) {
            uVar.mo36328m(speakeron2 == SPEAKERON.ON ? 3 : 8);
        } else if (i3 != -1) {
            uVar.mo36328m(i3);
        }
        Log.m105925i(TAG, "play start mp:%d path:%s context:%s pathId:%d speakerOn:%s looping:%b listener:%s ", Integer.valueOf(uVar.hashCode()), string, context2, Integer.valueOf(i), speakeron2, Boolean.valueOf(z), onPlayCompletionListener2);
        try {
            Log.m105924i(TAG, "play prepare path:" + string);
            C79950j jVar = new C79950j(Uri.parse("file:///android_asset/" + string), 0);
            C79940c cVar = new C79940c(context2, (C79967x<? super C79940c>) null);
            cVar.mo110126b(jVar);
            C21941l lVar = new C21941l(cVar.f234163c, new PlaySoundNew$playRootExo$factory$1(cVar), new C16739c(), (Handler) null, (C21941l.C21942a) null);
            uVar.mo36323h(new PlaySoundNew$playRootExo$1(uVar, onPlayCompletionListener2));
            uVar.mo36262a(true);
            uVar.mo36329n(0);
            uVar.mo36325j(lVar);
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(uVar.hashCode());
            objArr[1] = Boolean.valueOf(Looper.myLooper() != null);
            objArr[2] = Boolean.valueOf(Looper.getMainLooper() != null);
            Log.m105925i(TAG, "play start mp finish [%d], myLooper[%b] mainLooper[%b]", objArr);
        } catch (Exception e) {
            Log.m105921e(TAG, "play failed pathId:%d e:%s", Integer.valueOf(i), e.getMessage());
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            ((C119157j) C119157j.f356862d).mo183875f(new PlaySoundNew$playRootExo$2(uVar));
        }
    }

    public static final void playRootTP(Context context, int i, SPEAKERON speakeron, int i2, boolean z, OnPlayCompletionListener onPlayCompletionListener) {
        C87412m.m108594g(speakeron, "speakeron");
        if (context == null) {
            Log.m105921e(TAG, "play Err context:%s pathId:%d speekeron:%s looping:%b listener:%s", context, Integer.valueOf(i), speakeron, Boolean.valueOf(z), onPlayCompletionListener);
            return;
        }
        ((C119157j) C119157j.f356862d).mo183875f(new PlaySoundNew$playRootTP$1(context, i, speakeron, i2, z, onPlayCompletionListener));
    }

    /* access modifiers changed from: private */
    public final synchronized void updateAssetPlayTime(int i) {
        if (enableRateControl) {
            Log.m105924i(TAG, "updateAssetPlayTime:" + i);
            autoRateControlAssetInfo.put(Integer.valueOf(i), Long.valueOf(Util.currentTicks()));
            evictOutDateRateControlInfo();
        }
    }

    public final void setRateControlParam(boolean z, long j, long j2) {
        Log.m105924i(TAG, "setRateControlParam enable:" + z + ", rateControl:" + j + ", evictRateControl:" + j2);
        enableRateControl = z;
        if (j > 0 && j2 > 0) {
            rateControlTime = j;
            evictRateControlTime = j2;
            Log.m105924i(TAG, "setRateControlParam " + j + ' ' + j2);
        }
    }

    public static final void play(Context context, int i, boolean z, boolean z2, OnPlayCompletionListener onPlayCompletionListener) {
        C87412m.m108594g(context, "context");
        playRootTP(context, i, z ? SPEAKERON.ON : SPEAKERON.OFF, -1, z2, onPlayCompletionListener);
    }
}
