package la2;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.autogen.events.MusicActionEvent;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.MusicPlayReportStruct;
import com.tencent.p014mm.network.C81035d;
import com.tencent.p014mm.plugin.music.model.notification.MMMusicNotificationHelper;
import com.tencent.p014mm.plugin.music.model.notification.MMMusicPlayerService;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.vfs.C86013q1;
import da2.C97456b;
import di3.C86312j;
import f40.C86709a0;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import la2.C61261g;
import ma2.C99814o0;
import nc3.C34767b;
import oa2.C100320a;
import oa2.C47347b;
import oa2.C47348c;
import oa2.C61984d;
import pa2.C11876a;
import q90.C101062d;
import qa2.C101083d;
import qc0.C101093a;
import qc0.C101106m;
import ra2.C101365a;
import ra2.C101366b;
import va2.C102164a;
import za2.C102984b;

/* renamed from: la2.q */
public class C99365q extends C99360j implements C99358f, C61261g {

    /* renamed from: c */
    public int f291357c = 1;

    /* renamed from: d */
    public int f291358d;

    /* renamed from: e */
    public List<String> f291359e = new ArrayList();

    /* renamed from: f */
    public MMMusicNotificationHelper f291360f = new MMMusicNotificationHelper();

    /* renamed from: g */
    public Object f291361g = new Object();

    /* renamed from: h */
    public boolean f291362h = true;

    /* renamed from: i */
    public C61261g.C61262a f291363i;

    /* renamed from: j */
    public C47347b f291364j;

    /* renamed from: k */
    public C100320a f291365k;

    /* renamed from: l */
    public C47348c f291366l;

    /* renamed from: m */
    public C61984d f291367m;

    /* renamed from: n */
    public boolean f291368n;

    /* renamed from: o */
    public C34767b.C34768c f291369o = null;

    /* renamed from: la2.q$c */
    public class C61264c implements Runnable {

        /* renamed from: d */
        public List<String> f174363d;

        public C61264c(C61263p pVar) {
        }

        public void run() {
            String a = C102984b.m136164a(C99365q.this.mo138771E());
            int i = C99365q.this.f291358d;
            boolean z = false;
            for (int i2 = 0; i2 < this.f174363d.size(); i2++) {
                if (this.f174363d.get(i2).equals(a)) {
                    i = i2;
                    z = true;
                }
            }
            if (z) {
                synchronized (C99365q.this.f291361g) {
                    for (int i3 = i + 1; i3 < this.f174363d.size(); i3++) {
                        ((ArrayList) C99365q.this.f291359e).add(this.f174363d.get(i3));
                    }
                    for (int i4 = 0; i4 < i; i4++) {
                        ((ArrayList) C99365q.this.f291359e).add(this.f174363d.get(i4));
                    }
                }
                Log.m105925i("MicroMsg.Music.MusicWechatPrivateLogic", "GetMusicWrapperListTask currentMusicSize=%d currentMusicIndex=%d", Integer.valueOf(((ArrayList) C99365q.this.f291359e).size()), Integer.valueOf(C99365q.this.f291358d));
                MusicPlayerEvent musicPlayerEvent = new MusicPlayerEvent();
                musicPlayerEvent.f9336d.f9337a = 5;
                musicPlayerEvent.publish();
            }
        }
    }

    /* renamed from: la2.q$a */
    public class C99366a implements C34767b.C21622a {
        public C99366a(C99365q qVar) {
        }

        /* renamed from: a */
        public void mo17997a(boolean z) {
            Log.m105924i("MicroMsg.Music.MusicWechatPrivateLogic", "audio focus lossTransient");
            if (C99364n.m129616h().mo138822a().mo32211k()) {
                C99364n.m129616h().mo138822a().mo32196i();
            }
        }

        public void onResume() {
            Log.m105924i("MicroMsg.Music.MusicWechatPrivateLogic", "audio focus gain");
            if (C99364n.m129616h().mo138822a().mo32211k()) {
                C99364n.m129616h().mo138822a().mo32209h(false);
            }
        }

        public void onStop() {
            Log.m105924i("MicroMsg.Music.MusicWechatPrivateLogic", "audio focus loss, passive pause");
            if (C99364n.m129616h().mo138822a().mo32211k()) {
                C99364n.m129616h().mo138822a().mo32196i();
                C99364n.m129616h().mo138825d();
                C99364n.m129616h().mo138836q(600000);
            }
        }
    }

    /* renamed from: la2.q$b */
    public class C99367b implements Runnable {
        public C99367b(C61263p pVar) {
        }

        public void run() {
            List list;
            long currentTimeMillis = System.currentTimeMillis();
            C99365q qVar = C99365q.this;
            qVar.f291368n = true;
            C101106m E = qVar.mo138771E();
            ArrayList arrayList = new ArrayList();
            Log.m105925i("MicroMsg.Music.MusicWechatPrivateLogic", "musicWrapper.MusicType:%d", Integer.valueOf(E.f295959d));
            int i = E.f295959d;
            if (i == 1) {
                MusicActionEvent musicActionEvent = new MusicActionEvent();
                musicActionEvent.f264920d.f264922a = -5;
                musicActionEvent.publish();
                list = musicActionEvent.f264921e.f264932c;
            } else if (i == 4) {
                MusicActionEvent musicActionEvent2 = new MusicActionEvent();
                musicActionEvent2.f264920d.f264922a = -4;
                musicActionEvent2.publish();
                list = musicActionEvent2.f264921e.f264932c;
            } else if (i == 6) {
                FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
                favoriteOperationEvent.f264833d.f264835a = 18;
                favoriteOperationEvent.publish();
                list = favoriteOperationEvent.f264834e.f264862h;
            } else if (i != 8) {
                list = null;
            } else {
                MusicActionEvent musicActionEvent3 = new MusicActionEvent();
                MusicActionEvent.C92531a aVar = musicActionEvent3.f264920d;
                aVar.f264922a = -6;
                aVar.f264923b = E;
                musicActionEvent3.publish();
                list = musicActionEvent3.f264921e.f264932c;
            }
            if (list != null) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    C101106m mVar = (C101106m) list.get(i2);
                    if (mVar == null) {
                        Log.m105920e("MicroMsg.Music.MusicWechatPrivateLogic", "wrapper is null, continue");
                    } else {
                        C99814o0.wx0().mo140853Yt(mVar);
                        arrayList.add(C102984b.m136164a(mVar));
                    }
                }
            }
            Log.m105925i("MicroMsg.Music.MusicWechatPrivateLogic", "GetMusicWrapperListTask run time %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            C99365q qVar2 = C99365q.this;
            qVar2.f291368n = false;
            C61264c cVar = new C61264c((C61263p) null);
            cVar.f174363d = arrayList;
            MMHandlerThread.postToMainThread(cVar);
        }
    }

    /* renamed from: A */
    public C101106m mo138768A(C101106m mVar) {
        boolean z;
        String a = C102984b.m136164a(mVar);
        synchronized (this.f291361g) {
            if (this.f291359e != null) {
                int i = 0;
                while (true) {
                    if (i >= ((ArrayList) this.f291359e).size()) {
                        z = false;
                        break;
                    } else if (a.equals(((ArrayList) this.f291359e).get(i))) {
                        this.f291358d = i;
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (((ArrayList) this.f291359e).size() > 1 && mVar.f295940A) {
                    this.f291357c = 2;
                }
            } else {
                z = false;
            }
        }
        if (z) {
            return mo138771E();
        }
        synchronized (this.f291361g) {
            ((ArrayList) this.f291359e).clear();
            ((ArrayList) this.f291359e).add(C102984b.m136164a(mVar));
        }
        this.f291358d = 0;
        C99814o0.wx0().mo140853Yt(mVar);
        if (this.f291357c != 2) {
            return mVar;
        }
        ThreadPool.post(new C99367b((C61263p) null), "music_get_list_task");
        return mVar;
    }

    /* renamed from: B0 */
    public void mo138769B0(C101106m mVar) {
        C101083d.f295911d = System.currentTimeMillis();
    }

    /* renamed from: C */
    public void mo138770C(C101106m mVar) {
        if (C101083d.f295911d > 0) {
            C101083d.f295910c = (int) (((long) C101083d.f295910c) + ((System.currentTimeMillis() - C101083d.f295911d) / 1000));
            C101083d.f295911d = 0;
        }
        if (C102164a.f300829a != null) {
            C102164a.f300829a.mo126622s(C102164a.m134604b(new String[]{String.valueOf(Long.valueOf(System.currentTimeMillis())), C102164a.f300830b, "paused", "1.0", String.valueOf(C101093a.m132479a().f35261b)}));
            C102164a.m134603a();
        }
    }

    /* renamed from: C0 */
    public final C61260d mo138838C0() {
        ((C97456b) C86312j.m106911c(C97456b.class)).requireAndWaitForAccountInitialized();
        return this.f291347a;
    }

    /* renamed from: E */
    public C101106m mo138771E() {
        synchronized (this.f291361g) {
            if (((ArrayList) this.f291359e).size() == 0) {
                return null;
            }
            int size = ((ArrayList) this.f291359e).size();
            int i = this.f291358d;
            if (size <= i) {
                return null;
            }
            C101365a jo = C99814o0.wx0().mo140855jo((String) ((ArrayList) this.f291359e).get(i));
            if (jo == null) {
                return null;
            }
            C101106m m2 = jo.mo140850m2();
            return m2;
        }
    }

    /* renamed from: F */
    public C101106m mo138772F(List<C101106m> list, int i) {
        if (list == null || list.size() == 0 || i >= list.size()) {
            Log.m105924i("MicroMsg.Music.MusicWechatPrivateLogic", "music wrapper list error");
            return null;
        }
        synchronized (this.f291361g) {
            ((ArrayList) this.f291359e).clear();
            for (int i2 = 0; i2 < list.size(); i2++) {
                C101106m mVar = list.get(i2);
                ((ArrayList) this.f291359e).add(C102984b.m136164a(mVar));
                C99814o0.wx0().mo140853Yt(mVar);
            }
        }
        this.f291358d = i;
        this.f291357c = 2;
        Log.m105925i("MicroMsg.Music.MusicWechatPrivateLogic", "startPlayNewMusicList:%d", Integer.valueOf(i));
        C101106m E = mo138771E();
        if (E.f295943D > 0) {
            String a = C102984b.m136164a(E);
            C101366b wx02 = C99814o0.wx0();
            wx02.getClass();
            ContentValues contentValues = new ContentValues();
            contentValues.put("startTime", 0);
            wx02.f296943e.update("Music", contentValues, "musicId=?", new String[]{a});
            C101365a aVar = (C101365a) ((C101062d) wx02.f296942d).get(a);
            if (aVar != null) {
                aVar.field_startTime = 0;
            }
        }
        return E;
    }

    /* renamed from: J */
    public synchronized void mo138773J(List<C101106m> list, boolean z) {
        if (list != null) {
            if (list.size() != 0) {
                synchronized (this.f291361g) {
                    if (z) {
                        ((ArrayList) this.f291359e).clear();
                    }
                    for (C101106m next : list) {
                        ((ArrayList) this.f291359e).add(C102984b.m136164a(next));
                        C99814o0.wx0().mo140853Yt(next);
                    }
                }
                return;
            }
        }
        Log.m105924i("MicroMsg.Music.MusicWechatPrivateLogic", "appendMusicList error");
    }

    /* renamed from: K */
    public void mo86252K(C61261g.C61262a aVar) {
        this.f291363i = aVar;
    }

    /* renamed from: L */
    public void mo138774L() {
        if (!this.f291362h) {
            Log.m105924i("MicroMsg.Music.MusicWechatPrivateLogic", "abandonFocus: not support AudioFocusService");
            super.mo138774L();
            return;
        }
        Log.m105924i("MicroMsg.Music.MusicWechatPrivateLogic", "abandonFocus: support AudioFocusService");
        if (this.f291369o != null) {
            ((C34767b) C86312j.m106911c(C34767b.class)).b20(this.f291369o);
            this.f291369o = null;
        }
    }

    /* renamed from: M */
    public URL mo138775M(String str) {
        return new C81035d.C81037b(str).f238039b;
    }

    /* renamed from: O */
    public boolean mo138776O(int i) {
        if (!(i == 0 || i == 1 || i == 4 || i == 5 || i == 12 || i == 14)) {
            switch (i) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* renamed from: P */
    public void mo138777P(C101106m mVar) {
        if (C102164a.f300829a != null) {
            C102164a.f300829a.mo126622s(C102164a.m134604b(new String[]{String.valueOf(Long.valueOf(System.currentTimeMillis())), C102164a.f300830b, "seekEnd", "1.0", String.valueOf(C101093a.m132479a().f35261b)}));
            C102164a.m134603a();
        }
    }

    /* renamed from: Q */
    public void mo138778Q(C101106m mVar) {
        if (mVar != null) {
            synchronized (this.f291361g) {
                ((ArrayList) this.f291359e).clear();
                ((ArrayList) this.f291359e).add(C102984b.m136164a(mVar));
            }
            this.f291358d = 0;
            C99814o0.wx0().mo140853Yt(mVar);
            return;
        }
        Log.m105924i("MicroMsg.Music.MusicWechatPrivateLogic", "shake music item is null");
    }

    /* renamed from: R */
    public void mo138808R() {
        if (this.f291357c != 1) {
            int i = this.f291358d + 1;
            this.f291358d = i;
            this.f291358d = i % ((ArrayList) this.f291359e).size();
            ((C99364n) mo138838C0()).mo138833n(true);
            ((C99364n) mo138838C0()).mo138834o((C101106m) null);
        }
    }

    /* renamed from: U */
    public C101365a mo138809U() {
        synchronized (this.f291361g) {
            if (((ArrayList) this.f291359e).size() == 0) {
                return null;
            }
            int size = ((ArrayList) this.f291359e).size();
            int i = this.f291358d;
            if (size <= i) {
                return null;
            }
            C101365a jo = C99814o0.wx0().mo140855jo((String) ((ArrayList) this.f291359e).get(i));
            return jo;
        }
    }

    /* renamed from: V */
    public boolean mo138810V() {
        C101365a U = mo138809U();
        if (U == null) {
            return false;
        }
        int i = U.field_musicType;
        if (!(i == 1 || i == 4 || i == 6)) {
            switch (i) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public String mo138779a() {
        String i = C86013q1.m106448i("wcf://QQMusicCache/", true);
        C86013q1.m106461v("wcf://QQMusicCache/");
        return i;
    }

    /* renamed from: a0 */
    public void mo138780a0(C101106m mVar, int i) {
        C101083d.m132455d();
    }

    /* renamed from: b0 */
    public void mo138781b0(C101106m mVar) {
        if (C102164a.f300829a != null) {
            C102164a.f300829a.mo126622s(C102164a.m134604b(new String[]{String.valueOf(Long.valueOf(System.currentTimeMillis())), C102164a.f300830b, "seeking", "1.0", String.valueOf(C101093a.m132479a().f35261b)}));
            C102164a.m134603a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0017, code lost:
        r1 = r6.lastIndexOf("wxshakemusic");
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo138782d(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r6 = na2.C61638d.m72350a(r6)
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r6
            java.lang.String r3 = "MicroMsg.Music.MusicWechatPrivateLogic"
            java.lang.String r4 = "contain shake tag playUrl:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r1)
            boolean r1 = na2.C61638d.m72351b(r6)
            if (r1 == 0) goto L_0x0025
            java.lang.String r1 = "wxshakemusic"
            int r1 = r6.lastIndexOf(r1)
            if (r1 <= r0) goto L_0x0025
            int r1 = r1 - r0
            java.lang.String r6 = r6.substring(r2, r1)
        L_0x0025:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: la2.C99365q.mo138782d(java.lang.String):java.lang.String");
    }

    /* renamed from: f0 */
    public void mo138811f0(int i) {
        if (((ArrayList) this.f291359e).size() != 0) {
            int size = (i - 100000) % ((ArrayList) this.f291359e).size();
            if (size < 0) {
                size += ((ArrayList) this.f291359e).size();
            }
            if (size != this.f291358d) {
                this.f291358d = size;
                ((C99364n) mo138838C0()).mo138834o((C101106m) null);
            }
        }
    }

    public int getMode() {
        return this.f291357c;
    }

    /* renamed from: h */
    public boolean mo138813h() {
        return ((ArrayList) this.f291359e).size() > 0 && this.f291357c == 2;
    }

    /* renamed from: h0 */
    public void mo138814h0(C101365a aVar, boolean z, boolean z2) {
        if (aVar != null) {
            if (this.f291364j != null) {
                C86709a0.m107529k().f251779b.mo123458d(this.f291364j);
                this.f291364j = null;
            }
            if (aVar.field_songId > 0 || !TextUtils.isEmpty(aVar.field_songMId)) {
                this.f291364j = new C47347b(aVar, z, z2);
                C86709a0.m107529k().f251779b.mo123460f(this.f291364j);
                return;
            }
            Log.m105920e("MicroMsg.Music.MusicWechatPrivateLogic", "can't get songId and mid is empty");
            C115669n.INSTANCE.kvStat(10911, "1");
        }
    }

    /* renamed from: i */
    public void mo138783i(C101106m mVar) {
        C101083d.m132455d();
        C102164a.m134605c();
        if (this.f291357c != 2) {
            return;
        }
        if (this.f291358d < ((ArrayList) this.f291359e).size() - 1 || mVar.f295940A) {
            MusicPlayerEvent musicPlayerEvent = new MusicPlayerEvent();
            MusicPlayerEvent.C1094a aVar = musicPlayerEvent.f9336d;
            aVar.f9337a = 15;
            aVar.f9341e = "";
            musicPlayerEvent.asyncPublish(Looper.getMainLooper());
            mo138808R();
        }
    }

    /* renamed from: i0 */
    public C101365a mo138815i0(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C101365a jo = C99814o0.wx0().mo140855jo(str);
        if (jo != null) {
            ((ArrayList) this.f291359e).add(str);
            Log.m105925i("MicroMsg.Music.MusicWechatPrivateLogic", "getMusicByDBMusicId, music data exist in db , id:%s", str);
        } else {
            Log.m105921e("MicroMsg.Music.MusicWechatPrivateLogic", "getMusicByDBMusicId, music data not exist in db , id:%s", str);
        }
        return jo;
    }

    public void init() {
        this.f291360f.mo129504c();
    }

    /* renamed from: j */
    public void mo138785j(C101106m mVar) {
        if (mVar != null) {
            MusicPlayReportStruct musicPlayReportStruct = new MusicPlayReportStruct();
            C102164a.f300829a = musicPlayReportStruct;
            musicPlayReportStruct.f265757d = musicPlayReportStruct.mo86045b("SessionId", String.valueOf(System.currentTimeMillis()), true);
            MusicPlayReportStruct musicPlayReportStruct2 = C102164a.f300829a;
            musicPlayReportStruct2.f265761h = musicPlayReportStruct2.mo86045b("DataUrl", mVar.f295966n, true);
            MusicPlayReportStruct musicPlayReportStruct3 = C102164a.f300829a;
            musicPlayReportStruct3.f265759f = musicPlayReportStruct3.mo86045b("Singer", mVar.f295963h, true);
            MusicPlayReportStruct musicPlayReportStruct4 = C102164a.f300829a;
            musicPlayReportStruct4.f265758e = musicPlayReportStruct4.mo86045b("SongName", mVar.f295962g, true);
            MusicPlayReportStruct musicPlayReportStruct5 = C102164a.f300829a;
            musicPlayReportStruct5.f265760g = musicPlayReportStruct5.mo86045b("WebUrl", mVar.f295968p, true);
            MusicPlayReportStruct musicPlayReportStruct6 = C102164a.f300829a;
            musicPlayReportStruct6.f265764k = musicPlayReportStruct6.mo86045b("Appid", mVar.f295972t, true);
        }
        if (C102164a.f300829a != null) {
            C102164a.f300829a.mo126622s(C102164a.m134604b(new String[]{String.valueOf(Long.valueOf(System.currentTimeMillis())), C102164a.f300830b, "preparing", "1.0", "0"}));
            C102164a.m134603a();
        }
        if (C102164a.f300829a != null) {
            C102164a.f300829a.mo126622s(C102164a.m134604b(new String[]{String.valueOf(Long.valueOf(System.currentTimeMillis())), C102164a.f300830b, "buffering", "1.0", String.valueOf(C101093a.m132479a().f35261b)}));
            C102164a.m134603a();
        }
    }

    /* renamed from: m0 */
    public void mo138816m0(int i) {
        C115669n.INSTANCE.idkeyStat(285, 2, 1, false);
        if (this.f291357c != 1) {
            this.f291357c = 1;
            MusicPlayerEvent musicPlayerEvent = new MusicPlayerEvent();
            musicPlayerEvent.f9336d.f9337a = 5;
            musicPlayerEvent.publish();
            C101083d.m132457f(2, 1, i);
        } else if (this.f291368n) {
            Log.m105924i("MicroMsg.Music.MusicWechatPrivateLogic", "already running get list");
        } else {
            this.f291357c = 2;
            if (((ArrayList) this.f291359e).size() <= 1) {
                ThreadPool.post(new C99367b((C61263p) null), "music_get_list_task");
            } else {
                MusicPlayerEvent musicPlayerEvent2 = new MusicPlayerEvent();
                musicPlayerEvent2.f9336d.f9337a = 5;
                musicPlayerEvent2.publish();
            }
            C101083d.m132457f(1, 2, i);
        }
    }

    /* renamed from: n0 */
    public void mo138786n0(C101106m mVar) {
        C101083d.m132455d();
        C102164a.m134605c();
    }

    /* renamed from: o */
    public void mo138787o(C101106m mVar) {
        super.mo138787o(mVar);
        C99814o0.wx0().mo140853Yt(mVar);
    }

    /* renamed from: p0 */
    public void mo138788p0(C101106m mVar) {
        if (C102164a.f300829a != null) {
            C102164a.f300829a.mo126622s(C102164a.m134604b(new String[]{String.valueOf(Long.valueOf(System.currentTimeMillis())), C102164a.f300830b, "readyToPlay", "1.0", "0"}));
            C102164a.m134603a();
        }
    }

    /* renamed from: q */
    public int mo138817q() {
        return this.f291358d;
    }

    /* renamed from: q0 */
    public List<String> mo138818q0() {
        return this.f291359e;
    }

    /* renamed from: r */
    public boolean mo138789r(int i) {
        HashMap<Integer, Boolean> hashMap = C11876a.f34715a;
        return true;
    }

    public void release() {
        ((ArrayList) this.f291359e).clear();
        MMMusicNotificationHelper mMMusicNotificationHelper = this.f291360f;
        mMMusicNotificationHelper.getClass();
        Log.m105924i("MicroMsg.Music.MMMusicNotificationHelper", "uninitMusicPlayerService");
        Intent intent = new Intent();
        intent.setClass(MMApplicationContext.getContext(), MMMusicPlayerService.class);
        MMApplicationContext.getContext().stopService(intent);
        mMMusicNotificationHelper.f272158a = null;
        mMMusicNotificationHelper.f272160c.dead();
    }

    public boolean requestFocus() {
        Class cls = C34767b.class;
        if (!this.f291362h) {
            Log.m105924i("MicroMsg.Music.MusicWechatPrivateLogic", "requestFocus: not support AudioFocusService");
            return super.requestFocus();
        }
        if (this.f291369o != null) {
            ((C34767b) C86312j.m106911c(cls)).b20(this.f291369o);
            this.f291369o = null;
        }
        Log.m105924i("MicroMsg.Music.MusicWechatPrivateLogic", "requestFocus: support AudioFocusService");
        C34767b.C34768c el = ((C34767b) C86312j.m106911c(cls)).mo34192el(C34767b.C34769b.C34779h.f93462c, new C99366a(this));
        this.f291369o = el;
        if (el == null || !el.mo34198a()) {
            Log.m105924i("MicroMsg.Music.MusicWechatPrivateLogic", "getGainFocus fail");
            return true;
        }
        Log.m105924i("MicroMsg.Music.MusicWechatPrivateLogic", "getGainFocus success");
        return true;
    }

    /* renamed from: t */
    public C101106m mo138792t(C101106m mVar) {
        if (mVar == null && ((ArrayList) this.f291359e).size() == 0) {
            Log.m105924i("MicroMsg.Music.MusicWechatPrivateLogic", "musicWrapper is null && musicList's size is 0");
            return null;
        } else if (mVar == null) {
            return mo138771E();
        } else {
            synchronized (this.f291361g) {
                ((ArrayList) this.f291359e).clear();
                ((ArrayList) this.f291359e).add(C102984b.m136164a(mVar));
            }
            this.f291358d = 0;
            C99814o0.wx0().mo140853Yt(mVar);
            if (this.f291357c != 2) {
                return mVar;
            }
            ThreadPool.post(new C99367b((C61263p) null), "music_get_list_task");
            return mVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01e3  */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo138793u0(qc0.C101106m r12) {
        /*
            r11 = this;
            java.lang.String r0 = "MicroMsg.Music.MusicWechatPrivateLogic"
            r1 = 0
            if (r12 != 0) goto L_0x000c
            java.lang.String r12 = "musicWrapper is false, do not start music"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r12)
            return r1
        L_0x000c:
            ra2.a r2 = r11.mo138809U()
            if (r2 == 0) goto L_0x0270
            int r3 = ma2.C99812l0.f292500a
            java.lang.String r3 = r2.field_songWifiUrl
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r4 = 1
            if (r3 == 0) goto L_0x002f
            java.lang.String r3 = r2.field_songWapLinkUrl
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x002f
            java.lang.String r3 = r2.field_songWebUrl
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x002f
            r3 = 0
            goto L_0x0030
        L_0x002f:
            r3 = 1
        L_0x0030:
            if (r3 != 0) goto L_0x0034
            goto L_0x0270
        L_0x0034:
            oa2.a r3 = r11.f291365k
            if (r3 == 0) goto L_0x0043
            f40.g r3 = f40.C86709a0.m107529k()
            ob0.b0 r3 = r3.f251779b
            oa2.a r5 = r11.f291365k
            r3.mo123458d(r5)
        L_0x0043:
            oa2.a r3 = new oa2.a
            int r5 = r2.field_musicType
            r3.<init>(r5, r2)
            r11.f291365k = r3
            f40.g r3 = f40.C86709a0.m107529k()
            ob0.b0 r3 = r3.f251779b
            oa2.a r5 = r11.f291365k
            r3.mo123460f(r5)
            int r3 = r2.field_isBlock
            if (r3 != r4) goto L_0x0074
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = r2.field_musicId
            r3[r1] = r2
            java.lang.String r2 = "not play music, music is block %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r3)
            la2.d r0 = r11.mo138838C0()
            la2.k r0 = (la2.C99361k) r0
            r0.mo138824c(r12)
            qa2.C101083d.m132452a(r12, r4)
            return r1
        L_0x0074:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            int r5 = r2.field_musicType
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r1] = r5
            java.lang.String r5 = "musicType %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r3)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r5 = r2.field_protocol
            r3[r1] = r5
            java.lang.String r5 = "music protocol:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r3)
            java.lang.String r3 = r12.f295955Q
            r2.f296937C1 = r3
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.String, java.lang.String> r5 = na2.C61638d.f175282a
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r5 = 0
            if (r3 == 0) goto L_0x009f
            goto L_0x0194
        L_0x009f:
            java.lang.String r3 = r2.f296937C1
            boolean r3 = na2.C61638d.m72351b(r3)
            if (r3 != 0) goto L_0x00a9
            goto L_0x0194
        L_0x00a9:
            int r3 = r2.field_musicType
            boolean r3 = za2.C102985c.m136171b(r3)
            java.lang.String r6 = "MicroMsg.Music.MusicUrlParser"
            if (r3 == 0) goto L_0x00e7
            java.lang.String r3 = r2.f296937C1
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x00bc
            goto L_0x00cf
        L_0x00bc:
            java.lang.String r3 = r2.f296937C1
            java.lang.String r3 = za2.C102984b.m136165b(r3)
            qc0.q r3 = ha2.C98329e.m127107c(r3)
            if (r3 != 0) goto L_0x00c9
            goto L_0x00cf
        L_0x00c9:
            int r3 = r3.f295983e
            if (r3 != r4) goto L_0x00cf
            r3 = 1
            goto L_0x00d0
        L_0x00cf:
            r3 = 0
        L_0x00d0:
            if (r3 == 0) goto L_0x00dc
            java.lang.String r3 = r2.f296937C1
            boolean r3 = ha2.C98330i.m127112b(r3)
            if (r3 == 0) goto L_0x00dc
            r3 = 1
            goto L_0x00dd
        L_0x00dc:
            r3 = 0
        L_0x00dd:
            if (r3 == 0) goto L_0x014d
            java.lang.String r3 = "qq music pieceFile cache is valid"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            goto L_0x0194
        L_0x00e7:
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r3)
            if (r3 == 0) goto L_0x00f6
            int r7 = r2.field_wifiEndFlag
            if (r7 != r4) goto L_0x00fc
            goto L_0x00fa
        L_0x00f6:
            int r7 = r2.field_endFlag
            if (r7 != r4) goto L_0x00fc
        L_0x00fa:
            r7 = 1
            goto L_0x00fd
        L_0x00fc:
            r7 = 0
        L_0x00fd:
            if (r7 == 0) goto L_0x0143
            java.lang.String r7 = r2.field_musicId
            java.lang.String r3 = za2.C102984b.m136167d(r7, r3)
            android.net.Uri r3 = com.tencent.p014mm.vfs.C116299g2.m163858n(r3)
            java.lang.String r7 = r3.getPath()
            if (r7 == 0) goto L_0x0129
            java.lang.String r7 = com.tencent.p014mm.vfs.C116299g2.m163855k(r7, r1, r1)
            java.lang.String r8 = r3.getPath()
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0129
            android.net.Uri$Builder r3 = r3.buildUpon()
            android.net.Uri$Builder r3 = r3.path(r7)
            android.net.Uri r3 = r3.build()
        L_0x0129:
            com.tencent.mm.vfs.f0 r7 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r3 = r7.mo177799l(r3, r5)
            boolean r7 = r3.mo177810a()
            if (r7 != 0) goto L_0x0137
            r3 = 0
            goto L_0x013f
        L_0x0137:
            com.tencent.mm.vfs.FileSystem$c r7 = r3.f348991a
            java.lang.String r3 = r3.f348992b
            boolean r3 = r7.mo119948x(r3)
        L_0x013f:
            if (r3 == 0) goto L_0x0143
            r3 = 1
            goto L_0x0144
        L_0x0143:
            r3 = 0
        L_0x0144:
            if (r3 == 0) goto L_0x014d
            java.lang.String r3 = "music cache is valid"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            goto L_0x0194
        L_0x014d:
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.String, java.lang.String> r3 = na2.C61638d.f175282a
            java.lang.String r7 = r2.f296937C1
            boolean r3 = r3.check(r7)
            if (r3 != 0) goto L_0x0159
        L_0x0157:
            r3 = 1
            goto L_0x0195
        L_0x0159:
            r7 = 0
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.String, java.lang.Long> r3 = na2.C61638d.f175283b
            java.lang.String r9 = r2.f296937C1
            boolean r3 = r3.check(r9)
            if (r3 == 0) goto L_0x0173
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.String, java.lang.Long> r3 = na2.C61638d.f175283b
            java.lang.String r7 = r2.f296937C1
            java.lang.Object r3 = r3.get(r7)
            java.lang.Long r3 = (java.lang.Long) r3
            long r7 = r3.longValue()
        L_0x0173:
            long r9 = java.lang.System.currentTimeMillis()
            long r9 = r9 - r7
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x0194
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.String, java.lang.String> r3 = na2.C61638d.f175282a
            java.lang.String r7 = r2.f296937C1
            r3.remove(r7)
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.String, java.lang.Long> r3 = na2.C61638d.f175283b
            java.lang.String r7 = r2.f296937C1
            r3.remove(r7)
            java.lang.String r3 = "shake music url in cache is timeout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            goto L_0x0157
        L_0x0194:
            r3 = 0
        L_0x0195:
            if (r3 == 0) goto L_0x01e3
            java.lang.String r12 = "get shake music new url to play"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)
            java.lang.String r12 = r2.f296937C1
            boolean r2 = android.text.TextUtils.isEmpty(r12)
            if (r2 == 0) goto L_0x01aa
            java.lang.String r12 = "GetShakeMusicUrl, url is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r12)
            goto L_0x01e2
        L_0x01aa:
            oa2.c r2 = r11.f291366l
            if (r2 == 0) goto L_0x01bb
            f40.g r2 = f40.C86709a0.m107529k()
            ob0.b0 r2 = r2.f251779b
            oa2.c r3 = r11.f291366l
            r2.mo123458d(r3)
            r11.f291366l = r5
        L_0x01bb:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r1] = r12
            java.lang.String r3 = "GetShakeMusicUrl, url is %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r3, r2)
            oa2.c r0 = new oa2.c
            r0.<init>(r12)
            r11.f291366l = r0
            f40.g r12 = f40.C86709a0.m107529k()
            ob0.b0 r12 = r12.f251779b
            oa2.c r0 = r11.f291366l
            r12.mo123460f(r0)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 558(0x22e, double:2.757E-321)
            r5 = 213(0xd5, double:1.05E-321)
            r7 = 1
            r9 = 1
            r2.idkeyStat(r3, r5, r7, r9)
        L_0x01e2:
            return r1
        L_0x01e3:
            na2.c r3 = na2.C61637c.f175276a
            java.lang.String r3 = r2.field_mid
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x01f7
            java.lang.String r3 = "MicroMsg.Music.MusicLiveLinkCacheHelper"
            java.lang.String r6 = "no mid, no need to get new link"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)
            r3 = 0
            goto L_0x01f8
        L_0x01f7:
            r3 = 1
        L_0x01f8:
            if (r3 == 0) goto L_0x026b
            java.lang.String r12 = "get music new url to play"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)
            java.lang.String r12 = r2.field_mid
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 == 0) goto L_0x020d
            java.lang.String r12 = "GetMusicNewUrl, mid is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r12)
            goto L_0x026a
        L_0x020d:
            oa2.d r12 = r11.f291367m
            if (r12 == 0) goto L_0x021e
            f40.g r12 = f40.C86709a0.m107529k()
            ob0.b0 r12 = r12.f251779b
            oa2.d r3 = r11.f291367m
            r12.mo123458d(r3)
            r11.f291367m = r5
        L_0x021e:
            r12 = 3
            java.lang.Object[] r12 = new java.lang.Object[r12]
            java.lang.String r3 = r2.field_appId
            r12[r1] = r3
            java.lang.String r3 = r2.field_mid
            r12[r4] = r3
            r3 = 2
            java.lang.String r4 = r2.field_songWebUrl
            r12[r3] = r4
            java.lang.String r3 = "GetMusicNewUrl, appid:%s, mid: %s, web_url:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r12)
            java.util.LinkedList r12 = new java.util.LinkedList
            r12.<init>()
            te3.x13 r0 = new te3.x13
            r0.<init>()
            java.lang.String r3 = r2.field_appId
            r0.f186251d = r3
            java.lang.String r3 = r2.field_mid
            r0.f186252e = r3
            java.lang.String r2 = r2.field_songWebUrl
            r0.f186253f = r2
            r12.add(r0)
            oa2.d r0 = new oa2.d
            r0.<init>(r12)
            r11.f291367m = r0
            f40.g r12 = f40.C86709a0.m107529k()
            ob0.b0 r12 = r12.f251779b
            oa2.d r0 = r11.f291367m
            r12.mo123460f(r0)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 558(0x22e, double:2.757E-321)
            r5 = 220(0xdc, double:1.087E-321)
            r7 = 1
            r9 = 1
            r2.idkeyStat(r3, r5, r7, r9)
        L_0x026a:
            return r1
        L_0x026b:
            java.lang.String r0 = r2.f296937C1
            r12.f295955Q = r0
            return r4
        L_0x0270:
            java.lang.String r2 = "music or url is null, do not start music"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            la2.d r0 = r11.mo138838C0()
            la2.k r0 = (la2.C99361k) r0
            r0.mo138824c(r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: la2.C99365q.mo138793u0(qc0.m):boolean");
    }

    /* renamed from: v */
    public void mo138819v(int i) {
        this.f291357c = i;
    }

    /* renamed from: v0 */
    public void mo138794v0(C101106m mVar) {
        C101083d.m132455d();
        C101083d.f295911d = System.currentTimeMillis();
        C101365a U = mo138809U();
        synchronized (C101083d.class) {
            C101083d.f295912e = U;
        }
        MusicPlayReportStruct musicPlayReportStruct = C102164a.f300829a;
        if (musicPlayReportStruct != null) {
            musicPlayReportStruct.f265762i = (long) C101093a.m132479a().f35260a;
            C102164a.f300829a.mo126622s(C102164a.m134604b(new String[]{String.valueOf(Long.valueOf(System.currentTimeMillis())), C102164a.f300830b, "playing", "1.0", "0"}));
            C102164a.m134603a();
        }
    }

    /* renamed from: w */
    public void mo86253w() {
        if (this.f291363i != null) {
            this.f291363i = null;
        }
    }

    /* renamed from: y */
    public void mo138820y() {
        if (!((C99364n) mo138838C0()).mo138822a().mo32206f()) {
            Log.m105924i("MicroMsg.Music.MusicWechatPrivateLogic", "really exit music");
            this.f291357c = 1;
        }
    }

    /* renamed from: y0 */
    public void mo138821y0() {
        if (this.f291357c != 1) {
            int size = (this.f291358d + ((ArrayList) this.f291359e).size()) - 1;
            this.f291358d = size;
            this.f291358d = size % ((ArrayList) this.f291359e).size();
            ((C99364n) mo138838C0()).mo138833n(true);
            ((C99364n) mo138838C0()).mo138834o((C101106m) null);
        }
    }
}
