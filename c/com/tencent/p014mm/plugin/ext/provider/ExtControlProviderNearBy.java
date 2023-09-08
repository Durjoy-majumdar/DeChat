package com.tencent.p014mm.plugin.ext.provider;

import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import cc0.C92411b;
import cc2.C54713e;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatAuthorities;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import ob0.C11385n;
import ob0.C117747y;
import p196ln.C10579k;
import p196ln.C76706g;
import p196ln.C76708i;
import te3.C78019ym2;
import ya1.C102829c;
import zh3.C119117d;

/* renamed from: com.tencent.mm.plugin.ext.provider.ExtControlProviderNearBy */
public final class ExtControlProviderNearBy extends ExtContentProviderBase implements C10579k.C10580a {

    /* renamed from: A */
    public static final UriMatcher f269517A;

    /* renamed from: B */
    public static boolean f269518B = false;

    /* renamed from: C */
    public static MTimerHandler f269519C = new MTimerHandler(new C93373a(), false);

    /* renamed from: z */
    public static final String[] f269520z = {"nickname", "avatar", "distance", "signature", "sex"};

    /* renamed from: o */
    public int f269521o;

    /* renamed from: p */
    public List<C78019ym2> f269522p;

    /* renamed from: q */
    public C92411b f269523q;

    /* renamed from: r */
    public C119117d f269524r;

    /* renamed from: s */
    public Set<String> f269525s;

    /* renamed from: t */
    public CountDownLatch f269526t;

    /* renamed from: u */
    public CountDownLatch f269527u;

    /* renamed from: v */
    public boolean f269528v;

    /* renamed from: w */
    public boolean f269529w = false;

    /* renamed from: x */
    public C11385n f269530x = new C93374b();

    /* renamed from: y */
    public C92411b.C92412a f269531y = new C93375c();

    /* renamed from: com.tencent.mm.plugin.ext.provider.ExtControlProviderNearBy$a */
    public class C93373a implements MTimerHandler.CallBack {
        public boolean onTimerExpired() {
            ExtControlProviderNearBy.f269518B = false;
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ext.provider.ExtControlProviderNearBy$b */
    public class C93374b implements C11385n {
        public C93374b() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            if ((yVar instanceof C54713e) && ExtControlProviderNearBy.this.f269526t != null) {
                C54713e eVar = (C54713e) yVar;
                Log.m105924i("MicroMsg.ExtControlProviderNearBy", "get lbsfriend errcode: " + i2 + ", errType: " + i);
                if (i == 0 && i2 == 0) {
                    ExtControlProviderNearBy.this.f269522p = eVar.mo75608j0();
                    List<C78019ym2> list = ExtControlProviderNearBy.this.f269522p;
                    if (list == null || list.size() == 0) {
                        Log.m105920e("MicroMsg.ExtControlProviderNearBy", "get lbsfriend list size:0");
                        ExtControlProviderNearBy.this.f269526t.countDown();
                    } else {
                        if (ExtControlProviderNearBy.this.f269522p.size() > 10) {
                            Log.m105924i("MicroMsg.ExtControlProviderNearBy", "get lbsfriend size > 10," + ExtControlProviderNearBy.this.f269522p.size());
                            List<C78019ym2> list2 = ExtControlProviderNearBy.this.f269522p;
                            list2.subList(10, list2.size()).clear();
                        }
                        ExtControlProviderNearBy.this.f269527u = new CountDownLatch(ExtControlProviderNearBy.this.f269522p.size());
                        ExtControlProviderNearBy.this.f269526t.countDown();
                        ExtControlProviderNearBy extControlProviderNearBy = ExtControlProviderNearBy.this;
                        extControlProviderNearBy.getClass();
                        ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93557b(extControlProviderNearBy);
                        if (extControlProviderNearBy.f269524r == null) {
                            extControlProviderNearBy.f269524r = new C119117d(ExtControlProviderNearBy.f269520z);
                        }
                        for (C78019ym2 m : extControlProviderNearBy.f269522p) {
                            extControlProviderNearBy.mo128181m(m);
                        }
                        extControlProviderNearBy.f269527u.countDown();
                    }
                } else {
                    Log.m105920e("MicroMsg.ExtControlProviderNearBy", "get lbsfriend failed: errCode = " + i2 + ", errType=" + i);
                    ExtControlProviderNearBy.this.f269526t.countDown();
                }
                ExtControlProviderNearBy.m117930l(ExtControlProviderNearBy.this);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.ext.provider.ExtControlProviderNearBy$c */
    public class C93375c implements C92411b.C92412a {
        public C93375c() {
        }

        public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            ExtControlProviderNearBy extControlProviderNearBy = ExtControlProviderNearBy.this;
            if (extControlProviderNearBy.f269529w) {
                return false;
            }
            extControlProviderNearBy.f269529w = true;
            if (!z) {
                Log.m105920e("MicroMsg.ExtControlProviderNearBy", "get location failed");
                ExtControlProviderNearBy.m117930l(ExtControlProviderNearBy.this);
                ExtControlProviderNearBy.this.f269526t.countDown();
                return false;
            }
            C86709a0.m107524d().mo123460f(new C54713e(extControlProviderNearBy.f269521o, f, f2, (int) d2, i, "", ""));
            return false;
        }
    }

    static {
        String AUTHORITIES_PLUGIN_EXT_NEARBY = WeChatAuthorities.AUTHORITIES_PLUGIN_EXT_NEARBY();
        UriMatcher uriMatcher = new UriMatcher(-1);
        f269517A = uriMatcher;
        uriMatcher.addURI(AUTHORITIES_PLUGIN_EXT_NEARBY, "male", 1);
        uriMatcher.addURI(AUTHORITIES_PLUGIN_EXT_NEARBY, "female", 2);
        uriMatcher.addURI(AUTHORITIES_PLUGIN_EXT_NEARBY, "all", 0);
    }

    /* renamed from: l */
    public static void m117930l(ExtControlProviderNearBy extControlProviderNearBy) {
        extControlProviderNearBy.getClass();
        Log.m105926v("MicroMsg.ExtControlProviderNearBy", "stop()");
        if (!C97625j3.m125811a()) {
            Log.m105924i("MicroMsg.ExtControlProviderNearBy", "!MMCore.hasSetUin()");
            return;
        }
        C86709a0.m107524d().mo123470p(148, extControlProviderNearBy.f269530x);
        boolean z = true;
        Object[] objArr = new Object[1];
        if (extControlProviderNearBy.f269523q != null) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        Log.m105927v("MicroMsg.ExtControlProviderNearBy", "releaseLbsManager(), lbsManager == null ? [%s]", objArr);
        C92411b bVar = extControlProviderNearBy.f269523q;
        if (bVar != null) {
            bVar.mo126408b(extControlProviderNearBy.f269531y);
        }
    }

    /* renamed from: p */
    public static void m117931p(boolean z) {
        if (z) {
            f269518B = true;
            f269519C.startTimer(15000);
            return;
        }
        f269519C.startTimer(0);
    }

    /* renamed from: X */
    public void mo1428X(String str) {
        Log.m105924i("MicroMsg.ExtControlProviderNearBy", "notifyChanged: " + str);
        if (this.f269528v) {
            Log.m105924i("MicroMsg.ExtControlProviderNearBy", "has finished");
            return;
        }
        mo128181m(mo128182n(str));
        this.f269527u.countDown();
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        this.f269521o = -1;
        int match = f269517A.match(uri);
        if (match == 0) {
            this.f269521o = 1;
            return null;
        } else if (match == 1) {
            this.f269521o = 3;
            return null;
        } else if (match != 2) {
            this.f269521o = -1;
            return null;
        } else {
            this.f269521o = 4;
            return null;
        }
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    /* renamed from: m */
    public final void mo128181m(C78019ym2 ym22) {
        String str;
        if (ym22 == null || (str = ym22.f228622d) == null) {
            Log.m105920e("MicroMsg.ExtControlProviderNearBy", "lbsContactInfo is null or lbsContactInfo's userName is null");
            return;
        }
        ((HashSet) this.f269525s).add(str);
        Bitmap N50 = ((C76708i) C86312j.m106911c(C76708i.class)).N50(ym22.f228622d);
        Log.m105924i("MicroMsg.ExtControlProviderNearBy", "countDownLatchGet now count: " + this.f269527u.getCount());
        if (N50 != null) {
            Log.m105924i("MicroMsg.ExtControlProviderNearBy", "countDownLatchGet countDown now");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[0];
            if (N50.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream)) {
                bArr = byteArrayOutputStream.toByteArray();
            }
            ((HashSet) this.f269525s).remove(ym22.f228622d);
            this.f269524r.mo183794a(new Object[]{ym22.f228623e, bArr, ym22.f228627i, ym22.f228626h, Integer.valueOf(ym22.f228628j)});
            Log.m105925i("MicroMsg.ExtControlProviderNearBy", "bitmap recycle %s", N50);
            N50.recycle();
        }
    }

    /* renamed from: n */
    public final C78019ym2 mo128182n(String str) {
        if (str == null || str.length() <= 0) {
            Log.m105920e("MicroMsg.ExtControlProviderNearBy", "username is null or nill");
            return null;
        }
        for (C78019ym2 next : this.f269522p) {
            if (next.f228622d.equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: o */
    public final void mo128183o() {
        this.f269522p = new ArrayList();
        this.f269524r = new C119117d(f269520z);
        this.f269526t = new CountDownLatch(1);
        this.f269527u = null;
        this.f269525s = new HashSet();
        this.f269522p = new ArrayList();
        this.f269528v = false;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Log.m105924i("MicroMsg.ExtControlProviderNearBy", "query() " + uri);
        Context context = getContext();
        this.f269494g = uri == null ? "" : Util.nullAsNil(uri.getQueryParameter("appid"));
        mo128172e(context);
        this.f269496i = 15;
        this.f269492e = Util.currentTicks();
        if (uri == null) {
            mo128176i(3);
            return null;
        } else if (Util.isNullOrNil(this.f269494g) || Util.isNullOrNil(mo128169b())) {
            mo128176i(3);
            return null;
        } else if (f269518B) {
            Log.m105928w("MicroMsg.ExtControlProviderNearBy", "isDoingRequest, return null");
            mo128176i(5);
            return null;
        } else {
            m117931p(true);
            if (!mo128168a()) {
                m117931p(false);
                mo128176i(1);
                return this.f269491d;
            } else if (!mo128174g(getContext())) {
                Log.m105928w("MicroMsg.ExtControlProviderNearBy", "invalid appid ! return null");
                m117931p(false);
                mo128176i(2);
                return null;
            } else {
                Log.m105924i("MicroMsg.ExtControlProviderNearBy", "find type = " + this.f269521o);
                getType(uri);
                if (this.f269521o < 0) {
                    Log.m105920e("MicroMsg.ExtControlProviderNearBy", "unkown uri, return null");
                    m117931p(false);
                    mo128176i(3);
                    return null;
                }
                try {
                    mo128183o();
                    Log.m105926v("MicroMsg.ExtControlProviderNearBy", "start()");
                    if (!C97625j3.m125811a()) {
                        Log.m105924i("MicroMsg.ExtControlProviderNearBy", "!MMCore.hasSetUin()");
                    } else {
                        C86709a0.m107524d().mo123455a(148, this.f269530x);
                        MMHandlerThread.postToMainThread(new C102829c(this));
                    }
                    Log.m105924i("MicroMsg.ExtControlProviderNearBy", "wait for get lbs info");
                    CountDownLatch countDownLatch = this.f269526t;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    if (!countDownLatch.await(15000, timeUnit)) {
                        Log.m105928w("MicroMsg.ExtControlProviderNearBy", "countDownLatchWait time out");
                    }
                    if (this.f269527u != null) {
                        Log.m105924i("MicroMsg.ExtControlProviderNearBy", "get lbs info success, wait for get lbs friend");
                        if (!this.f269527u.await(15000, timeUnit)) {
                            Log.m105928w("MicroMsg.ExtControlProviderNearBy", "countDownLatchGet time out");
                        }
                    } else {
                        Log.m105924i("MicroMsg.ExtControlProviderNearBy", "not init countDownGet. return null");
                    }
                } catch (Exception e) {
                    Log.m105928w("MicroMsg.ExtControlProviderNearBy", e.getMessage());
                    Log.printErrStackTrace("MicroMsg.ExtControlProviderNearBy", e, "", new Object[0]);
                    mo128176i(4);
                }
                m117931p(false);
                ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93567p(this);
                this.f269528v = true;
                if (((HashSet) this.f269525s).size() > 0) {
                    Iterator it = ((HashSet) this.f269525s).iterator();
                    while (it.hasNext()) {
                        String str3 = (String) it.next();
                        Log.m105924i("MicroMsg.ExtControlProviderNearBy", "add lbsfriend has no avatar: " + str3);
                        C78019ym2 n = mo128182n(str3);
                        if (!(n == null || n.f228622d == null)) {
                            this.f269524r.mo183794a(new Object[]{n.f228623e, null, n.f228627i, n.f228626h, Integer.valueOf(n.f228628j)});
                        }
                    }
                } else {
                    Log.m105924i("MicroMsg.ExtControlProviderNearBy", "all user has got avatar");
                }
                C119117d dVar = this.f269524r;
                if (dVar == null || dVar.f356724f <= 0) {
                    mo128176i(4);
                } else {
                    mo128176i(0);
                }
                Log.m105924i("MicroMsg.ExtControlProviderNearBy", "return now");
                return this.f269524r;
            }
        }
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
