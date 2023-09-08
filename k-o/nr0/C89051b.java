package nr0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.C0125s;
import com.google.android.gms.common.internal.ImagesContract;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.plugin.appbrand.share.widget.WxaShareMessagePage;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import h81.C32735h;
import j20.C117292a;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ji3.C9457a;
import junit.framework.Assert;
import kb0.C76529i;
import kg3.C76577a;
import lb0.C88394b;
import mr0.C11081b;

@C86522b(dependencies = {PluginAppBrand.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: nr0.b */
public class C89051b extends C86301e implements C76529i {

    /* renamed from: d */
    public final Map<String, SoftReference<C88394b.C88405h>> f256702d = new ConcurrentHashMap();

    /* renamed from: e */
    public final Map<String, SoftReference<C88394b.C88408j>> f256703e = new ConcurrentHashMap();

    /* renamed from: f */
    public final Map<Integer, C35010d> f256704f = new ConcurrentHashMap();

    /* renamed from: g */
    public final Map<Integer, Bundle> f256705g = new ConcurrentHashMap();

    /* renamed from: nr0.b$a */
    public class C35009a implements C35010d {
        public C35009a() {
        }

        /* renamed from: a */
        public void mo59822a(Bundle bundle) {
            C89051b.this.f256705g.remove(2);
        }
    }

    /* renamed from: nr0.b$d */
    public interface C35010d {
        /* renamed from: a */
        void mo59822a(Bundle bundle);
    }

    /* renamed from: nr0.b$b */
    public class C89052b implements View.OnClickListener {
        public C89052b(C89051b bVar) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/share/api/WxaShareMessageService$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/share/api/WxaShareMessageService$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: nr0.b$c */
    public class C89053c implements C35010d {

        /* renamed from: a */
        public final /* synthetic */ WxaShareMessagePage f256706a;

        /* renamed from: b */
        public final /* synthetic */ C76529i.C76531b f256707b;

        /* renamed from: nr0.b$c$a */
        public class C89054a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bundle f256709d;

            public C89054a(Bundle bundle) {
                this.f256709d = bundle;
            }

            public void run() {
                String string = this.f256709d.getString("delay_load_img_path");
                C89053c.this.f256706a.setImageUrl(string);
                Log.m105925i("MicroMsg.WxaShareMessageService", "onLoadImageFinishedAction(%s)", string);
                C89053c cVar = C89053c.this;
                C89051b.this.vx0(cVar.f256707b, 0);
            }
        }

        public C89053c(WxaShareMessagePage wxaShareMessagePage, C76529i.C76531b bVar) {
            this.f256706a = wxaShareMessagePage;
            this.f256707b = bVar;
        }

        /* renamed from: a */
        public void mo59822a(Bundle bundle) {
            C9457a.m9138b(true, new C89054a(bundle));
        }
    }

    public C89051b() {
        wx0(1, new C35009a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0029, code lost:
        if (r1 == null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        if (r1 == null) goto L_0x0040;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* renamed from: Hc */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public lb0.C88394b.C88405h mo106759Hc(int r5, int r6, kb0.C76529i.C76530a r7) {
        /*
            r4 = this;
            java.lang.String r0 = "%d-%d-dp"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r3 = 0
            r1[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r3 = 1
            r1[r3] = r2
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.util.Map<java.lang.String, java.lang.ref.SoftReference<lb0.b$h>> r1 = r4.f256702d
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r1 = r1.get(r0)
            java.lang.ref.SoftReference r1 = (java.lang.ref.SoftReference) r1
            if (r1 == 0) goto L_0x002b
            java.lang.Object r1 = r1.get()
            lb0.b$h r1 = (lb0.C88394b.C88405h) r1
            if (r1 != 0) goto L_0x0064
        L_0x002b:
            monitor-enter(r4)
            java.util.Map<java.lang.String, java.lang.ref.SoftReference<lb0.b$h>> r1 = r4.f256702d     // Catch:{ all -> 0x0065 }
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch:{ all -> 0x0065 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0065 }
            java.lang.ref.SoftReference r1 = (java.lang.ref.SoftReference) r1     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x0040
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0065 }
            lb0.b$h r1 = (lb0.C88394b.C88405h) r1     // Catch:{ all -> 0x0065 }
            if (r1 != 0) goto L_0x0063
        L_0x0040:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0065 }
            int r5 = kg3.C76577a.m92151b(r1, r5)     // Catch:{ all -> 0x0065 }
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0065 }
            int r6 = kg3.C76577a.m92151b(r1, r6)     // Catch:{ all -> 0x0065 }
            mr0.a r1 = new mr0.a     // Catch:{ all -> 0x0065 }
            r1.<init>(r5, r6)     // Catch:{ all -> 0x0065 }
            r1.f256246f = r7     // Catch:{ all -> 0x0065 }
            java.util.Map<java.lang.String, java.lang.ref.SoftReference<lb0.b$h>> r5 = r4.f256702d     // Catch:{ all -> 0x0065 }
            java.lang.ref.SoftReference r6 = new java.lang.ref.SoftReference     // Catch:{ all -> 0x0065 }
            r6.<init>(r1)     // Catch:{ all -> 0x0065 }
            java.util.concurrent.ConcurrentHashMap r5 = (java.util.concurrent.ConcurrentHashMap) r5     // Catch:{ all -> 0x0065 }
            r5.put(r0, r6)     // Catch:{ all -> 0x0065 }
        L_0x0063:
            monitor-exit(r4)     // Catch:{ all -> 0x0065 }
        L_0x0064:
            return r1
        L_0x0065:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0065 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: nr0.C89051b.mo106759Hc(int, int, kb0.i$a):lb0.b$h");
    }

    /* renamed from: I7 */
    public View mo106760I7(Context context, Bundle bundle, boolean z, C76529i.C76532c cVar) {
        Assert.assertNotNull(context);
        WxaShareMessagePage wxaShareMessagePage = new WxaShareMessagePage(context);
        if (bundle != null) {
            wxaShareMessagePage.mo116923e(bundle);
        }
        boolean z2 = false;
        boolean z3 = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_group_todo_disable, 0) == 1;
        if (z && !z3) {
            z2 = true;
        }
        wxaShareMessagePage.mo116925g(z2, cVar);
        if (context instanceof C0125s) {
            ((C0125s) context).getLifecycle().addObserver(wxaShareMessagePage);
        }
        return wxaShareMessagePage;
    }

    public C88394b.C88405h Ij0(int i, int i2) {
        return mo106759Hc(i, i2, C76529i.C76530a.DECODE_TYPE_DEFAULT);
    }

    /* renamed from: jI */
    public boolean mo106762jI(String str, View view, Bundle bundle) {
        return sh0(str, view, bundle, (C76529i.C76531b) null);
    }

    /* renamed from: kb */
    public synchronized void mo106763kb(int i, Bundle bundle) {
        C35010d dVar = (C35010d) ((ConcurrentHashMap) this.f256704f).get(Integer.valueOf(i));
        if (dVar != null) {
            dVar.mo59822a(bundle);
        }
        ((ConcurrentHashMap) this.f256705g).put(Integer.valueOf(i), bundle);
        Log.m105925i("MicroMsg.WxaShareMessageService", "onAction(%d, %s)", Integer.valueOf(i), bundle);
    }

    public void ks0(String str, View view) {
        Assert.assertNotNull(view);
        if (view instanceof WxaShareMessagePage) {
            Log.m105925i("MicroMsg.WxaShareMessageService", "onUnbindView(%s, %s)", str, Integer.valueOf(view.hashCode()));
            WxaShareMessagePage wxaShareMessagePage = (WxaShareMessagePage) view;
            ((ConcurrentHashMap) this.f256704f).remove(2);
        }
    }

    public boolean sh0(String str, View view, Bundle bundle, C76529i.C76531b bVar) {
        Bitmap f;
        Bitmap decodeByteArray;
        Assert.assertNotNull(view);
        Assert.assertNotNull(bundle);
        if (!(view instanceof WxaShareMessagePage)) {
            return false;
        }
        Log.m105925i("MicroMsg.WxaShareMessageService", "onBindView(%s, %s)", str, Integer.valueOf(view.hashCode()));
        WxaShareMessagePage wxaShareMessagePage = (WxaShareMessagePage) view;
        boolean z = bundle.getBoolean("is_dynamic_page");
        wxaShareMessagePage.setTitle(bundle.getString(FFmpegMetadataRetriever.METADATA_KEY_TITLE, ""));
        boolean z2 = bundle.getBoolean("is_video", false);
        int i = bundle.getInt("sub_type", 0);
        if (z2 || i == 1) {
            wxaShareMessagePage.getVideoIcon().setVisibility(0);
        } else {
            wxaShareMessagePage.getVideoIcon().setVisibility(8);
        }
        if (!z) {
            wxaShareMessagePage.getCoverImageView().setVisibility(0);
            byte[] byteArray = bundle.getByteArray(ImagesContract.IMAGE_DATA);
            if (byteArray == null || byteArray.length <= 0 || (decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length)) == null || decodeByteArray.isRecycled()) {
                String string = bundle.getString("delay_load_img_path");
                if (z2) {
                    String string2 = bundle.getString("video_path");
                    String string3 = bundle.getString("video_thumb_path");
                    if (!Util.isNullOrNil(string3)) {
                        Bitmap f2 = C88394b.m110233l().mo122790f(string3);
                        if (f2 == null || f2.isRecycled()) {
                            wxaShareMessagePage.mo1907b();
                            vx0(bVar, 1);
                        } else {
                            wxaShareMessagePage.setImageData(f2);
                            vx0(bVar, 0);
                            return true;
                        }
                    }
                    if (!Util.isNullOrNil(string2)) {
                        wxaShareMessagePage.getCoverImageView().setOnClickListener(new C89052b(this));
                    }
                } else if (!Util.isNullOrNil(string)) {
                    Bitmap bitmap = null;
                    if (!string.startsWith("delayLoadFile://")) {
                        bitmap = C88394b.m110233l().mo122790f(string);
                        Log.m105925i("MicroMsg.WxaShareMessageService", "findCachedLocal(%s)", string);
                    } else if (((ConcurrentHashMap) this.f256705g).containsKey(2)) {
                        bitmap = BitmapUtil.getBitmapNative(string.replace("delayLoadFile://", ""));
                        Log.m105925i("MicroMsg.WxaShareMessageService", "getBitmapNative(%s)", string);
                    }
                    if (bitmap != null) {
                        if (!bitmap.isRecycled()) {
                            wxaShareMessagePage.setImageData(bitmap);
                            vx0(bVar, 0);
                        } else {
                            wxaShareMessagePage.setOnLoadImageResult(bVar);
                            wxaShareMessagePage.setImageUrl(string);
                        }
                        return true;
                    }
                    Log.m105925i("MicroMsg.WxaShareMessageService", "delay loadImage(%s)", string);
                    wxaShareMessagePage.getLoadingView().setVisibility(0);
                    wxaShareMessagePage.getErrorImageView().setVisibility(4);
                    wxaShareMessagePage.getCoverImageView().setVisibility(4);
                    wxaShareMessagePage.getLoadingView().mo119903e();
                    wx0(2, new C89053c(wxaShareMessagePage, bVar));
                } else {
                    String string4 = bundle.getString("image_url");
                    if (string4 != null && (string4.startsWith(HttpWrapperBase.PROTOCAL_HTTP) || string4.startsWith(HttpWrapperBase.PROTOCAL_HTTPS))) {
                        wxaShareMessagePage.setOnLoadImageResult(bVar);
                        wxaShareMessagePage.setImageUrl(string4);
                    } else if (string4 == null || !string4.startsWith("file://") || (f = C88394b.m110233l().mo122790f(string4)) == null || f.isRecycled()) {
                        wxaShareMessagePage.mo1907b();
                        vx0(bVar, 1);
                    } else {
                        wxaShareMessagePage.setImageData(f);
                        vx0(bVar, 0);
                        return true;
                    }
                }
            } else {
                wxaShareMessagePage.setImageData(decodeByteArray);
                vx0(bVar, 0);
                return true;
            }
        }
        return true;
    }

    /* renamed from: ul */
    public C88394b.C88408j mo106766ul(int i, int i2) {
        C88394b.C88408j jVar;
        String format = String.format("%d-%d-dp", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        SoftReference softReference = (SoftReference) ((ConcurrentHashMap) this.f256703e).get(format);
        if (softReference == null || (jVar = (C88394b.C88408j) softReference.get()) == null) {
            synchronized (this) {
                SoftReference softReference2 = (SoftReference) ((ConcurrentHashMap) this.f256703e).get(format);
                if (softReference2 == null || (jVar = (C88394b.C88408j) softReference2.get()) == null) {
                    jVar = new C11081b(C76577a.m92151b(MMApplicationContext.getContext(), i), C76577a.m92151b(MMApplicationContext.getContext(), i2));
                    ((ConcurrentHashMap) this.f256703e).put(format, new SoftReference(jVar));
                }
            }
        }
        return jVar;
    }

    public final void vx0(C76529i.C76531b bVar, int i) {
        if (bVar != null) {
            bVar.mo94358a(i);
        }
    }

    public final void wx0(int i, C35010d dVar) {
        this.f256704f.put(Integer.valueOf(i), dVar);
        if (this.f256705g.containsKey(Integer.valueOf(i))) {
            dVar.mo59822a(this.f256705g.get(Integer.valueOf(i)));
        }
    }
}
