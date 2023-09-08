package va1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C45286l;
import di3.C86312j;
import eb0.C97625j3;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import ke3.C88144b;
import ob0.C11385n;
import ob0.C117747y;
import p214om.C11502f;
import p248ug.C52574z;
import sf0.C48374j0;
import te3.C77961kx3;
import te3.C77967mx3;

/* renamed from: va1.b */
public class C78377b {

    /* renamed from: d */
    public static Map<String, C78379b> f229681d;

    /* renamed from: a */
    public String f229682a;

    /* renamed from: b */
    public Context f229683b;

    /* renamed from: c */
    public final C11385n f229684c = new C78378a();

    /* renamed from: va1.b$a */
    public class C78378a implements C11385n {
        public C78378a() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C97625j3.m125815e().mo123470p(106, this);
            if (i == 0 && i2 == 0) {
                Log.m105924i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: searched data.");
                C77967mx3 l0 = ((C45286l) yVar).mo70811l0();
                Log.m105925i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: contact count: %d", Integer.valueOf(l0.f227845D));
                if (l0.f227845D > 0) {
                    if (l0.f227846E.isEmpty()) {
                        Log.m105924i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: no result is retrieved. start to search UI");
                        C78377b.m94640a(C78377b.this, l0);
                    }
                    if (l0.f227846E.size() > 1) {
                        try {
                            Intent intent = new Intent();
                            intent.putExtra("add_more_friend_search_scene", 3);
                            intent.putExtra("result", l0.toByteArray());
                            Log.m105924i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: more than one contact is resolved. starting to ContactSearchResultUI");
                            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93176i(intent, C78377b.this.f229683b);
                        } catch (IOException e) {
                            Log.printErrStackTrace("MicroMsg.RedirectToChattingByPhoneHelper", e, "", new Object[0]);
                        }
                    } else {
                        C78377b.this.mo108337e(l0.f227846E.getFirst());
                    }
                } else {
                    Log.m105924i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: only one result is retrieved. start to chatting directly");
                    C78377b.this.mo108338f(l0);
                }
            } else {
                Log.m105929w("MicroMsg.RedirectToChattingByPhoneHelper", "hy: err net.errType: %d, errCode: %d", Integer.valueOf(i), Integer.valueOf(i2));
                C78377b.m94640a(C78377b.this, (C77967mx3) null);
            }
        }
    }

    /* renamed from: va1.b$b */
    public class C78379b {

        /* renamed from: a */
        public String f229686a;

        /* renamed from: b */
        public C77967mx3 f229687b;

        /* renamed from: c */
        public C77961kx3 f229688c;

        public C78379b(C78377b bVar, String str, C77967mx3 mx32, C77961kx3 kx32) {
            this.f229686a = str;
            this.f229687b = mx32;
            this.f229688c = kx32;
        }
    }

    public C78377b(Context context, String str, boolean z) {
        this.f229683b = context;
        this.f229682a = str;
    }

    /* renamed from: a */
    public static void m94640a(C78377b bVar, C77967mx3 mx32) {
        bVar.getClass();
        Intent intent = new Intent();
        intent.putExtra("add_more_friend_search_scene", 3);
        if (mx32 != null) {
            try {
                intent.putExtra("result", mx32.toByteArray());
            } catch (IOException e) {
                Log.m105921e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: IOException: %s", e.toString());
            }
        }
        Log.m105924i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: more than one contact is resolved. starting to ContactSearchResultUI");
        ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93176i(intent, bVar.f229683b);
    }

    /* renamed from: b */
    public final void mo108334b(String str, C78379b bVar) {
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: username is null when put to cache");
            return;
        }
        if (f229681d == null) {
            f229681d = new HashMap();
        }
        f229681d.put(str, bVar);
    }

    /* renamed from: c */
    public final int mo108335c(String str, C77967mx3 mx32, C77961kx3 kx32) {
        if (this.f229683b == null) {
            Log.m105928w("MicroMsg.RedirectToChattingByPhoneHelper", "hy: error param. start redirect param error: context is null");
            return -1;
        } else if (!Util.isNullOrNil(str) && C97625j3.m125812b().mo105907v().mo69724s3(str)) {
            Log.m105924i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: is friend. direct to chatting");
            mo108336d(str);
            return 0;
        } else if (mx32 != null) {
            Log.m105924i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: direct via searchResp");
            mo108338f(mx32);
            return 1;
        } else if (kx32 != null) {
            Log.m105924i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: direct via SearchContactItem");
            mo108337e(kx32);
            return 1;
        } else {
            Log.m105920e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: no matching for starting redirect");
            return -1;
        }
    }

    /* renamed from: d */
    public final void mo108336d(String str) {
        Intent intent = new Intent();
        intent.putExtra("Chat_User", str);
        intent.putExtra("finish_direct", false);
        C88144b.m109801s(this.f229683b, ".ui.chatting.ChattingUI", intent, (Bundle) null);
    }

    /* renamed from: e */
    public final void mo108337e(C77961kx3 kx32) {
        if (kx32 == null) {
            Log.m105920e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: start to profile failed: item or context is null");
            return;
        }
        String g = C48374j0.m53718g(kx32.f227763d);
        if (!Util.isNullOrNil(g)) {
            mo108334b(this.f229682a, new C78379b(this, C48374j0.m53718g(kx32.f227763d), (C77967mx3) null, kx32));
            if (C97625j3.m125812b().mo105907v().mo69724s3(g)) {
                Log.m105924i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: search item is friend. start to chatting");
                mo108336d(g);
                return;
            }
            Intent intent = new Intent();
            ((C52574z) C86312j.m106911c(C52574z.class)).mo73535ek(intent, kx32, 15);
            intent.putExtra("add_more_friend_search_scene", 2);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93174g(intent, this.f229683b);
            return;
        }
        Log.m105920e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: start failed: no user name");
    }

    /* renamed from: f */
    public final void mo108338f(C77967mx3 mx32) {
        if (mx32 == null) {
            Log.m105920e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: start to profile failed: resp or context is null");
            return;
        }
        String g = C48374j0.m53718g(mx32.f227857d);
        if (!Util.isNullOrNil(g)) {
            mo108334b(this.f229682a, new C78379b(this, C48374j0.m53718g(mx32.f227857d), mx32, (C77961kx3) null));
            if (C97625j3.m125812b().mo105907v().mo69724s3(g)) {
                Log.m105924i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: search response is friend. start to chatting");
                mo108336d(g);
                return;
            }
            Intent intent = new Intent();
            ((C52574z) C86312j.m106911c(C52574z.class)).mo73528B0(intent, mx32, 15);
            intent.putExtra("add_more_friend_search_scene", 2);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93174g(intent, this.f229683b);
            return;
        }
        Log.m105920e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: start failed: no user name");
    }
}
