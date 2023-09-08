package com.tencent.p014mm.plugin.gallery.p473ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.recyclerview.widget.C0132m;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.gallery.model.C93958f;
import com.tencent.p014mm.plugin.gallery.model.C93963i;
import com.tencent.p014mm.plugin.gallery.model.C93974o;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kv1.C99254i;
import nj3.C88989a;
import ow1.C100562c0;
import ow1.C100590z;
import ow1.C11771a0;
import ow1.C11772b0;
import ow1.C11775x;
import ow1.C11776y;
import p447aw.C103918d;
import p851es.C58800a;
import qo3.C89779i0;
import qw1.C101316l;
import zt3.C119143b;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.gallery.ui.SmartGalleryUI */
public class SmartGalleryUI extends MMActivity {

    /* renamed from: w */
    public static final /* synthetic */ int f271476w = 0;

    /* renamed from: d */
    public RecyclerView f271477d;

    /* renamed from: e */
    public EditText f271478e;

    /* renamed from: f */
    public C94038c f271479f;

    /* renamed from: g */
    public C94043g f271480g;

    /* renamed from: h */
    public C94042f f271481h;

    /* renamed from: i */
    public C94047i f271482i;

    /* renamed from: j */
    public Button f271483j;

    /* renamed from: n */
    public int f271484n;

    /* renamed from: o */
    public int f271485o;

    /* renamed from: p */
    public String f271486p;

    /* renamed from: q */
    public boolean f271487q = false;

    /* renamed from: r */
    public ProgressDialog f271488r;

    /* renamed from: s */
    public C0132m f271489s;

    /* renamed from: t */
    public boolean f271490t = true;

    /* renamed from: u */
    public C94040d f271491u = new C94033a();

    /* renamed from: v */
    public boolean f271492v = false;

    /* renamed from: com.tencent.mm.plugin.gallery.ui.SmartGalleryUI$a */
    public class C94033a implements C94040d {
        public C94033a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ Exception -> 0x0076 }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo129031a(com.tencent.p014mm.plugin.gallery.model.C93974o.C93976b r10) {
            /*
                r9 = this;
                java.lang.String r0 = "utf-8"
                r1 = 2
                java.lang.Object[] r2 = new java.lang.Object[r1]
                java.lang.String r3 = r10.f271210c
                r4 = 0
                r2[r4] = r3
                java.lang.String r3 = r10.f271211d
                r5 = 1
                r2[r5] = r3
                java.lang.String r3 = "MicroMsg.SmartGalleryUI"
                java.lang.String r6 = "onAlbumClick, albumId: %s, albumName: %s."
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r2)
                android.content.Intent r2 = new android.content.Intent
                com.tencent.mm.plugin.gallery.ui.SmartGalleryUI r3 = com.tencent.p014mm.plugin.gallery.p473ui.SmartGalleryUI.this
                java.lang.Class<com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI> r6 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.class
                r2.<init>(r3, r6)
                com.tencent.mm.plugin.gallery.ui.SmartGalleryUI r3 = com.tencent.p014mm.plugin.gallery.p473ui.SmartGalleryUI.this
                android.content.Intent r3 = r3.getIntent()
                r2.putExtras(r3)
                com.tencent.mm.plugin.gallery.ui.SmartGalleryUI r3 = com.tencent.p014mm.plugin.gallery.p473ui.SmartGalleryUI.this
                boolean r3 = r3.f271492v
                java.lang.String r6 = "send_raw_img"
                r2.putExtra(r6, r3)
                com.tencent.mm.plugin.gallery.ui.SmartGalleryUI r3 = com.tencent.p014mm.plugin.gallery.p473ui.SmartGalleryUI.this
                boolean r3 = r3.f271487q
                java.lang.String r6 = "select_type_tag"
                if (r3 == 0) goto L_0x004d
                com.tencent.mm.plugin.gallery.model.o$c r3 = r10.f271215h
                if (r3 == 0) goto L_0x0049
                boolean r3 = r3.f271216a
                if (r3 == 0) goto L_0x0049
                r2.putExtra(r6, r5)
                goto L_0x0050
            L_0x0049:
                r2.putExtra(r6, r4)
                goto L_0x0050
            L_0x004d:
                r2.putExtra(r6, r1)
            L_0x0050:
                com.tencent.mm.plugin.gallery.model.o$e r3 = r10.f271209b     // Catch:{ Exception -> 0x0076 }
                java.lang.String r6 = ""
                if (r3 == 0) goto L_0x005b
                java.lang.String r3 = r3.f271223c     // Catch:{ Exception -> 0x0076 }
                if (r3 == 0) goto L_0x005b
                goto L_0x005c
            L_0x005b:
                r3 = r6
            L_0x005c:
                java.lang.String r7 = r10.f271211d     // Catch:{ Exception -> 0x0076 }
                if (r7 == 0) goto L_0x0061
                r6 = r7
            L_0x0061:
                com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0076 }
                r8 = 18269(0x475d, float:2.56E-41)
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0076 }
                java.lang.String r3 = java.net.URLEncoder.encode(r3, r0)     // Catch:{ Exception -> 0x0076 }
                r1[r4] = r3     // Catch:{ Exception -> 0x0076 }
                java.lang.String r0 = java.net.URLEncoder.encode(r6, r0)     // Catch:{ Exception -> 0x0076 }
                r1[r5] = r0     // Catch:{ Exception -> 0x0076 }
                r7.mo160131h(r8, r1)     // Catch:{ Exception -> 0x0076 }
            L_0x0076:
                java.lang.String r0 = "is_from_smart_gallery"
                r2.putExtra(r0, r5)
                java.lang.String r0 = r10.f271211d
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r1 == 0) goto L_0x0088
                com.tencent.mm.plugin.gallery.model.o$e r0 = r10.f271209b
                java.lang.String r0 = r0.f271223c
            L_0x0088:
                java.lang.String r1 = "title_from_smart_gallery"
                r2.putExtra(r1, r0)
                java.lang.String r10 = r10.f271210c
                java.lang.String r0 = "album_id_from_smart_gallery"
                r2.putExtra(r0, r10)
                com.tencent.mm.plugin.gallery.ui.SmartGalleryUI r10 = com.tencent.p014mm.plugin.gallery.p473ui.SmartGalleryUI.this
                r10.startActivityForResult((android.content.Intent) r2, (int) r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.p473ui.SmartGalleryUI.C94033a.mo129031a(com.tencent.mm.plugin.gallery.model.o$b):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.SmartGalleryUI$b */
    public static class C94034b extends RecyclerView.C16613e<C94037c> {

        /* renamed from: d */
        public Context f271494d;

        /* renamed from: e */
        public List<C93974o.C93976b> f271495e;

        /* renamed from: f */
        public C94040d f271496f;

        /* renamed from: g */
        public int f271497g;

        /* renamed from: h */
        public View.OnClickListener f271498h = new C94035a();

        /* renamed from: i */
        public View.OnLongClickListener f271499i = new C94036b();

        /* renamed from: com.tencent.mm.plugin.gallery.ui.SmartGalleryUI$b$a */
        public class C94035a implements View.OnClickListener {
            public C94035a() {
            }

            public void onClick(View view) {
                C94040d dVar;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/SmartGalleryUI$AlbumInfoAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Object tag = view.getTag();
                if ((tag instanceof C93974o.C93976b) && (dVar = C94034b.this.f271496f) != null) {
                    ((C94033a) dVar).mo129031a((C93974o.C93976b) tag);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/SmartGalleryUI$AlbumInfoAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.gallery.ui.SmartGalleryUI$b$b */
        public class C94036b implements View.OnLongClickListener {
            public C94036b() {
            }

            public boolean onLongClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/SmartGalleryUI$AlbumInfoAdapter$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                Object tag = view.getTag();
                if (tag instanceof C93974o.C93976b) {
                    ClipboardHelper.setText(C94034b.this.f271494d, "media info", ((C93974o.C93976b) tag).toString());
                }
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/gallery/ui/SmartGalleryUI$AlbumInfoAdapter$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            }
        }

        /* renamed from: com.tencent.mm.plugin.gallery.ui.SmartGalleryUI$b$c */
        public static class C94037c extends RecyclerView.C16631z {

            /* renamed from: A */
            public TextView f271502A;

            /* renamed from: B */
            public TextView f271503B;

            /* renamed from: z */
            public ImageView f271504z;

            public C94037c(View view, int i) {
                super(view);
                ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.f5711mi);
                this.f271504z = imageView;
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                layoutParams.width = i;
                layoutParams.height = i;
                this.f271504z.setLayoutParams(layoutParams);
                this.f271502A = (TextView) view.findViewById(C0966R.C0970id.f5739na);
                this.f271503B = (TextView) view.findViewById(C0966R.C0970id.f5687lv);
            }
        }

        public C94034b(Context context) {
            this.f271494d = context;
            this.f271495e = new ArrayList();
            int c = (((this.f271494d.getResources().getDisplayMetrics().widthPixels - C74942w4.m89786c(this.f271494d, C0966R.dimen.f3736cp)) - (C74942w4.m89786c(this.f271494d, C0966R.dimen.f3766df) * 4)) / 9) * 2;
            this.f271497g = c;
            Log.m105919d("MicroMsg.SmartGalleryUI", "mThumbSize: %d.", Integer.valueOf(c));
        }

        public int getItemCount() {
            return ((ArrayList) this.f271495e).size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            int i2;
            C94037c cVar = (C94037c) zVar;
            C93974o.C93976b bVar = (C93974o.C93976b) ((ArrayList) this.f271495e).get(i);
            cVar.f44854d.setTag(bVar);
            cVar.f44854d.setOnClickListener(this.f271498h);
            C93974o.C93977c cVar2 = bVar.f271215h;
            if (cVar2 != null) {
                i2 = cVar2.f271218c ? 2 : 1;
            } else {
                i2 = 1;
            }
            Object[] objArr = new Object[4];
            objArr[0] = Integer.valueOf(i);
            objArr[1] = bVar.f271214g;
            objArr[2] = bVar.f271211d;
            Object obj = cVar2;
            if (cVar2 == null) {
                obj = "";
            }
            objArr[3] = obj;
            Log.m105919d("MicroMsg.SmartGalleryUI", "position: %s, filePath: %s, albumName: %s, albumTag: %s.", objArr);
            ImageView imageView = cVar.f271504z;
            String str = bVar.f271214g;
            long j = bVar.f271213f;
            C93974o.C93977c cVar3 = bVar.f271215h;
            C100562c0.m131592c(imageView, i2, str, str, j, -1, (C58800a) null, cVar3 == null ? null : cVar3.f271217b, 0);
            cVar.f271502A.setText(bVar.f271211d);
            cVar.f271503B.setText(String.valueOf(bVar.f271212e));
            cVar.f44854d.setOnLongClickListener(this.f271499i);
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C94037c(LayoutInflater.from(this.f271494d).inflate(C0966R.C0971layout.c06, viewGroup, false), this.f271497g);
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.SmartGalleryUI$c */
    public static class C94038c extends RecyclerView.C16613e<C94039a> {

        /* renamed from: d */
        public Context f271505d;

        /* renamed from: e */
        public C93974o.C93978d f271506e;

        /* renamed from: f */
        public C94040d f271507f;

        /* renamed from: com.tencent.mm.plugin.gallery.ui.SmartGalleryUI$c$a */
        public static class C94039a extends RecyclerView.C16631z {

            /* renamed from: A */
            public RecyclerView f271508A;

            /* renamed from: z */
            public TextView f271509z;

            public C94039a(View view) {
                super(view);
                TextView textView = (TextView) view.findViewById(C0966R.C0970id.ay9);
                this.f271509z = textView;
                C85875k4.m106189j0(textView.getPaint(), 0.8f);
                this.f271508A = (RecyclerView) view.findViewById(C0966R.C0970id.ay8);
            }
        }

        public C94038c(Context context) {
            this.f271505d = context;
        }

        public int getItemCount() {
            C93974o.C93978d dVar = this.f271506e;
            if (dVar == null) {
                return 0;
            }
            return dVar.f271221b.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C94039a aVar = (C94039a) zVar;
            Log.m105925i("MicroMsg.SmartGalleryUI", "CategoryAlbumAdapter onBindViewHolder: %d.", Integer.valueOf(i));
            C93974o.C93978d dVar = this.f271506e;
            if (dVar != null) {
                C93974o.C93979e eVar = dVar.f271220a.get(i);
                aVar.f271509z.setText(eVar.f271223c);
                Log.m105925i("MicroMsg.SmartGalleryUI", "category id: %s, category name: %s.", eVar.f271222b, eVar.f271223c);
                List list = this.f271506e.f271221b.get(eVar);
                if (Util.isNullOrNil(list)) {
                    Log.m105920e("MicroMsg.SmartGalleryUI", "album info list invalid.");
                    return;
                }
                aVar.f271508A.setLayoutManager(list.size() > 4 ? new GridLayoutManager(this.f271505d, 2, 0, false) : new GridLayoutManager(this.f271505d, 1, 0, false));
                C94034b bVar = new C94034b(this.f271505d);
                C94040d dVar2 = this.f271507f;
                if (dVar2 != null) {
                    bVar.f271496f = dVar2;
                }
                aVar.f271508A.setAdapter(bVar);
                ((ArrayList) bVar.f271495e).clear();
                ((ArrayList) bVar.f271495e).addAll(list);
                bVar.notifyDataSetChanged();
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C94039a(LayoutInflater.from(this.f271505d).inflate(C0966R.C0971layout.c07, viewGroup, false));
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.SmartGalleryUI$d */
    public interface C94040d {
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.SmartGalleryUI$e */
    public static class C94041e implements Runnable {

        /* renamed from: d */
        public WeakReference<C94038c> f271510d;

        /* renamed from: e */
        public WeakReference<ProgressDialog> f271511e;

        /* renamed from: f */
        public WeakReference<EditText> f271512f;

        public C94041e(C94038c cVar, ProgressDialog progressDialog, EditText editText) {
            this.f271510d = new WeakReference<>(cVar);
            this.f271511e = new WeakReference<>(progressDialog);
            this.f271512f = new WeakReference<>(editText);
        }

        public void run() {
            C93974o.C93978d dVar;
            long currentTimeMillis = System.currentTimeMillis();
            Log.m105924i("MicroMsg.SmartGalleryUI", "start query category album.");
            Uri uri = C93974o.f271204e;
            C93974o oVar = C93974o.C93984j.f271235a;
            oVar.getClass();
            ArrayList arrayList = new ArrayList();
            if (!((C103918d) C86312j.m106911c(C103918d.class)).Lb0(MMApplicationContext.getContext(), "android.permission.READ_EXTERNAL_STORAGE")) {
                Log.m105924i("MicroMsg.SmartGalleryQueryUtil", "queryAlbum without READ_EXTERNAL_STORAGE.");
                dVar = oVar.mo128918c(arrayList);
            } else {
                Log.m105924i("MicroMsg.SmartGalleryQueryUtil", "has permiss.");
                Cursor query = oVar.f271205a.query(C93974o.f271204e.buildUpon().appendEncodedPath("albums").build(), oVar.mo128917b(), (String) null, (String[]) null, (String) null);
                if (query != null) {
                    int columnIndex = query.getColumnIndex("categoryID");
                    int columnIndex2 = query.getColumnIndex("categoryName");
                    int columnIndex3 = query.getColumnIndex("albumID");
                    int columnIndex4 = query.getColumnIndex("albumName");
                    int columnIndex5 = query.getColumnIndex("albumCapacity");
                    int columnIndex6 = query.getColumnIndex("coverID");
                    int columnIndex7 = query.getColumnIndex("coverData");
                    int columnIndex8 = query.getColumnIndex("albumTag");
                    while (query.moveToNext()) {
                        C93974o.C93976b bVar = new C93974o.C93976b();
                        int i = columnIndex;
                        int i2 = columnIndex2;
                        bVar.f271209b = new C93974o.C93979e(query.getString(columnIndex), query.getString(columnIndex2));
                        bVar.f271210c = query.getString(columnIndex3);
                        bVar.f271211d = query.getString(columnIndex4);
                        bVar.f271212e = Util.safeParseInt(query.getString(columnIndex5));
                        bVar.f271213f = Util.safeParseLong(query.getString(columnIndex6));
                        bVar.f271214g = query.getString(columnIndex7);
                        String string = query.getString(columnIndex8);
                        if (!Util.isNullOrNil(string)) {
                            bVar.f271215h = oVar.mo128920e(string, bVar.f271210c);
                        }
                        arrayList.add(bVar);
                        columnIndex = i;
                        columnIndex2 = i2;
                    }
                    query.close();
                }
                dVar = oVar.mo128918c(arrayList);
            }
            Log.m105924i("MicroMsg.SmartGalleryUI", "finish query category album.");
            C115669n.INSTANCE.mo160131h(19165, "", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            C94046h hVar = new C94046h(this.f271510d, dVar);
            hVar.f271526f = this.f271511e;
            hVar.f271527g = this.f271512f;
            C93958f.m118753m().mo128895c(hVar);
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.SmartGalleryUI$f */
    public static class C94042f implements Runnable {

        /* renamed from: d */
        public String f271513d;

        /* renamed from: e */
        public C94047i f271514e;

        public C94042f(C94047i iVar) {
            this.f271514e = iVar;
        }

        public void run() {
            List<C93974o.C93983i> list;
            if (Util.isNullOrNil(this.f271513d)) {
                Log.m105920e("MicroMsg.SmartGalleryUI", "keyword is invalid.");
                return;
            }
            Log.m105924i("MicroMsg.SmartGalleryUI", "query search start.");
            Uri uri = C93974o.f271204e;
            C93974o oVar = C93974o.C93984j.f271235a;
            String str = this.f271513d;
            oVar.getClass();
            ArrayList arrayList = new ArrayList();
            if (!((C103918d) C86312j.m106911c(C103918d.class)).Lb0(MMApplicationContext.getContext(), "android.permission.READ_EXTERNAL_STORAGE")) {
                Log.m105924i("MicroMsg.SmartGalleryQueryUtil", "isCategoryInfoValid without READ_EXTERNAL_STORAGE.");
                list = oVar.mo128919d(arrayList, str);
            } else {
                Log.m105924i("MicroMsg.SmartGalleryQueryUtil", "has permiss.");
                Cursor query = oVar.f271205a.query(C93974o.f271204e.buildUpon().appendEncodedPath("search").build(), new String[]{"categoryID", "categoryName", "albumID", "albumName", "albumCapacity", "coverID", "coverData", "albumTag"}, "keyword".concat("=?"), new String[]{str}, (String) null);
                if (query != null) {
                    int columnIndex = query.getColumnIndex("categoryID");
                    int columnIndex2 = query.getColumnIndex("categoryName");
                    int columnIndex3 = query.getColumnIndex("albumID");
                    int columnIndex4 = query.getColumnIndex("albumName");
                    int columnIndex5 = query.getColumnIndex("albumCapacity");
                    int columnIndex6 = query.getColumnIndex("coverID");
                    int columnIndex7 = query.getColumnIndex("coverData");
                    int columnIndex8 = query.getColumnIndex("albumTag");
                    while (query.moveToNext()) {
                        C93974o.C93976b bVar = new C93974o.C93976b();
                        int i = columnIndex;
                        int i2 = columnIndex2;
                        bVar.f271209b = new C93974o.C93979e(query.getString(columnIndex), query.getString(columnIndex2));
                        bVar.f271210c = query.getString(columnIndex3);
                        bVar.f271211d = query.getString(columnIndex4);
                        bVar.f271212e = Util.safeParseInt(query.getString(columnIndex5));
                        bVar.f271213f = Util.safeParseLong(query.getString(columnIndex6));
                        bVar.f271214g = query.getString(columnIndex7);
                        String string = query.getString(columnIndex8);
                        if (!Util.isNullOrNil(string)) {
                            bVar.f271215h = oVar.mo128920e(string, bVar.f271210c);
                        }
                        arrayList.add(bVar);
                        columnIndex = i;
                        columnIndex2 = i2;
                    }
                    query.close();
                }
                list = oVar.mo128919d(arrayList, str);
            }
            Log.m105924i("MicroMsg.SmartGalleryUI", "query search finish.");
            try {
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[2];
                objArr[0] = URLEncoder.encode(this.f271513d, "utf-8");
                objArr[1] = Integer.valueOf(list.size() == 0 ? 0 : 1);
                nVar.mo160131h(18270, objArr);
            } catch (Exception unused) {
            }
            if (Util.isNullOrNil(this.f271514e.f271531g) || !this.f271514e.f271531g.equals(this.f271513d)) {
                Log.m105925i("MicroMsg.SmartGalleryUI", "mKeyword: %s, cur: %s.", this.f271513d, this.f271514e.f271531g);
                return;
            }
            C94047i iVar = this.f271514e;
            ((ArrayList) iVar.f271528d).clear();
            ((ArrayList) iVar.f271528d).addAll(list);
            C93958f.m118753m().mo128895c(this.f271514e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.SmartGalleryUI$g */
    public static class C94043g extends RecyclerView.C16613e<RecyclerView.C16631z> {

        /* renamed from: d */
        public Context f271515d;

        /* renamed from: e */
        public List<C93974o.C93983i> f271516e;

        /* renamed from: f */
        public C94040d f271517f;

        /* renamed from: g */
        public String f271518g;

        /* renamed from: h */
        public View.OnClickListener f271519h = new C94044a();

        /* renamed from: com.tencent.mm.plugin.gallery.ui.SmartGalleryUI$g$c */
        public static class C68994c extends RecyclerView.C16631z {

            /* renamed from: z */
            public TextView f198264z;

            public C68994c(View view) {
                super(view);
                TextView textView = (TextView) view.findViewById(C0966R.C0970id.ay9);
                this.f198264z = textView;
                C85875k4.m106189j0(textView.getPaint(), 0.8f);
            }
        }

        /* renamed from: com.tencent.mm.plugin.gallery.ui.SmartGalleryUI$g$d */
        public static class C68995d extends RecyclerView.C16631z {
            public C68995d(View view) {
                super(view);
            }
        }

        /* renamed from: com.tencent.mm.plugin.gallery.ui.SmartGalleryUI$g$a */
        public class C94044a implements View.OnClickListener {
            public C94044a() {
            }

            public void onClick(View view) {
                C94040d dVar;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/SmartGalleryUI$SearchAlbumAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Object tag = view.getTag();
                if ((tag instanceof C93974o.C93976b) && (dVar = C94043g.this.f271517f) != null) {
                    ((C94033a) dVar).mo129031a((C93974o.C93976b) tag);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/SmartGalleryUI$SearchAlbumAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.gallery.ui.SmartGalleryUI$g$b */
        public static class C94045b extends RecyclerView.C16631z {

            /* renamed from: A */
            public TextView f271521A;

            /* renamed from: B */
            public TextView f271522B;

            /* renamed from: z */
            public ImageView f271523z;

            public C94045b(View view) {
                super(view);
                this.f271523z = (ImageView) view.findViewById(C0966R.C0970id.f5711mi);
                this.f271521A = (TextView) view.findViewById(C0966R.C0970id.f5739na);
                this.f271522B = (TextView) view.findViewById(C0966R.C0970id.f5687lv);
            }
        }

        public C94043g(Context context) {
            this.f271515d = context;
            this.f271516e = new ArrayList();
        }

        public int getItemCount() {
            if (((ArrayList) this.f271516e).size() == 0) {
                ((ArrayList) this.f271516e).add(new C93974o.C93981g());
            }
            return ((ArrayList) this.f271516e).size();
        }

        public int getItemViewType(int i) {
            return ((C93974o.C93983i) ((ArrayList) this.f271516e).get(i)).f271234a;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            int i2;
            if (zVar instanceof C68994c) {
                ((C68994c) zVar).f198264z.setText(((C93974o.C93979e) ((ArrayList) this.f271516e).get(i)).f271223c);
            } else if (zVar instanceof C94045b) {
                C93974o.C93976b bVar = (C93974o.C93976b) ((ArrayList) this.f271516e).get(i);
                zVar.f44854d.setOnClickListener(this.f271519h);
                zVar.f44854d.setTag(bVar);
                C93974o.C93977c cVar = bVar.f271215h;
                int i3 = 1;
                if (cVar != null) {
                    if (cVar.f271218c) {
                        i3 = 2;
                    }
                    i2 = i3;
                } else {
                    i2 = 1;
                }
                C94045b bVar2 = (C94045b) zVar;
                ImageView imageView = bVar2.f271523z;
                String str = bVar.f271214g;
                C100562c0.m131592c(imageView, i2, str, str, bVar.f271213f, -1, (C58800a) null, cVar == null ? null : cVar.f271217b, 0);
                bVar2.f271521A.setText(C99254i.m129306c(this.f271515d, bVar.f271211d, this.f271518g));
                bVar2.f271522B.setText(String.valueOf(bVar.f271212e));
            } else if (zVar instanceof C68995d) {
                Log.m105924i("MicroMsg.SmartGalleryUI", "no search result.");
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            return i == 0 ? new C68994c(LayoutInflater.from(this.f271515d).inflate(C0966R.C0971layout.c0_, viewGroup, false)) : 1 == i ? new C94045b(LayoutInflater.from(this.f271515d).inflate(C0966R.C0971layout.c09, viewGroup, false)) : new C68995d(LayoutInflater.from(this.f271515d).inflate(C0966R.C0971layout.c0a, viewGroup, false));
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.SmartGalleryUI$h */
    public static class C94046h implements Runnable {

        /* renamed from: d */
        public WeakReference<C94038c> f271524d;

        /* renamed from: e */
        public C93974o.C93978d f271525e;

        /* renamed from: f */
        public WeakReference<ProgressDialog> f271526f;

        /* renamed from: g */
        public WeakReference<EditText> f271527g;

        public C94046h(WeakReference<C94038c> weakReference, C93974o.C93978d dVar) {
            this.f271524d = weakReference;
            this.f271525e = dVar;
        }

        public void run() {
            EditText editText;
            ProgressDialog progressDialog;
            WeakReference<C94038c> weakReference = this.f271524d;
            if (weakReference != null && this.f271525e != null) {
                C94038c cVar = weakReference.get();
                if (cVar != null) {
                    Log.m105924i("MicroMsg.SmartGalleryUI", "show category.");
                    cVar.f271506e = this.f271525e;
                    cVar.notifyDataSetChanged();
                }
                WeakReference<ProgressDialog> weakReference2 = this.f271526f;
                if (!(weakReference2 == null || (progressDialog = weakReference2.get()) == null)) {
                    Log.m105924i("MicroMsg.SmartGalleryUI", "tipDialog dismiss.");
                    progressDialog.dismiss();
                }
                WeakReference<EditText> weakReference3 = this.f271527g;
                if (weakReference3 != null && (editText = weakReference3.get()) != null) {
                    Log.m105924i("MicroMsg.SmartGalleryUI", "show keyboard.");
                    editText.requestFocus();
                    ((InputMethodManager) editText.getContext().getSystemService("input_method")).showSoftInput(editText, 0);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.SmartGalleryUI$i */
    public static class C94047i implements Runnable {

        /* renamed from: d */
        public List<C93974o.C93983i> f271528d = new ArrayList();

        /* renamed from: e */
        public WeakReference<RecyclerView> f271529e;

        /* renamed from: f */
        public WeakReference<C94043g> f271530f;

        /* renamed from: g */
        public String f271531g;

        public C94047i(RecyclerView recyclerView, C94043g gVar) {
            this.f271529e = new WeakReference<>(recyclerView);
            this.f271530f = new WeakReference<>(gVar);
        }

        public void run() {
            C94043g gVar;
            WeakReference<RecyclerView> weakReference = this.f271529e;
            if (weakReference == null || this.f271530f == null) {
                Log.m105920e("MicroMsg.SmartGalleryUI", "update search ui, ref is null, return.");
            } else if (this.f271528d != null) {
                RecyclerView recyclerView = weakReference.get();
                if (recyclerView != null && (gVar = this.f271530f.get()) != null) {
                    recyclerView.setAdapter(gVar);
                    gVar.f271518g = this.f271531g;
                    List<C93974o.C93983i> list = this.f271528d;
                    ((ArrayList) gVar.f271516e).clear();
                    ((ArrayList) gVar.f271516e).addAll(list);
                    gVar.notifyDataSetChanged();
                }
            } else {
                Log.m105920e("MicroMsg.SmartGalleryUI", "update search ui, data is null.");
            }
        }
    }

    /* renamed from: H7 */
    public static void m118867H7(SmartGalleryUI smartGalleryUI, String str, boolean z) {
        smartGalleryUI.f271487q = true;
        if (z) {
            smartGalleryUI.hideVKB();
            smartGalleryUI.f271478e.clearFocus();
        }
        smartGalleryUI.f271477d.mo17093j1(smartGalleryUI.f271489s);
        smartGalleryUI.f271481h.f271513d = str;
        C93963i m = C93958f.m118753m();
        C94042f fVar = smartGalleryUI.f271481h;
        ExecutorService executorService = m.f271182f;
        if (executorService != null) {
            ((C119143b) executorService).execute(fVar);
        }
    }

    /* renamed from: I7 */
    public final void mo129030I7() {
        Uri uri = C93974o.f271204e;
        int size = ((ArrayList) C93974o.C93984j.f271235a.f271208d).size();
        if (size > 0) {
            this.f271483j.setEnabled(true);
        } else {
            this.f271483j.setEnabled(false);
        }
        this.f271483j.setText(C101316l.m132909h(this, this.f271484n, size, this.f271485o, this.f271486p, false, (ArrayList<GalleryItem$MediaItem>) null));
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c08;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105925i("MicroMsg.SmartGalleryUI", "requestCode: %d, resultCode: %d.", Integer.valueOf(i), Integer.valueOf(i2));
        if (intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("send_raw_img", false);
            this.f271492v = booleanExtra;
            intent.putExtra("send_raw_img", booleanExtra);
            Bundle extras = intent.getExtras();
            if (extras != null) {
                for (String next : extras.keySet()) {
                    Log.m105925i("MicroMsg.SmartGalleryUI", "key: %s, value: %s.", next, extras.get(next));
                }
            }
        }
        if (1 != i) {
            return;
        }
        if (-2 == i2 || i2 == 0) {
            Log.m105924i("MicroMsg.SmartGalleryUI", "just back from AlbumPreviewUI.");
            mo129030I7();
            return;
        }
        setResult(i2, intent);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f271484n = getIntent().getIntExtra("query_source_type", 3);
        this.f271485o = getIntent().getIntExtra("max_select_count", 9);
        this.f271486p = getIntent().getStringExtra("album_business_tag");
        this.f271492v = getIntent().getBooleanExtra("send_raw_img", false);
        C89779i0 c = C89779i0.m112246c(this, getString(C0966R.string.a4d), true, 0, (DialogInterface.OnCancelListener) null);
        this.f271488r = c;
        c.show();
        setActionbarColor(getResources().getColor(C0966R.color.f3496v_));
        setNavigationbarColor(getResources().getColor(C0966R.color.f3496v_));
        View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.f6298b0, new LinearLayout(this), false);
        inflate.findViewById(C0966R.C0970id.jnd).setOnClickListener(new C11775x(this));
        EditText editText = (EditText) inflate.findViewById(C0966R.C0970id.jnf);
        this.f271478e = editText;
        editText.setOnTouchListener(new C11776y(this));
        this.f271478e.setOnEditorActionListener(new C100590z(this));
        this.f271478e.addTextChangedListener(new C94077n(this));
        this.f271483j = (Button) inflate.findViewById(C0966R.C0970id.jng);
        mo129030I7();
        this.f271483j.setOnClickListener(new C11771a0(this));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91091I(new ColorDrawable(getContext().getResources().getColor(17170445)));
            supportActionBar.mo91088F(false);
            supportActionBar.mo91084B(false);
            supportActionBar.mo91087E(false);
            supportActionBar.mo91086D(true);
            supportActionBar.mo91114y(inflate);
        } else {
            Log.m105920e("MicroMsg.SmartGalleryUI", "actionbar is null.");
        }
        C0132m mVar = new C0132m(this, 1);
        this.f271489s = mVar;
        mVar.mo128j(getResources().getDrawable(C0966R.C0969drawable.as9));
        RecyclerView recyclerView = (RecyclerView) findViewById(C0966R.C0970id.jne);
        this.f271477d = recyclerView;
        recyclerView.mo17043c(new C11772b0(this));
        this.f271477d.mo17085h0(this.f271489s);
        C94038c cVar = new C94038c(this);
        this.f271479f = cVar;
        cVar.f271507f = this.f271491u;
        C94043g gVar = new C94043g(this);
        this.f271480g = gVar;
        gVar.f271517f = this.f271491u;
        this.f271477d.setLayoutManager(new LinearLayoutManager(this));
        this.f271477d.setAdapter(this.f271479f);
        C94047i iVar = new C94047i(this.f271477d, this.f271480g);
        this.f271482i = iVar;
        this.f271481h = new C94042f(iVar);
        C93963i m = C93958f.m118753m();
        C94041e eVar = new C94041e(this.f271479f, this.f271488r, this.f271478e);
        ExecutorService executorService = m.f271182f;
        if (executorService != null) {
            ((C119143b) executorService).execute(eVar);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        Uri uri = C93974o.f271204e;
        C93974o oVar = C93974o.C93984j.f271235a;
        oVar.getClass();
        Log.m105924i("MicroMsg.SmartGalleryQueryUtil", "clearSelectedMediaPath");
        ((ArrayList) oVar.f271208d).clear();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (4 != i || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        if (Util.isNullOrNil((CharSequence) this.f271478e.getText())) {
            setResult(-2, getIntent().putExtra("send_raw_img", this.f271492v));
            finish();
            return true;
        }
        this.f271478e.setText("");
        return true;
    }

    public void onPause() {
        super.onPause();
        this.f271478e.clearFocus();
    }

    public void onResume() {
        super.onResume();
        mo129030I7();
    }
}
