package j61;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import di3.C86312j;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import p441aq.C92054g;
import wh3.C102450c;

/* renamed from: j61.c */
public class C98905c extends MTimerHandler {

    /* renamed from: a */
    public static int f289930a;

    /* renamed from: b */
    public static C98905c f289931b;

    /* renamed from: c */
    public static C46445t f289932c;

    /* renamed from: d */
    public static C11385n f289933d = new C98906a();

    /* renamed from: j61.c$a */
    public class C98906a implements C11385n {
        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            if (i == 0 && i2 == 0) {
                C98905c.f289930a = 0;
                C98905c.m128727a().startTimer(50);
                return;
            }
            C98905c.m128727a().mo138242d();
        }
    }

    /* renamed from: j61.c$b */
    public static class C98907b implements MTimerHandler.CallBack {
        public C98907b() {
            C98905c.f289930a = 0;
        }

        public boolean onTimerExpired() {
            Class cls = C92054g.class;
            if (C98905c.f289930a >= 100) {
                C98905c.f289930a = 0;
                Log.m105918d("MicroMsg.emoji.EmojiTuziTool", "insert tuzi");
                ((C92054g) C86312j.m106911c(cls)).getClass();
                C102450c b = C30790w2.m39221h().mo57715b();
                EmojiGroupInfo emojiGroupInfo = new EmojiGroupInfo();
                emojiGroupInfo.field_productID = "17";
                emojiGroupInfo.field_packName = "emoji_custom_all";
                emojiGroupInfo.field_type = 1;
                emojiGroupInfo.field_sort = 1;
                emojiGroupInfo.field_idx = 0;
                emojiGroupInfo.field_packType = 4;
                emojiGroupInfo.field_packFlag = 1;
                emojiGroupInfo.field_lastUseTime = System.currentTimeMillis();
                b.insert(emojiGroupInfo);
                ((C92054g) C86312j.m106911c(cls)).zx0().mo127627a("17", 7, C98905c.f289930a, "");
                C98905c.m128728b();
                return false;
            }
            ((C92054g) C86312j.m106911c(cls)).zx0().mo127627a("17", 6, C98905c.f289930a, "");
            C98905c.f289930a += 2;
            return true;
        }
    }

    public C98905c(boolean z) {
        super(new C98907b(), z);
    }

    /* renamed from: a */
    public static final C98905c m128727a() {
        C98905c cVar = f289931b;
        if (cVar == null) {
            synchronized (C98905c.class) {
                if (f289931b == null) {
                    f289931b = new C98905c(true);
                }
            }
        } else {
            cVar.stopTimer();
        }
        return f289931b;
    }

    /* renamed from: b */
    public static void m128728b() {
        if (f289932c != null) {
            C86709a0.m107529k().f251779b.mo123458d(f289932c);
        }
        C86709a0.m107529k().f251779b.mo123470p(413, f289933d);
        Log.m105918d("MicroMsg.emoji.MockTuziDownloading", "remove listener");
    }

    /* renamed from: c */
    public void mo138241c() {
        f289930a = 0;
        f289932c = new C46445t("com.tencent.xin.emoticon.tusiji", 1);
        C86709a0.m107529k().f251779b.mo123460f(f289932c);
        C86709a0.m107529k().f251779b.mo123455a(413, f289933d);
        Log.m105918d("MicroMsg.emoji.MockTuziDownloading", "add listener");
    }

    /* renamed from: d */
    public void mo138242d() {
        stopTimer();
        ((C92054g) C86312j.m106911c(C92054g.class)).zx0().mo127627a("17", 3, f289930a, "");
        m128728b();
    }
}
