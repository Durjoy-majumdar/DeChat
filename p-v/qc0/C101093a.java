package qc0;

import android.text.TextUtils;
import com.tencent.p014mm.autogen.events.MusicActionEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: qc0.a */
public class C101093a {

    /* renamed from: qc0.a$a */
    public class C101094a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C101106m f295932d;

        public C101094a(C101106m mVar) {
            this.f295932d = mVar;
        }

        public void run() {
            MusicActionEvent musicActionEvent = new MusicActionEvent();
            MusicActionEvent.C92531a aVar = musicActionEvent.f264920d;
            aVar.f264922a = 3;
            aVar.f264923b = this.f295932d;
            musicActionEvent.publish();
        }
    }

    /* renamed from: qc0.a$b */
    public class C101095b implements Runnable {
        public void run() {
            MusicActionEvent musicActionEvent = new MusicActionEvent();
            musicActionEvent.f264920d.f264922a = 1;
            musicActionEvent.publish();
        }
    }

    /* renamed from: qc0.a$c */
    public class C101096c implements Runnable {
        public void run() {
            MusicActionEvent musicActionEvent = new MusicActionEvent();
            musicActionEvent.f264920d.f264922a = 2;
            musicActionEvent.publish();
        }
    }

    /* renamed from: qc0.a$d */
    public class C101097d implements Runnable {
        public void run() {
            MusicActionEvent musicActionEvent = new MusicActionEvent();
            musicActionEvent.f264920d.f264922a = -1;
            musicActionEvent.publish();
        }
    }

    /* renamed from: qc0.a$e */
    public class C101098e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C101106m f295933d;

        public C101098e(C101106m mVar) {
            this.f295933d = mVar;
        }

        public void run() {
            MusicActionEvent musicActionEvent = new MusicActionEvent();
            MusicActionEvent.C92531a aVar = musicActionEvent.f264920d;
            aVar.f264922a = 0;
            aVar.f264923b = this.f295933d;
            musicActionEvent.publish();
        }
    }

    /* renamed from: a */
    public static C12155j m132479a() {
        MusicActionEvent musicActionEvent = new MusicActionEvent();
        musicActionEvent.f264920d.f264922a = 8;
        musicActionEvent.publish();
        return musicActionEvent.f264921e.f264933d;
    }

    /* renamed from: b */
    public static C101106m m132480b() {
        MusicActionEvent musicActionEvent = new MusicActionEvent();
        musicActionEvent.f264920d.f264922a = -2;
        musicActionEvent.publish();
        return musicActionEvent.f264921e.f264930a;
    }

    /* renamed from: c */
    public static boolean m132481c() {
        MusicActionEvent musicActionEvent = new MusicActionEvent();
        musicActionEvent.f264920d.f264922a = -3;
        musicActionEvent.publish();
        return musicActionEvent.f264921e.f264931b;
    }

    /* renamed from: d */
    public static boolean m132482d(C101106m mVar) {
        if (mVar == null) {
            return false;
        }
        int i = mVar.f295959d;
        return i == 1 || i == 8 || i == 9;
    }

    /* renamed from: e */
    public static boolean m132483e() {
        MusicActionEvent musicActionEvent = new MusicActionEvent();
        musicActionEvent.f264920d.f264922a = 9;
        musicActionEvent.publish();
        return musicActionEvent.f264921e.f264931b;
    }

    /* renamed from: f */
    public static final String m132484f(String str) {
        Log.m105925i("MicroMsg.MusicHelper", "markMusicVipIdPrefix:%s", str);
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return "getlinkclisdkmid_" + str;
    }

    /* renamed from: g */
    public static final void m132485g() {
        MMHandlerThread.postToMainThread(new C101095b());
    }

    /* renamed from: h */
    public static final void m132486h() {
        MMHandlerThread.postToMainThread(new C101096c());
    }

    /* renamed from: i */
    public static boolean m132487i(int i) {
        MusicActionEvent musicActionEvent = new MusicActionEvent();
        MusicActionEvent.C92531a aVar = musicActionEvent.f264920d;
        aVar.f264922a = 7;
        aVar.f264927f = i;
        musicActionEvent.publish();
        return musicActionEvent.f264921e.f264931b;
    }

    /* renamed from: j */
    public static void m132488j(C101106m mVar) {
        MMHandlerThread.postToMainThread(new C101098e(mVar));
    }

    /* renamed from: k */
    public static void m132489k(C101106m mVar) {
        MMHandlerThread.postToMainThread(new C101094a(mVar));
    }

    /* renamed from: l */
    public static final void m132490l() {
        MMHandlerThread.postToMainThread(new C101097d());
    }

    /* renamed from: m */
    public static void m132491m(C101106m mVar) {
        MusicActionEvent musicActionEvent = new MusicActionEvent();
        MusicActionEvent.C92531a aVar = musicActionEvent.f264920d;
        aVar.f264922a = 16;
        aVar.f264923b = mVar;
        musicActionEvent.publish();
    }
}
