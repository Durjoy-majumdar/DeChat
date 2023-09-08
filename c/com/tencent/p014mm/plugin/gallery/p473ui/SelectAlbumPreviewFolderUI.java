package com.tencent.p014mm.plugin.gallery.p473ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.gallery.model.C93958f;
import com.tencent.p014mm.plugin.gallery.model.C93964k;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$AlbumItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$ImageMediaItem;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import nj3.C88989a;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.gallery.ui.SelectAlbumPreviewFolderUI */
public class SelectAlbumPreviewFolderUI extends MMActivity implements C93964k.C93965a {

    /* renamed from: d */
    public ArrayList<GalleryItem$AlbumItem> f271460d = new ArrayList<>(10);

    /* renamed from: e */
    public C94031c f271461e;

    /* renamed from: f */
    public RecyclerView f271462f;

    /* renamed from: g */
    public GalleryItem$AlbumItem f271463g;

    /* renamed from: h */
    public String f271464h;

    /* renamed from: com.tencent.mm.plugin.gallery.ui.SelectAlbumPreviewFolderUI$a */
    public class C94029a implements MenuItem.OnMenuItemClickListener {
        public C94029a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SelectAlbumPreviewFolderUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.SelectAlbumPreviewFolderUI$b */
    public class C94030b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ LinkedList f271466d;

        public C94030b(LinkedList linkedList) {
            this.f271466d = linkedList;
        }

        public void run() {
            SelectAlbumPreviewFolderUI.this.f271460d.addAll(this.f271466d);
            SelectAlbumPreviewFolderUI.this.f271461e.notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.SelectAlbumPreviewFolderUI$c */
    public class C94031c extends RecyclerView.C16613e<C94032d> implements View.OnClickListener {

        /* renamed from: d */
        public Context f271468d;

        public C94031c(Context context) {
            this.f271468d = context;
        }

        public int getItemCount() {
            return SelectAlbumPreviewFolderUI.this.f271460d.size() + 1;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
            if (r14 == 0) goto L_0x003d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0094  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C16631z r13, int r14) {
            /*
                r12 = this;
                r9 = r13
                com.tencent.mm.plugin.gallery.ui.SelectAlbumPreviewFolderUI$d r9 = (com.tencent.p014mm.plugin.gallery.p473ui.SelectAlbumPreviewFolderUI.C94032d) r9
                com.tencent.mm.plugin.gallery.ui.SelectAlbumPreviewFolderUI r0 = com.tencent.p014mm.plugin.gallery.p473ui.SelectAlbumPreviewFolderUI.this
                if (r14 != 0) goto L_0x000a
                com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem r0 = r0.f271463g
                goto L_0x0014
            L_0x000a:
                java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem> r0 = r0.f271460d
                int r1 = r14 + -1
                java.lang.Object r0 = r0.get(r1)
                com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem r0 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$AlbumItem) r0
            L_0x0014:
                android.view.View r1 = r9.f271474E
                r1.setOnClickListener(r12)
                android.view.View r1 = r9.f271474E
                r1.setTag(r0)
                com.tencent.mm.plugin.gallery.ui.SelectAlbumPreviewFolderUI r1 = com.tencent.p014mm.plugin.gallery.p473ui.SelectAlbumPreviewFolderUI.this
                java.lang.String r1 = r1.f271464h
                r10 = 0
                if (r1 == 0) goto L_0x0043
                java.lang.String r2 = r0.f271096d
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x003d
                com.tencent.mm.plugin.gallery.ui.SelectAlbumPreviewFolderUI r1 = com.tencent.p014mm.plugin.gallery.p473ui.SelectAlbumPreviewFolderUI.this
                java.lang.String r2 = r1.f271464h
                java.lang.String r1 = com.tencent.p014mm.plugin.gallery.p473ui.SelectAlbumPreviewFolderUI.m118865H7(r1)
                boolean r1 = r2.equals(r1)
                if (r1 == 0) goto L_0x0043
                if (r14 != 0) goto L_0x0043
            L_0x003d:
                android.widget.ImageView r1 = r9.f271473D
                r1.setVisibility(r10)
                goto L_0x0049
            L_0x0043:
                android.widget.ImageView r1 = r9.f271473D
                r2 = 4
                r1.setVisibility(r2)
            L_0x0049:
                r11 = 8
                if (r14 != 0) goto L_0x0094
                android.widget.ImageView r1 = r9.f271475z
                r2 = 2131234404(0x7f080e64, float:1.8084973E38)
                r1.setImageResource(r2)
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r1 = r0.f271101i
                if (r1 == 0) goto L_0x0078
                android.widget.ImageView r1 = r9.f271475z
                int r2 = r0.mo128862f()
                java.lang.String r3 = r0.mo128861e()
                java.lang.String r4 = r0.mo128856a()
                long r5 = r0.mo128857b()
                long r7 = r0.mo128858c()
                r0 = r1
                r1 = r2
                r2 = r3
                r3 = r4
                r4 = r5
                r6 = r14
                ow1.C100562c0.m131590a(r0, r1, r2, r3, r4, r6, r7)
            L_0x0078:
                android.widget.TextView r0 = r9.f271471B
                com.tencent.mm.plugin.gallery.ui.SelectAlbumPreviewFolderUI r1 = com.tencent.p014mm.plugin.gallery.p473ui.SelectAlbumPreviewFolderUI.this
                java.lang.String r1 = com.tencent.p014mm.plugin.gallery.p473ui.SelectAlbumPreviewFolderUI.m118865H7(r1)
                r0.setText(r1)
                android.widget.ImageView r0 = r9.f271475z
                r0.setVisibility(r10)
                android.widget.TextView r0 = r9.f271471B
                r0.setVisibility(r10)
                android.widget.TextView r0 = r9.f271472C
                r0.setVisibility(r11)
                goto L_0x013a
            L_0x0094:
                android.widget.ImageView r1 = r9.f271475z
                r1.setVisibility(r10)
                android.widget.TextView r1 = r9.f271471B
                r1.setVisibility(r10)
                android.widget.TextView r1 = r9.f271471B
                java.lang.String r2 = r0.f271096d
                r1.setText(r2)
                android.widget.TextView r1 = r9.f271472C
                r1.setVisibility(r10)
                android.widget.TextView r1 = r9.f271472C
                android.content.Context r2 = r12.f271468d
                r3 = 2131830612(0x7f112754, float:1.9294226E38)
                r4 = 1
                java.lang.Object[] r4 = new java.lang.Object[r4]
                int r5 = r0.f271098f
                java.lang.String r5 = java.lang.String.valueOf(r5)
                r4[r10] = r5
                java.lang.String r2 = r2.getString(r3, r4)
                r1.setText(r2)
                android.widget.ImageView r1 = r9.f271470A
                r2 = 2
                if (r1 == 0) goto L_0x00d8
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r3 = r0.f271101i
                if (r3 == 0) goto L_0x00d8
                int r3 = r3.getType()
                if (r3 != r2) goto L_0x00d3
                goto L_0x00d5
            L_0x00d3:
                r10 = 8
            L_0x00d5:
                r1.setVisibility(r10)
            L_0x00d8:
                java.lang.String r3 = r0.mo128861e()
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r1 != 0) goto L_0x0102
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r1 = r0.f271101i
                if (r1 == 0) goto L_0x0102
                android.widget.ImageView r1 = r9.f271475z
                int r2 = r0.mo128862f()
                java.lang.String r4 = r0.mo128856a()
                long r5 = r0.mo128857b()
                long r7 = r0.mo128858c()
                r0 = r1
                r1 = r2
                r2 = r3
                r3 = r4
                r4 = r5
                r6 = r14
                ow1.C100562c0.m131590a(r0, r1, r2, r3, r4, r6, r7)
                goto L_0x013a
            L_0x0102:
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r1 = r0.f271101i
                if (r1 == 0) goto L_0x0129
                int r1 = r1.getType()
                if (r1 != r2) goto L_0x0129
                android.widget.ImageView r1 = r9.f271475z
                int r2 = r0.mo128862f()
                r3 = 0
                java.lang.String r4 = r0.mo128856a()
                long r5 = r0.mo128857b()
                long r7 = r0.mo128858c()
                r0 = r1
                r1 = r2
                r2 = r3
                r3 = r4
                r4 = r5
                r6 = r14
                ow1.C100562c0.m131590a(r0, r1, r2, r3, r4, r6, r7)
                goto L_0x013a
            L_0x0129:
                java.lang.String r0 = "MicroMsg.SelectAlbumPreviewFolderUI"
                java.lang.String r1 = "get folder failed"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
                android.widget.ImageView r0 = r9.f271475z
                r0.setVisibility(r11)
                android.widget.TextView r0 = r9.f271471B
                r0.setVisibility(r11)
            L_0x013a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.p473ui.SelectAlbumPreviewFolderUI.C94031c.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$z, int):void");
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/SelectAlbumPreviewFolderUI$SelectImageFolderAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(SelectAlbumPreviewFolderUI.this, AlbumPreviewUI.class);
            intent.putExtra("select_folder_name", (GalleryItem$AlbumItem) view.getTag());
            intent.setFlags(67108864);
            SelectAlbumPreviewFolderUI.this.setResult(-1, intent);
            SelectAlbumPreviewFolderUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/SelectAlbumPreviewFolderUI$SelectImageFolderAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C94032d(SelectAlbumPreviewFolderUI.this, LayoutInflater.from(this.f271468d).inflate(C0966R.C0971layout.buw, viewGroup, false));
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.SelectAlbumPreviewFolderUI$d */
    public class C94032d extends RecyclerView.C16631z {

        /* renamed from: A */
        public ImageView f271470A = ((ImageView) this.f271474E.findViewById(C0966R.C0970id.l6d));

        /* renamed from: B */
        public TextView f271471B = ((TextView) this.f271474E.findViewById(C0966R.C0970id.ebv));

        /* renamed from: C */
        public TextView f271472C = ((TextView) this.f271474E.findViewById(C0966R.C0970id.ebr));

        /* renamed from: D */
        public ImageView f271473D = ((ImageView) this.f271474E.findViewById(C0966R.C0970id.f358308ec0));

        /* renamed from: E */
        public View f271474E;

        /* renamed from: z */
        public ImageView f271475z;

        public C94032d(SelectAlbumPreviewFolderUI selectAlbumPreviewFolderUI, View view) {
            super(view);
            this.f271474E = view;
            this.f271475z = (ImageView) view.findViewById(C0966R.C0970id.f358309ec1);
        }
    }

    /* renamed from: H7 */
    public static String m118865H7(SelectAlbumPreviewFolderUI selectAlbumPreviewFolderUI) {
        selectAlbumPreviewFolderUI.getClass();
        return C93958f.m118750j().f271197g == 1 ? selectAlbumPreviewFolderUI.getString(C0966R.string.f4y) : C93958f.m118750j().f271197g == 3 ? selectAlbumPreviewFolderUI.getString(C0966R.string.f4z) : selectAlbumPreviewFolderUI.getString(C0966R.string.f360829f50);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bw4;
    }

    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C93958f.m118750j().f271191a.remove(this);
        C93958f.m118750j().f271191a.add(this);
        C93958f.m118750j().mo128908e();
        this.f271462f = (RecyclerView) findViewById(C0966R.C0970id.eby);
        this.f271461e = new C94031c(this);
        this.f271462f.setLayoutManager(new LinearLayoutManager(this));
        this.f271462f.setAdapter(this.f271461e);
        this.f271464h = getIntent().getStringExtra("select_folder_name");
        GalleryItem$AlbumItem galleryItem$AlbumItem = new GalleryItem$AlbumItem("", 0);
        this.f271463g = galleryItem$AlbumItem;
        galleryItem$AlbumItem.f271101i = new GalleryItem$ImageMediaItem();
        setMMTitle(Util.nullAsNil(getString(C0966R.string.f7983yb)));
        setBackBtn(new C94029a());
    }

    public void onDestroy() {
        super.onDestroy();
        C93958f.m118750j().f271191a.remove(this);
    }

    /* renamed from: z7 */
    public void mo86519z7(LinkedList<GalleryItem$AlbumItem> linkedList) {
        C93958f.m118753m().mo128895c(new C94030b(linkedList));
    }
}
