package mb2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.feature.sight.api.ISightJNIService;
import com.tencent.p014mm.plugin.gallery.model.C56791j;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import k20.C60958c;
import k20.C9556a;
import nb2.C61645c0;
import org.json.JSONObject;
import p143ds.C58433i;
import qw1.C63341j;
import sb2.C63844s;

/* renamed from: mb2.c */
public final class C61461c extends RecyclerView.C16613e<RecyclerView.C16631z> {

    /* renamed from: d */
    public final Context f174776d;

    /* renamed from: e */
    public ArrayList<GalleryItem$MediaItem> f174777e = new ArrayList<>();

    /* renamed from: f */
    public int f174778f = 2000;

    /* renamed from: g */
    public int f174779g = Integer.MAX_VALUE;

    /* renamed from: h */
    public final SimpleDateFormat f174780h = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());

    /* renamed from: i */
    public final LinkedList<C61473e> f174781i = new LinkedList<>();

    /* renamed from: j */
    public final View.OnClickListener f174782j = new C61471g(this);

    /* renamed from: n */
    public final View.OnLongClickListener f174783n = new C61470f(this);

    /* renamed from: o */
    public C61464c f174784o;

    /* renamed from: p */
    public final View.OnClickListener f174785p = new C61469e(this);

    /* renamed from: mb2.c$a */
    public static final class C61462a extends RecyclerView.C16631z {

        /* renamed from: A */
        public TextView f174786A;

        /* renamed from: B */
        public CheckBox f174787B;

        /* renamed from: z */
        public ImageView f174788z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61462a(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.gqq);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.media_thumb)");
            this.f174788z = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.kzh);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.type_mask_tv)");
            this.f174786A = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.gpy);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.media_cbx)");
            this.f174787B = (CheckBox) findViewById3;
        }
    }

    /* renamed from: mb2.c$b */
    public static final class C61463b extends RecyclerView.C16631z {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61463b(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
        }
    }

    /* renamed from: mb2.c$c */
    public interface C61464c {
        /* renamed from: a */
        void mo86438a(int i, View view, int i2);

        /* renamed from: b */
        boolean mo86439b(boolean z, GalleryItem$MediaItem galleryItem$MediaItem);
    }

    /* renamed from: mb2.c$d */
    public static final class C61465d implements Runnable {

        /* renamed from: i */
        public static final C61466a f174789i = new C61466a((C8480h) null);

        /* renamed from: j */
        public static final HashMap<TextView, C61465d> f174790j = new HashMap<>();

        /* renamed from: d */
        public WeakReference<TextView> f174791d;

        /* renamed from: e */
        public WeakReference<View> f174792e;

        /* renamed from: f */
        public final GalleryItem$VideoMediaItem f174793f;

        /* renamed from: g */
        public final C61468b f174794g;

        /* renamed from: h */
        public boolean f174795h;

        /* renamed from: mb2.c$d$a */
        public static final class C61466a {

            /* renamed from: mb2.c$d$a$a */
            public static final class C61467a implements C61468b {

                /* renamed from: a */
                public final /* synthetic */ int f174796a;

                /* renamed from: b */
                public final /* synthetic */ int f174797b;

                public C61467a(int i, int i2) {
                    this.f174796a = i;
                    this.f174797b = i2;
                }

                /* renamed from: a */
                public void mo86446a(C61465d dVar, int i, boolean z) {
                    View view;
                    if ((dVar != null ? dVar.f174791d : null) != null) {
                        WeakReference<TextView> weakReference = dVar.f174791d;
                        C87412m.m108591d(weakReference);
                        TextView textView = weakReference.get();
                        if (textView != null && (view = dVar.f174792e.get()) != null) {
                            C61465d.f174789i.mo86445b(textView, view, i, this.f174796a, this.f174797b, z);
                            C61465d.f174790j.remove(textView);
                        }
                    }
                }
            }

            public C61466a(C8480h hVar) {
            }

            /* renamed from: a */
            public final void mo86444a(TextView textView, View view, GalleryItem$VideoMediaItem galleryItem$VideoMediaItem, int i, int i2) {
                C61465d dVar;
                if (textView == null || view == null || galleryItem$VideoMediaItem == null) {
                    Log.m105920e("Music.MusicMvAlbumAdapter", "Error input for duration fetcher");
                    return;
                }
                HashMap<TextView, C61465d> hashMap = C61465d.f174790j;
                if (hashMap.containsKey(textView) && (dVar = hashMap.get(textView)) != null) {
                    if (!C87412m.m108589b(dVar.f174793f, galleryItem$VideoMediaItem)) {
                        WeakReference<TextView> weakReference = dVar.f174791d;
                        C87412m.m108591d(weakReference);
                        if (C87412m.m108589b(textView, weakReference.get())) {
                            dVar.f174791d = new WeakReference<>((Object) null);
                            dVar.f174792e = new WeakReference<>((Object) null);
                            dVar.f174795h = true;
                        }
                    } else {
                        return;
                    }
                }
                int i3 = galleryItem$VideoMediaItem.f162766w;
                if (i3 >= 0) {
                    Log.m105925i("Music.MusicMvAlbumAdapter", "Directly attach durationMs %d to tv, path %s", Integer.valueOf(i3), galleryItem$VideoMediaItem);
                    mo86445b(textView, view, galleryItem$VideoMediaItem.f162766w, i, i2, galleryItem$VideoMediaItem.f162759s);
                    hashMap.remove(textView);
                    return;
                }
                textView.setText("");
                C61465d dVar2 = new C61465d(textView, view, galleryItem$VideoMediaItem, new C61467a(i, i2), (C8480h) null);
                ((C56791j) C86312j.m106911c(C56791j.class)).mo80179QB(dVar2);
                hashMap.put(textView, dVar2);
            }

            /* renamed from: b */
            public final void mo86445b(TextView textView, View view, int i, int i2, int i3, boolean z) {
                TextView textView2 = textView;
                View view2 = view;
                if (textView2 != null) {
                    if (i < 0) {
                        textView2.setText("--:--");
                        return;
                    }
                    int a = C61645c0.m72361a(i);
                    int c = C61645c0.m72363c(i2);
                    int b = C61645c0.m72362b(i3);
                    if (view2 != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Float.valueOf(1.0f));
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$SimpleVideoAnalysisTask$Companion", "setResult", "(Landroid/widget/TextView;Landroid/view/View;IIIZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$SimpleVideoAnalysisTask$Companion", "setResult", "(Landroid/widget/TextView;Landroid/view/View;IIIZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        if (a < c || a > b || z) {
                            C9556a aVar2 = new C9556a();
                            aVar2.mo10233c(Float.valueOf(0.1f));
                            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$SimpleVideoAnalysisTask$Companion", "setResult", "(Landroid/widget/TextView;Landroid/view/View;IIIZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                            C117292a.m165359e(view, "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$SimpleVideoAnalysisTask$Companion", "setResult", "(Landroid/widget/TextView;Landroid/view/View;IIIZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        } else {
                            C9556a aVar3 = new C9556a();
                            aVar3.mo10233c(Float.valueOf(1.0f));
                            C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$SimpleVideoAnalysisTask$Companion", "setResult", "(Landroid/widget/TextView;Landroid/view/View;IIIZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            view2.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                            C117292a.m165359e(view, "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$SimpleVideoAnalysisTask$Companion", "setResult", "(Landroid/widget/TextView;Landroid/view/View;IIIZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        }
                    }
                    String valueOf = String.valueOf(a % 60);
                    if (valueOf.length() < 2) {
                        valueOf = '0' + valueOf;
                    }
                    textView2.setText((a / 60) + XVFSFile.PATH_SEPARATOR_CHAR + valueOf);
                }
            }
        }

        /* renamed from: mb2.c$d$b */
        public interface C61468b {
            /* renamed from: a */
            void mo86446a(C61465d dVar, int i, boolean z);
        }

        public C61465d(TextView textView, View view, GalleryItem$VideoMediaItem galleryItem$VideoMediaItem, C61468b bVar, C8480h hVar) {
            this.f174791d = new WeakReference<>(textView);
            this.f174792e = new WeakReference<>(view);
            this.f174793f = galleryItem$VideoMediaItem;
            this.f174794g = bVar;
        }

        /* renamed from: a */
        public final void mo86440a() {
            Class cls = ISightJNIService.class;
            if (this.f174793f != null) {
                long currentTicks = Util.currentTicks();
                try {
                    String e = this.f174793f.mo80159e();
                    C87412m.m108593f(e, "mediaItem.thumbPath");
                    String simpleMp4InfoVFS = ((ISightJNIService) C86312j.m106911c(cls)).getSimpleMp4InfoVFS(e);
                    C87412m.m108593f(simpleMp4InfoVFS, "getService(ISightJNIServ…getSimpleMp4InfoVFS(path)");
                    Log.m105919d("Music.MusicMvAlbumAdapter", "get simple mp4 info %s", simpleMp4InfoVFS);
                    JSONObject jSONObject = new JSONObject(simpleMp4InfoVFS);
                    this.f174793f.f162766w = jSONObject.getInt("videoDuration");
                    this.f174793f.f162767x = jSONObject.getInt(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT);
                    this.f174793f.f162768y = jSONObject.getInt(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH);
                    this.f174793f.f162769z = jSONObject.getInt("videoBitrate");
                    this.f174793f.f162762B = jSONObject.getInt("videoFPS");
                    this.f174793f.f162763C = ((ISightJNIService) C86312j.m106911c(cls)).getMp4RotateVFS(e);
                    GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = this.f174793f;
                    galleryItem$VideoMediaItem.f162761A = 0;
                    galleryItem$VideoMediaItem.f162764u = C63341j.m74673a(jSONObject.getString("videoType"));
                    this.f174793f.f162765v = C63341j.m74673a(jSONObject.getString("audioType"));
                } catch (Exception e2) {
                    Log.printErrStackTrace("Music.MusicMvAlbumAdapter", e2, "loadItemFromSimpleMP4Info fail", new Object[0]);
                }
                Log.m105919d("Music.MusicMvAlbumAdapter", "loadItemFromSimpleMP4Info mediaItem: %s", this.f174793f);
                Log.m105925i("Music.MusicMvAlbumAdapter", "loadItemFromSimpleMP4Info used %sms", Long.valueOf(Util.ticksToNow(currentTicks)));
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C61465d)) {
                return false;
            }
            return C87412m.m108589b(this.f174793f, ((C61465d) obj).f174793f);
        }

        public int hashCode() {
            GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = this.f174793f;
            if (galleryItem$VideoMediaItem != null) {
                return galleryItem$VideoMediaItem.hashCode();
            }
            return 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: java.lang.String} */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x02be, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x02bf, code lost:
            r21 = r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x02c2, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:0x02c3, code lost:
            r9 = "Music.MusicMvAlbumAdapter";
            r17 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x01e0, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x01e1, code lost:
            r21 = r12;
            r22 = r13;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:127:0x02be A[ExcHandler: all (th java.lang.Throwable), PHI: r12 
          PHI: (r12v2 oj.b) = (r12v0 oj.b), (r12v3 oj.b), (r12v3 oj.b), (r12v3 oj.b), (r12v3 oj.b), (r12v3 oj.b) binds: [B:38:0x016d, B:43:0x0180, B:52:0x01a0, B:53:?, B:47:0x0193, B:48:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:38:0x016d] */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x02f6  */
        /* JADX WARNING: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x012c  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0131  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r23 = this;
                r1 = r23
                java.lang.Class<h81.h> r2 = h81.C32735h.class
                boolean r0 = r1.f174795h
                if (r0 == 0) goto L_0x0009
                return
            L_0x0009:
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r0 = r1.f174793f
                gy3.C87412m.m108591d(r0)
                java.lang.String r0 = r0.mo80159e()
                java.lang.String r3 = "mediaItem!!.thumbPath"
                gy3.C87412m.m108593f(r0, r3)
                di3.d r4 = di3.C86312j.m106911c(r2)
                h81.h r4 = (h81.C32735h) r4
                h81.h$c r5 = h81.C32735h.C32737c.clicfg_album_device_configuration
                java.lang.String r6 = ""
                java.lang.String r4 = r4.Y60(r5, r6)
                java.lang.String r5 = "getService(IExptService:…device_configuration, \"\")"
                gy3.C87412m.m108593f(r4, r5)
                boolean r5 = android.text.TextUtils.isEmpty(r4)
                java.lang.String r7 = "Music.MusicMvAlbumAdapter"
                r8 = 2
                r9 = 1
                r10 = 0
                if (r5 == 0) goto L_0x0038
                goto L_0x012a
            L_0x0038:
                java.lang.Object[] r5 = new java.lang.Object[r9]
                r5[r10] = r4
                java.lang.String r11 = "devices configuration: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r11, r5)
                r5 = 4
                java.lang.Object[] r11 = new java.lang.Object[r5]
                int r12 = android.os.Build.VERSION.SDK_INT
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r11[r10] = r12
                java.lang.String r12 = android.os.Build.MANUFACTURER
                r11[r9] = r12
                java.lang.String r12 = android.os.Build.BRAND
                r11[r8] = r12
                java.lang.String r12 = p156gj.C87203t.m108275k()
                r13 = 3
                r11[r13] = r12
                java.lang.String r12 = "android version: %s, manufacturer: %s, brand: %s, model: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r12, r11)
                org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ JSONException -> 0x011f }
                r11.<init>(r4)     // Catch:{ JSONException -> 0x011f }
                java.lang.String r4 = "devices"
                java.lang.String r4 = r11.optString(r4)     // Catch:{ JSONException -> 0x011f }
                java.lang.String r12 = "`object`.optString(\"devices\")"
                gy3.C87412m.m108593f(r4, r12)     // Catch:{ JSONException -> 0x011f }
                java.lang.String r12 = "maxsize"
                int r11 = r11.optInt(r12)     // Catch:{ JSONException -> 0x011f }
                org.json.JSONArray r12 = new org.json.JSONArray     // Catch:{ JSONException -> 0x011f }
                r12.<init>(r4)     // Catch:{ JSONException -> 0x011f }
                int r4 = r12.length()     // Catch:{ JSONException -> 0x011f }
                r14 = 0
            L_0x0081:
                if (r14 >= r4) goto L_0x0129
                org.json.JSONObject r15 = r12.optJSONObject(r14)     // Catch:{ JSONException -> 0x011f }
                java.lang.String r5 = "array.optJSONObject(i)"
                gy3.C87412m.m108593f(r15, r5)     // Catch:{ JSONException -> 0x011f }
                java.lang.String r5 = android.os.Build.MANUFACTURER     // Catch:{ JSONException -> 0x011f }
                java.lang.String r8 = "brand"
                java.lang.String r8 = r15.optString(r8)     // Catch:{ JSONException -> 0x011f }
                boolean r8 = z04.C112551y.m153809i(r5, r8, r9)     // Catch:{ JSONException -> 0x011f }
                if (r8 == 0) goto L_0x0116
                java.lang.String r8 = p156gj.C87203t.m108275k()     // Catch:{ JSONException -> 0x011f }
                java.lang.String r10 = "model"
                java.lang.String r10 = r15.optString(r10)     // Catch:{ JSONException -> 0x011f }
                boolean r8 = z04.C112551y.m153809i(r8, r10, r9)     // Catch:{ JSONException -> 0x011f }
                if (r8 == 0) goto L_0x0116
                long r17 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)     // Catch:{ JSONException -> 0x011f }
                if (r11 == 0) goto L_0x00d3
                int r8 = r11 * 1024
                int r8 = r8 * 1024
                long r9 = (long) r8     // Catch:{ JSONException -> 0x011f }
                int r8 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
                if (r8 <= 0) goto L_0x00d3
                java.lang.String r4 = "hit devices but it is too big, fileSize: %s, maxSize: %s, filePath: %s"
                java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch:{ JSONException -> 0x011f }
                java.lang.Long r8 = java.lang.Long.valueOf(r17)     // Catch:{ JSONException -> 0x011f }
                r9 = 0
                r5[r9] = r8     // Catch:{ JSONException -> 0x011f }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r11)     // Catch:{ JSONException -> 0x011f }
                r9 = 1
                r5[r9] = r8     // Catch:{ JSONException -> 0x011f }
                r8 = 2
                r5[r8] = r0     // Catch:{ JSONException -> 0x011f }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r4, r5)     // Catch:{ JSONException -> 0x011f }
                goto L_0x0129
            L_0x00d3:
                java.lang.String r8 = "androidVersion"
                int r8 = r15.optInt(r8)     // Catch:{ JSONException -> 0x011f }
                r9 = -1
                if (r9 != r8) goto L_0x00f4
                java.lang.String r0 = "hit devices all version, manufacturer: %s, brand: %s, model: %s"
                java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch:{ JSONException -> 0x011f }
                r8 = 0
                r4[r8] = r5     // Catch:{ JSONException -> 0x011f }
                java.lang.String r5 = android.os.Build.BRAND     // Catch:{ JSONException -> 0x011f }
                r8 = 1
                r4[r8] = r5     // Catch:{ JSONException -> 0x011f }
                java.lang.String r5 = p156gj.C87203t.m108275k()     // Catch:{ JSONException -> 0x011f }
                r8 = 2
                r4[r8] = r5     // Catch:{ JSONException -> 0x011f }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r4)     // Catch:{ JSONException -> 0x011f }
            L_0x00f2:
                r10 = 1
                goto L_0x012a
            L_0x00f4:
                int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ JSONException -> 0x011f }
                if (r9 != r8) goto L_0x0116
                java.lang.String r0 = "hit devices, version: %s, manufacturer: %s, brand: %s, model: %s"
                r8 = 4
                java.lang.Object[] r4 = new java.lang.Object[r8]     // Catch:{ JSONException -> 0x011f }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch:{ JSONException -> 0x011f }
                r9 = 0
                r4[r9] = r8     // Catch:{ JSONException -> 0x011f }
                r8 = 1
                r4[r8] = r5     // Catch:{ JSONException -> 0x011f }
                java.lang.String r5 = android.os.Build.BRAND     // Catch:{ JSONException -> 0x011f }
                r8 = 2
                r4[r8] = r5     // Catch:{ JSONException -> 0x011f }
                java.lang.String r5 = p156gj.C87203t.m108275k()     // Catch:{ JSONException -> 0x011f }
                r4[r13] = r5     // Catch:{ JSONException -> 0x011f }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r4)     // Catch:{ JSONException -> 0x011f }
                goto L_0x00f2
            L_0x0116:
                r8 = 4
                int r14 = r14 + 1
                r5 = 4
                r8 = 2
                r9 = 1
                r10 = 0
                goto L_0x0081
            L_0x011f:
                r0 = move-exception
                r4 = 0
                java.lang.Object[] r5 = new java.lang.Object[r4]
                java.lang.String r4 = "parse json error"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r4, r5)
            L_0x0129:
                r10 = 0
            L_0x012a:
                if (r10 == 0) goto L_0x0131
                r23.mo86440a()
                goto L_0x02f1
            L_0x0131:
                di3.d r0 = di3.C86312j.m106911c(r2)
                h81.h r0 = (h81.C32735h) r0
                h81.h$c r2 = h81.C32735h.C32737c.clicfg_album_get_video_info
                r4 = 0
                int r0 = r0.mo58779Qe(r2, r4)
                r2 = 1
                if (r0 != r2) goto L_0x0143
                r0 = 1
                goto L_0x0144
            L_0x0143:
                r0 = 0
            L_0x0144:
                if (r0 == 0) goto L_0x014b
                r23.mo86440a()
                goto L_0x02f1
            L_0x014b:
                java.lang.String r0 = "frame-rate"
                java.lang.String r2 = "i-frame-interval"
                java.lang.String r4 = "bitrate"
                java.lang.String r5 = "width"
                java.lang.String r8 = "height"
                java.lang.String r9 = "durationUs"
                long r10 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                oj.b r12 = new oj.b
                r12.<init>()
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r13 = r1.f174793f
                gy3.C87412m.m108591d(r13)
                java.lang.String r13 = r13.mo80159e()
                gy3.C87412m.m108593f(r13, r3)
                r12.mo161392k(r13)     // Catch:{ Exception -> 0x02c2, all -> 0x02be }
                int r3 = r12.mo161385d()     // Catch:{ Exception -> 0x02c2, all -> 0x02be }
                r14 = 0
                r16 = r6
                r17 = r10
                r15 = r14
                r6 = 0
            L_0x017b:
                java.lang.String r10 = "mime"
                if (r6 >= r3) goto L_0x01e7
                android.media.MediaFormat r11 = r12.mo161386e(r6)     // Catch:{ Exception -> 0x01e0, all -> 0x02be }
                r19 = r3
                java.lang.String r3 = "extractor.getTrackFormat(i)"
                gy3.C87412m.m108593f(r11, r3)     // Catch:{ Exception -> 0x01e0, all -> 0x02be }
                boolean r3 = r11.containsKey(r10)     // Catch:{ Exception -> 0x01e0, all -> 0x02be }
                if (r3 != 0) goto L_0x01a0
                java.lang.String r3 = "find video mime : not found."
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r3)     // Catch:{ Exception -> 0x019c, all -> 0x02be }
                r21 = r12
                r22 = r13
                r12 = 0
                goto L_0x01d7
            L_0x019c:
                r0 = move-exception
                r9 = r7
                goto L_0x02c6
            L_0x01a0:
                java.lang.String r3 = r11.getString(r10)     // Catch:{ Exception -> 0x01e0, all -> 0x02be }
                r20 = r11
                java.lang.String r11 = "find video mime : %s"
                r21 = r12
                r22 = r13
                r12 = 1
                java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x02bb }
                r12 = 0
                r13[r12] = r3     // Catch:{ Exception -> 0x02bb }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r11, r13)     // Catch:{ Exception -> 0x02bb }
                if (r3 != 0) goto L_0x01b8
                goto L_0x01d7
            L_0x01b8:
                java.lang.String r11 = "video/"
                boolean r11 = z04.C112551y.m153819s(r3, r11, r12)     // Catch:{ Exception -> 0x02bb }
                if (r11 == 0) goto L_0x01c6
                if (r14 != 0) goto L_0x01d2
                r14 = r20
                goto L_0x01d2
            L_0x01c6:
                java.lang.String r11 = "audio/"
                boolean r3 = z04.C112551y.m153819s(r3, r11, r12)     // Catch:{ Exception -> 0x02bb }
                if (r3 == 0) goto L_0x01d2
                if (r15 != 0) goto L_0x01d2
                r15 = r20
            L_0x01d2:
                if (r15 == 0) goto L_0x01d7
                if (r14 == 0) goto L_0x01d7
                goto L_0x01eb
            L_0x01d7:
                int r6 = r6 + 1
                r3 = r19
                r12 = r21
                r13 = r22
                goto L_0x017b
            L_0x01e0:
                r0 = move-exception
                r21 = r12
                r22 = r13
                goto L_0x02bc
            L_0x01e7:
                r21 = r12
                r22 = r13
            L_0x01eb:
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r3 = r1.f174793f     // Catch:{ Exception -> 0x02bb }
                if (r3 == 0) goto L_0x0295
                if (r14 == 0) goto L_0x027e
                boolean r6 = r14.containsKey(r9)     // Catch:{ Exception -> 0x02bb }
                if (r6 != 0) goto L_0x01fa
                r9 = r7
                r6 = 0
                goto L_0x0204
            L_0x01fa:
                long r11 = r14.getLong(r9)     // Catch:{ Exception -> 0x02bb }
                r6 = 1000(0x3e8, float:1.401E-42)
                r9 = r7
                long r6 = (long) r6
                long r11 = r11 / r6
                int r6 = (int) r11     // Catch:{ Exception -> 0x027a }
            L_0x0204:
                r3.f162766w = r6     // Catch:{ Exception -> 0x027a }
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r3 = r1.f174793f     // Catch:{ Exception -> 0x027a }
                boolean r6 = r14.containsKey(r8)     // Catch:{ Exception -> 0x027a }
                if (r6 != 0) goto L_0x0210
                r6 = 0
                goto L_0x0214
            L_0x0210:
                int r6 = r14.getInteger(r8)     // Catch:{ Exception -> 0x027a }
            L_0x0214:
                r3.f162767x = r6     // Catch:{ Exception -> 0x027a }
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r3 = r1.f174793f     // Catch:{ Exception -> 0x027a }
                boolean r6 = r14.containsKey(r5)     // Catch:{ Exception -> 0x027a }
                if (r6 != 0) goto L_0x0220
                r5 = 0
                goto L_0x0224
            L_0x0220:
                int r5 = r14.getInteger(r5)     // Catch:{ Exception -> 0x027a }
            L_0x0224:
                r3.f162768y = r5     // Catch:{ Exception -> 0x027a }
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r3 = r1.f174793f     // Catch:{ Exception -> 0x027a }
                boolean r5 = r14.containsKey(r10)     // Catch:{ Exception -> 0x027a }
                if (r5 != 0) goto L_0x0231
                r5 = r16
                goto L_0x0235
            L_0x0231:
                java.lang.String r5 = r14.getString(r10)     // Catch:{ Exception -> 0x027a }
            L_0x0235:
                r3.f162764u = r5     // Catch:{ Exception -> 0x027a }
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r3 = r1.f174793f     // Catch:{ Exception -> 0x027a }
                boolean r5 = r14.containsKey(r4)     // Catch:{ Exception -> 0x027a }
                if (r5 != 0) goto L_0x0241
                r4 = 0
                goto L_0x0245
            L_0x0241:
                int r4 = r14.getInteger(r4)     // Catch:{ Exception -> 0x027a }
            L_0x0245:
                r3.f162769z = r4     // Catch:{ Exception -> 0x027a }
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r3 = r1.f174793f     // Catch:{ Exception -> 0x027a }
                boolean r4 = r14.containsKey(r2)     // Catch:{ Exception -> 0x027a }
                if (r4 != 0) goto L_0x0251
                r2 = 0
                goto L_0x0255
            L_0x0251:
                int r2 = r14.getInteger(r2)     // Catch:{ Exception -> 0x027a }
            L_0x0255:
                r3.f162761A = r2     // Catch:{ Exception -> 0x027a }
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r2 = r1.f174793f     // Catch:{ Exception -> 0x027a }
                boolean r3 = r14.containsKey(r0)     // Catch:{ Exception -> 0x027a }
                if (r3 != 0) goto L_0x0261
                r0 = 0
                goto L_0x0265
            L_0x0261:
                int r0 = r14.getInteger(r0)     // Catch:{ Exception -> 0x027a }
            L_0x0265:
                r2.f162762B = r0     // Catch:{ Exception -> 0x027a }
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r0 = r1.f174793f     // Catch:{ Exception -> 0x027a }
                java.lang.Class<com.tencent.mm.feature.sight.api.ISightJNIService> r2 = com.tencent.p014mm.feature.sight.api.ISightJNIService.class
                di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x027a }
                com.tencent.mm.feature.sight.api.ISightJNIService r2 = (com.tencent.p014mm.feature.sight.api.ISightJNIService) r2     // Catch:{ Exception -> 0x027a }
                r3 = r22
                int r2 = r2.getMp4RotateVFS(r3)     // Catch:{ Exception -> 0x02b9 }
                r0.f162763C = r2     // Catch:{ Exception -> 0x02b9 }
                goto L_0x0281
            L_0x027a:
                r0 = move-exception
            L_0x027b:
                r3 = r22
                goto L_0x02c9
            L_0x027e:
                r9 = r7
                r3 = r22
            L_0x0281:
                if (r15 == 0) goto L_0x0298
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r0 = r1.f174793f     // Catch:{ Exception -> 0x02b9 }
                boolean r2 = r15.containsKey(r10)     // Catch:{ Exception -> 0x02b9 }
                if (r2 != 0) goto L_0x028e
                r6 = r16
                goto L_0x0292
            L_0x028e:
                java.lang.String r6 = r15.getString(r10)     // Catch:{ Exception -> 0x02b9 }
            L_0x0292:
                r0.f162765v = r6     // Catch:{ Exception -> 0x02b9 }
                goto L_0x0298
            L_0x0295:
                r9 = r7
                r3 = r22
            L_0x0298:
                java.lang.String r0 = "loadItemFromExtractor mediaItem: %s"
                r2 = 1
                java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x02b9 }
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r2 = r1.f174793f     // Catch:{ Exception -> 0x02b9 }
                r5 = 0
                r4[r5] = r2     // Catch:{ Exception -> 0x02b9 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r0, r4)     // Catch:{ Exception -> 0x02b9 }
                java.lang.String r0 = "mediaItem format:%s, videoPath:%s"
                r2 = 2
                java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x02b9 }
                r4[r5] = r14     // Catch:{ Exception -> 0x02b9 }
                r2 = 1
                r4[r2] = r3     // Catch:{ Exception -> 0x02b9 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r0, r4)     // Catch:{ Exception -> 0x02b9 }
                r21.mo161388g()
                r3 = 1
                goto L_0x02de
            L_0x02b9:
                r0 = move-exception
                goto L_0x02c9
            L_0x02bb:
                r0 = move-exception
            L_0x02bc:
                r9 = r7
                goto L_0x027b
            L_0x02be:
                r0 = move-exception
                r21 = r12
                goto L_0x0324
            L_0x02c2:
                r0 = move-exception
                r9 = r7
                r17 = r10
            L_0x02c6:
                r21 = r12
                r3 = r13
            L_0x02c9:
                java.lang.String r2 = "Video extractor init failed. video path = [%s] e = [%s]"
                r4 = 2
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0323 }
                r5 = 0
                r4[r5] = r3     // Catch:{ all -> 0x0323 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0323 }
                r3 = 1
                r4[r3] = r0     // Catch:{ all -> 0x0323 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r2, r4)     // Catch:{ all -> 0x0323 }
                r21.mo161388g()
            L_0x02de:
                java.lang.Object[] r0 = new java.lang.Object[r3]
                long r2 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r17)
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r3 = 0
                r0[r3] = r2
                java.lang.String r2 = "loadItemFromExtractor used %sms"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r0)
            L_0x02f1:
                boolean r0 = r1.f174795h
                if (r0 == 0) goto L_0x02f6
                goto L_0x0322
            L_0x02f6:
                android.os.Looper r0 = android.os.Looper.myLooper()
                android.os.Looper r2 = android.os.Looper.getMainLooper()
                boolean r0 = gy3.C87412m.m108589b(r0, r2)
                if (r0 == 0) goto L_0x031a
                mb2.c$d$b r0 = r1.f174794g
                if (r0 == 0) goto L_0x0322
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r2 = r1.f174793f
                gy3.C87412m.m108591d(r2)
                int r2 = r2.f162766w
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r3 = r1.f174793f
                gy3.C87412m.m108591d(r3)
                boolean r3 = r3.f162759s
                r0.mo86446a(r1, r2, r3)
                goto L_0x0322
            L_0x031a:
                mb2.f r0 = new mb2.f
                r0.<init>(r1)
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            L_0x0322:
                return
            L_0x0323:
                r0 = move-exception
            L_0x0324:
                r21.mo161388g()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: mb2.C61461c.C61465d.run():void");
        }
    }

    /* renamed from: mb2.c$e */
    public static final class C61469e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C61461c f174798d;

        public C61469e(C61461c cVar) {
            this.f174798d = cVar;
        }

        public final void onClick(View view) {
            C61464c cVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$mOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Object tag = view.getTag(C0966R.C0970id.n_e);
            int intValue = tag instanceof Integer ? ((Number) tag).intValue() : -1;
            Object tag2 = view.getTag(C0966R.C0970id.n_f);
            int intValue2 = tag2 instanceof Integer ? ((Number) tag2).intValue() : -1;
            if (!(intValue == -1 || intValue2 == -1 || (cVar = this.f174798d.f174784o) == null || cVar == null)) {
                cVar.mo86438a(intValue, view, intValue2);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$mOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: mb2.c$f */
    public static final class C61470f implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C61461c f174799d;

        public C61470f(C61461c cVar) {
            this.f174799d = cVar;
        }

        public final boolean onLongClick(View view) {
            GalleryItem$MediaItem F4;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$onItemViewLongClick$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            Object tag = view.getTag(C0966R.C0970id.n_e);
            C87412m.m108593f(tag, "v.getTag(R.id.item_position2)");
            if ((tag instanceof Integer) && (F4 = this.f174799d.mo86436F4(((Number) tag).intValue())) != null) {
                ClipboardHelper.setText(this.f174799d.f174776d, "media info", F4.toString());
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$onItemViewLongClick$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: mb2.c$g */
    public static final class C61471g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C61461c f174800d;

        public C61471g(C61461c cVar) {
            this.f174800d = cVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Object tag = view.getTag(C0966R.C0970id.n_e);
            if (tag == null || !(tag instanceof Integer)) {
                Log.m105920e("Music.MusicMvAlbumAdapter", "error tag");
                C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            Number number = (Number) tag;
            GalleryItem$MediaItem F4 = this.f174800d.mo86436F4(number.intValue());
            if (F4 == null || Util.isNullOrNil(F4.f162747d)) {
                Log.m105920e("Music.MusicMvAlbumAdapter", "[onClick] null == item!");
                this.f174800d.notifyItemChanged(number.intValue());
                C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            Log.m105924i("Music.MusicMvAlbumAdapter", "click image path:" + F4.f162747d);
            boolean z = F4.f162759s ^ true;
            F4.f162759s = z;
            C61464c cVar = this.f174800d.f174784o;
            Boolean valueOf = cVar != null ? Boolean.valueOf(cVar.mo86439b(z, F4)) : null;
            if (valueOf != null && !valueOf.booleanValue()) {
                F4.f162759s = false;
            }
            this.f174800d.notifyItemChanged(number.intValue());
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C61461c(Context context) {
        C87412m.m108594g(context, "mContext");
        this.f174776d = context;
        notifyDataSetChanged();
    }

    /* renamed from: F4 */
    public final GalleryItem$MediaItem mo86436F4(int i) {
        if (i < this.f174781i.size()) {
            Log.m105925i("Music.MusicMvAlbumAdapter", "get header, pos[%d]", Integer.valueOf(i));
            return null;
        }
        int size = i - this.f174781i.size();
        if (size < this.f174777e.size()) {
            return this.f174777e.get(size);
        }
        Log.m105929w("Music.MusicMvAlbumAdapter", "get item error, media items size[%d], adjustPos[%d]", Integer.valueOf(this.f174777e.size()), Integer.valueOf(size));
        return null;
    }

    /* renamed from: G4 */
    public final int mo86437G4() {
        return this.f174777e.size();
    }

    public int getItemCount() {
        return this.f174781i.size() + this.f174777e.size();
    }

    public int getItemViewType(int i) {
        if (i < this.f174781i.size()) {
            return this.f174781i.get(i).f174801a;
        }
        return 1;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        String str;
        RecyclerView.C16631z zVar2 = zVar;
        int i2 = i;
        Class cls = C63844s.class;
        C87412m.m108594g(zVar2, "holder");
        if (zVar2 instanceof C61463b) {
            zVar2.f44854d.setTag(C0966R.C0970id.n_e, Integer.valueOf(i));
            zVar2.f44854d.setTag(C0966R.C0970id.n_f, 2);
            zVar2.f44854d.setOnClickListener(this.f174785p);
        } else if (zVar2 instanceof C61462a) {
            zVar2.f44854d.setTag(C0966R.C0970id.n_e, Integer.valueOf(i));
            zVar2.f44854d.setTag(C0966R.C0970id.n_f, 1);
            zVar2.f44854d.setOnClickListener(this.f174785p);
            GalleryItem$MediaItem F4 = mo86436F4(i2);
            if (F4 == null) {
                Log.m105920e("Music.MusicMvAlbumAdapter", "get item failed");
                return;
            }
            String e = F4.mo80159e();
            C87412m.m108593f(e, "item.thumbPath");
            String str2 = F4.f162747d;
            C87412m.m108593f(str2, "item.originalPath");
            if (!Util.isNullOrNil(e) || !Util.isNullOrNil(str2)) {
                C61462a aVar = (C61462a) zVar2;
                aVar.f174788z.setAlpha(1.0f);
                C39818r rVar = C39818r.f106831a;
                if (((C63844s) rVar.mo62443b(this.f174776d).mo75002a(cls)).mo88634d3()) {
                    aVar.f174787B.setChecked(F4.f162759s);
                    if (F4 instanceof GalleryItem$VideoMediaItem) {
                        aVar.f174786A.setVisibility(0);
                        C61465d.C61466a aVar2 = C61465d.f174789i;
                        TextView textView = aVar.f174786A;
                        aVar2.mo86444a(textView, aVar.f174788z, (GalleryItem$VideoMediaItem) F4, this.f174778f, this.f174779g);
                    } else {
                        aVar.f174786A.setVisibility(8);
                        if (F4.f162759s) {
                            aVar.f174788z.setAlpha(0.1f);
                        } else {
                            aVar.f174788z.setAlpha(1.0f);
                        }
                    }
                } else {
                    aVar.f174786A.setVisibility(8);
                    if (F4 instanceof GalleryItem$VideoMediaItem) {
                        aVar.f174786A.setVisibility(0);
                        GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = (GalleryItem$VideoMediaItem) F4;
                        C61465d.f174789i.mo86444a(aVar.f174786A, aVar.f174788z, galleryItem$VideoMediaItem, this.f174778f, this.f174779g);
                        Log.m105918d("Music.MusicMvAlbumAdapter", "item path:" + galleryItem$VideoMediaItem.f162747d + ", width:" + galleryItem$VideoMediaItem.f162768y + ", height:" + galleryItem$VideoMediaItem.f162767x + ", durationMs:" + galleryItem$VideoMediaItem.f162766w + ", videoMinDurationMs:" + this.f174778f + ", videoMaxDurationMs:" + this.f174779g);
                        if (C61645c0.m72361a(galleryItem$VideoMediaItem.f162766w) < C61645c0.m72363c(this.f174778f) || C61645c0.m72361a(galleryItem$VideoMediaItem.f162766w) > C61645c0.m72363c(this.f174779g)) {
                            aVar.f174788z.setAlpha(0.1f);
                        } else {
                            aVar.f174788z.setAlpha(1.0f);
                        }
                    }
                }
                String format = this.f174780h.format(new Date(F4.f162752i));
                C87412m.m108593f(format, "mDateFormat.format(Date(item.generateDate))");
                String str3 = (i2 + 1) + ", " + format;
                if (2 == F4.getType()) {
                    str = "视频 " + str3;
                } else {
                    str = "图片" + str3;
                }
                aVar.f174788z.setContentDescription(str);
                Log.m105919d("Music.MusicMvAlbumAdapter", "thumbFilePath: %s | origFilePath: %s | contentDescription %s", e, str2, str);
                ((C58433i) C86312j.m106911c(C58433i.class)).Eo0(aVar.f174788z, F4.getType(), e, str2, F4.f162751h, F4.f162752i);
                aVar.f44854d.setOnLongClickListener(this.f174783n);
                if (((C63844s) rVar.mo62443b(this.f174776d).mo75002a(cls)).mo88634d3()) {
                    aVar.f174787B.setVisibility(0);
                } else {
                    aVar.f174787B.setVisibility(8);
                }
                if (aVar.f174787B.getVisibility() == 0) {
                    CheckBox checkBox = aVar.f174787B;
                    C87412m.m108594g(checkBox, "delegate");
                    ViewParent parent = checkBox.getParent();
                    C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
                    View view = (View) parent;
                    view.post(new C10776b(checkBox, view));
                } else {
                    CheckBox checkBox2 = aVar.f174787B;
                    C87412m.m108594g(checkBox2, "delegate");
                    ViewParent parent2 = checkBox2.getParent();
                    C87412m.m108592e(parent2, "null cannot be cast to non-null type android.view.View");
                    ((View) parent2).setTouchDelegate((TouchDelegate) null);
                }
                aVar.f174787B.setTag(C0966R.C0970id.n_e, Integer.valueOf(i));
                aVar.f174787B.setOnClickListener(this.f174782j);
                return;
            }
            Log.m105921e("Music.MusicMvAlbumAdapter", "null or nil filepath, poi: %s.", Integer.valueOf(i));
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(this.f174776d).inflate(C0966R.C0971layout.bic, viewGroup, false);
            C87412m.m108593f(inflate, "from(mContext).inflate(R…           parent, false)");
            return new C61462a(inflate);
        } else if (i != 2) {
            View inflate2 = LayoutInflater.from(this.f174776d).inflate(C0966R.C0971layout.bic, viewGroup, false);
            C87412m.m108593f(inflate2, "from(mContext).inflate(R…           parent, false)");
            return new C61462a(inflate2);
        } else {
            View inflate3 = LayoutInflater.from(this.f174776d).inflate(C0966R.C0971layout.f359906bj1, viewGroup, false);
            C87412m.m108593f(inflate3, "from(mContext).inflate(R…           parent, false)");
            return new C61463b(inflate3);
        }
    }
}
