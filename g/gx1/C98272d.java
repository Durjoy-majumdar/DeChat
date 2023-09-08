package gx1;

import android.graphics.Bitmap;
import android.util.Pair;
import ax1.C39639c;
import ax1.C39641d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ex1.C45711d;
import ex1.C45712e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l60.C99344b;
import p196ln.C10579k;
import vd3.C78407r;

/* renamed from: gx1.d */
public class C98272d implements C78407r.C78409b, C78407r.C78410c {

    /* renamed from: d */
    public final List<WeakReference<C78407r>> f288100d = new ArrayList();

    /* renamed from: e */
    public final C78407r.C78409b f288101e;

    /* renamed from: gx1.d$a */
    public class C98273a implements C39639c.C39640a {

        /* renamed from: a */
        public final /* synthetic */ String f288102a;

        public C98273a(String str) {
            this.f288102a = str;
        }

        /* renamed from: a */
        public void mo62195a(Map<String, C39641d> map) {
            C39641d dVar = map.get(this.f288102a);
            if (dVar == null) {
                Log.m105928w("GameChatRoom.ChatRoomAvatarInterceptor", "get contact failed");
                return;
            }
            C99344b<C45982a, Bitmap> a = C98276f.f288107a.mo85955a(new C45982a(dVar.getAvatarUrl()));
            C98272d dVar2 = C98272d.this;
            dVar2.getClass();
            C98275e eVar = new C98275e(dVar2);
            a.getClass();
            a.f291320d = eVar;
            a.mo85953c();
        }
    }

    /* renamed from: gx1.d$b */
    public class C98274b implements C78407r.C78411d {

        /* renamed from: a */
        public final /* synthetic */ String f288104a;

        /* renamed from: b */
        public final /* synthetic */ C78407r f288105b;

        public C98274b(C98272d dVar, String str, C78407r rVar) {
            this.f288104a = str;
            this.f288105b = rVar;
        }

        /* renamed from: X */
        public boolean mo108362X(String str) {
            if (!this.f288104a.equals(str)) {
                return true;
            }
            C78407r.f229742r.post(this.f288105b.f229753q);
            this.f288105b.f229752p = null;
            return true;
        }
    }

    public C98272d(C78407r.C78409b bVar) {
        this.f288101e = bVar;
    }

    /* renamed from: E0 */
    public void mo10724E0(C78407r rVar) {
        if (rVar instanceof C10579k.C10580a) {
            Pair<String, Boolean> b = mo137572b(rVar.f229749j);
            boolean booleanValue = ((Boolean) b.second).booleanValue();
            String str = (String) b.first;
            if (booleanValue) {
                ((ArrayList) this.f288100d).add(new WeakReference(rVar));
                return;
            }
            rVar.f229752p = new C98274b(this, str, rVar);
            this.f288101e.mo10724E0(rVar);
        }
    }

    /* renamed from: O */
    public Bitmap mo10725O(String str) {
        Pair<String, Boolean> b = mo137572b(str);
        return ((Boolean) b.second).booleanValue() ? ov0(str, 0, 0, 0) : this.f288101e.mo10725O((String) b.first);
    }

    /* renamed from: a */
    public boolean mo108339a(String str) {
        return false;
    }

    /* renamed from: b */
    public final Pair<String, Boolean> mo137572b(String str) {
        return new Pair<>(str, Boolean.valueOf(str != null ? str.endsWith("@gamelifechatroom") : false));
    }

    public Bitmap loadBitmap(String str) {
        Pair<String, Boolean> b = mo137572b(str);
        return ((Boolean) b.second).booleanValue() ? ov0(str, 0, 0, 0) : this.f288101e.loadBitmap((String) b.first);
    }

    public Bitmap ov0(String str, int i, int i2, int i3) {
        String str2;
        Class cls = C39639c.class;
        Pair<String, Boolean> b = mo137572b(str);
        String str3 = (String) b.first;
        if (!((Boolean) b.second).booleanValue()) {
            return this.f288101e.ov0(str3, i, i2, i3);
        }
        C39641d X3 = ((C39639c) C86312j.m106911c(cls)).mo62193X3(str3);
        if (X3 != null) {
            str2 = Util.nullAsNil(X3.getAvatarUrl());
        } else {
            List<C45711d> m = ((C45712e) C86312j.m106911c(C45712e.class)).mo71208m(str3);
            str2 = !Util.isNullOrNil((List) m) ? Util.nullAsNil(m.get(0).field_avatarURL) : null;
        }
        Log.m105924i("ChatroomMemberPreloadManager.avatar", "AvatarUrl =  " + str2);
        if (str2 != null) {
            C99344b<C45982a, Bitmap> a = C98276f.f288107a.mo85955a(new C45982a(str2));
            Bitmap e = a.mo138757e();
            if (e != null && !e.isRecycled()) {
                return e;
            }
            a.f291320d = new C98275e(this);
            a.mo85953c();
        }
        ((C39639c) C86312j.m106911c(cls)).lx0(str3, new C98273a(str3));
        return null;
    }

    /* renamed from: qq */
    public Bitmap mo10728qq() {
        return this.f288101e.mo10728qq();
    }
}
