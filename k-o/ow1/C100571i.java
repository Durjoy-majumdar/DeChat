package ow1;

import android.content.Context;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$AlbumItem;
import com.tencent.p014mm.plugin.gallery.model.PrivateAlbumItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import java.util.List;

/* renamed from: ow1.i */
public class C100571i extends BaseAdapter {

    /* renamed from: d */
    public Context f294658d;

    /* renamed from: e */
    public LinkedList<GalleryItem$AlbumItem> f294659e;

    /* renamed from: f */
    public String f294660f = "";

    /* renamed from: ow1.i$a */
    public static class C100572a {

        /* renamed from: a */
        public ImageView f294661a;

        /* renamed from: b */
        public TextView f294662b;

        /* renamed from: c */
        public TextView f294663c;

        /* renamed from: d */
        public ImageView f294664d;

        /* renamed from: e */
        public View f294665e;

        /* renamed from: f */
        public View f294666f;

        /* renamed from: g */
        public View f294667g;
    }

    public C100571i(Context context) {
        this.f294658d = context;
        this.f294659e = new LinkedList<>();
    }

    /* renamed from: a */
    public void mo140031a(PrivateAlbumItem privateAlbumItem, LinkedList<PrivateAlbumItem> linkedList) {
        LinkedList<GalleryItem$AlbumItem> linkedList2 = this.f294659e;
        if (linkedList2 == null) {
            return;
        }
        if (privateAlbumItem != null || linkedList2.size() > 0) {
            if (privateAlbumItem != null) {
                Log.m105924i("MicroMsg.GalleryAdapter", "add favorite album item.");
                int i = -1;
                if (!Util.isNullOrNil((List) this.f294659e)) {
                    int i2 = -1;
                    i = 0;
                    while (true) {
                        if (i >= this.f294659e.size()) {
                            i = i2;
                            break;
                        }
                        GalleryItem$AlbumItem galleryItem$AlbumItem = this.f294659e.get(i);
                        if (galleryItem$AlbumItem.f271103n) {
                            break;
                        }
                        if (galleryItem$AlbumItem.f271102j) {
                            i2 = i;
                        }
                        i++;
                    }
                }
                int i3 = i + 1;
                if (i3 < this.f294659e.size()) {
                    this.f294659e.add(i3, privateAlbumItem);
                } else {
                    this.f294659e.add(privateAlbumItem);
                }
            }
            if (linkedList.size() > 0) {
                Log.m105925i("MicroMsg.GalleryAdapter", "add other private album, size: [%s].", Integer.valueOf(linkedList.size()));
                this.f294659e.addAll(linkedList);
            }
        }
    }

    public int getCount() {
        return this.f294659e.size();
    }

    public Object getItem(int i) {
        return this.f294659e.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v52, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: ow1.i$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r30, android.view.View r31, android.view.ViewGroup r32) {
        /*
            r29 = this;
            r0 = r29
            r7 = r30
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "duanyi test getView:"
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.GalleryAdapter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            java.util.LinkedList<com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem> r1 = r0.f294659e
            java.lang.Object r1 = r1.get(r7)
            r10 = r1
            com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem r10 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$AlbumItem) r10
            r11 = 0
            if (r31 != 0) goto L_0x008f
            android.content.Context r1 = r0.f294658d
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r3 = 2131497319(0x7f0c1167, float:1.8618228E38)
            r4 = r32
            android.view.View r1 = r1.inflate(r3, r4, r11)
            ow1.i$a r3 = new ow1.i$a
            r3.<init>()
            r4 = 2131305067(0x7f09226b, float:1.8228294E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f294661a = r4
            r4 = 2131305061(0x7f092265, float:1.8228282E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f294662b = r4
            r4 = 2131316187(0x7f094ddb, float:1.8250848E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r4 = 2131305057(0x7f092261, float:1.8228274E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f294663c = r4
            r4 = 2131305066(0x7f09226a, float:1.8228292E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f294664d = r4
            r4 = 2131305068(0x7f09226c, float:1.8228296E38)
            android.view.View r4 = r1.findViewById(r4)
            r3.f294665e = r4
            r4 = 2131305059(0x7f092263, float:1.8228278E38)
            android.view.View r4 = r1.findViewById(r4)
            r3.f294666f = r4
            r4 = 2131305060(0x7f092264, float:1.822828E38)
            android.view.View r4 = r1.findViewById(r4)
            r3.f294667g = r4
            r1.setTag(r3)
            r12 = r1
            goto L_0x0098
        L_0x008f:
            java.lang.Object r1 = r31.getTag()
            r3 = r1
            ow1.i$a r3 = (ow1.C100571i.C100572a) r3
            r12 = r31
        L_0x0098:
            r13 = r3
            java.lang.String r1 = r0.f294660f
            java.lang.String r3 = r10.f271096d
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a9
            android.widget.ImageView r1 = r13.f294664d
            r1.setVisibility(r11)
            goto L_0x00af
        L_0x00a9:
            android.widget.ImageView r1 = r13.f294664d
            r3 = 4
            r1.setVisibility(r3)
        L_0x00af:
            android.view.View r1 = r13.f294666f
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            r3.mo10233c(r4)
            java.lang.Object[] r15 = r3.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/gallery/ui/GalleryAdapter"
            java.lang.String r17 = "getView"
            java.lang.String r18 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r1
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r3 = r3.mo10231a(r11)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r15 = "com/tencent/mm/plugin/gallery/ui/GalleryAdapter"
            java.lang.String r16 = "getView"
            java.lang.String r17 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            android.view.View r1 = r13.f294667g
            k20.a r3 = new k20.a
            r3.<init>()
            r4 = 8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r3.mo10233c(r5)
            java.lang.Object[] r22 = r3.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/gallery/ui/GalleryAdapter"
            java.lang.String r24 = "getView"
            java.lang.String r25 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r1
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.Object r3 = r3.mo10231a(r11)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r22 = "com/tencent/mm/plugin/gallery/ui/GalleryAdapter"
            java.lang.String r23 = "getView"
            java.lang.String r24 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
            boolean r1 = r10.f271102j
            if (r1 != 0) goto L_0x0140
            boolean r3 = r10.f271103n
            if (r3 != 0) goto L_0x0140
            int r1 = r10.f271098f
        L_0x013e:
            r14 = r1
            goto L_0x0186
        L_0x0140:
            if (r1 == 0) goto L_0x0163
            java.util.LinkedList<com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem> r1 = r0.f294659e
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
        L_0x0149:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0184
            java.lang.Object r5 = r1.next()
            com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem r5 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$AlbumItem) r5
            boolean r6 = r5.f271102j
            if (r6 != 0) goto L_0x0149
            boolean r6 = r5.f271103n
            if (r6 != 0) goto L_0x0149
            int r5 = r5.f271098f
            if (r5 <= 0) goto L_0x0149
            int r3 = r3 + r5
            goto L_0x0149
        L_0x0163:
            java.util.LinkedList<com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem> r1 = r0.f294659e
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
        L_0x016a:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0184
            java.lang.Object r5 = r1.next()
            com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem r5 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$AlbumItem) r5
            boolean r6 = r5.f271102j
            if (r6 != 0) goto L_0x016a
            boolean r6 = r5.f271103n
            if (r6 != 0) goto L_0x016a
            int r5 = r5.f271100h
            if (r5 <= 0) goto L_0x016a
            int r3 = r3 + r5
            goto L_0x016a
        L_0x0184:
            r1 = r3
            goto L_0x013e
        L_0x0186:
            java.lang.String r15 = ""
            r8 = 2131830593(0x7f112741, float:1.9294188E38)
            r9 = 1
            if (r7 != 0) goto L_0x0227
            android.widget.ImageView r1 = r13.f294661a
            r2 = 2131234404(0x7f080e64, float:1.8084973E38)
            r1.setImageResource(r2)
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r1 = r10.f271101i
            if (r1 == 0) goto L_0x01b7
            android.widget.ImageView r1 = r13.f294661a
            int r2 = r10.mo128862f()
            java.lang.String r3 = r10.mo128861e()
            java.lang.String r4 = r10.mo128856a()
            long r5 = r10.mo128857b()
            long r16 = r10.mo128858c()
            r7 = r30
            r8 = r16
            ow1.C100562c0.m131590a(r1, r2, r3, r4, r5, r7, r8)
        L_0x01b7:
            android.widget.ImageView r1 = r13.f294661a
            r1.setVisibility(r11)
            com.tencent.mm.plugin.gallery.model.n r1 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
            int r1 = r1.f271197g
            r3 = 1
            if (r1 != r3) goto L_0x01d3
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2 = 2131830588(0x7f11273c, float:1.9294178E38)
            java.lang.String r1 = r1.getString(r2)
            r10.f271097e = r1
            goto L_0x01f7
        L_0x01d3:
            com.tencent.mm.plugin.gallery.model.n r1 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
            int r1 = r1.f271197g
            r2 = 3
            if (r1 != r2) goto L_0x01ea
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2 = 2131830589(0x7f11273d, float:1.929418E38)
            java.lang.String r1 = r1.getString(r2)
            r10.f271097e = r1
            goto L_0x01f7
        L_0x01ea:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2 = 2131830590(0x7f11273e, float:1.9294182E38)
            java.lang.String r1 = r1.getString(r2)
            r10.f271097e = r1
        L_0x01f7:
            android.widget.TextView r1 = r13.f294662b
            java.lang.String r2 = r10.f271097e
            r1.setText(r2)
            android.widget.TextView r1 = r13.f294662b
            r1.setVisibility(r11)
            android.widget.TextView r1 = r13.f294663c
            r1.setVisibility(r11)
            if (r14 <= 0) goto L_0x0221
            android.widget.TextView r1 = r13.f294663c
            android.content.Context r2 = r0.f294658d
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            r3[r11] = r4
            r5 = 2131830593(0x7f112741, float:1.9294188E38)
            java.lang.String r2 = r2.getString(r5, r3)
            r1.setText(r2)
            goto L_0x0226
        L_0x0221:
            android.widget.TextView r1 = r13.f294663c
            r1.setText(r15)
        L_0x0226:
            return r12
        L_0x0227:
            r3 = 1
            r5 = 2131830593(0x7f112741, float:1.9294188E38)
            android.widget.ImageView r1 = r13.f294661a
            r1.setVisibility(r11)
            android.widget.TextView r1 = r13.f294662b
            r1.setVisibility(r11)
            android.widget.TextView r1 = r13.f294662b
            java.lang.String r6 = r10.f271097e
            r1.setText(r6)
            android.widget.TextView r1 = r13.f294663c
            r1.setVisibility(r11)
            if (r14 <= 0) goto L_0x0257
            android.widget.TextView r1 = r13.f294663c
            android.content.Context r6 = r0.f294658d
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)
            r3[r11] = r8
            java.lang.String r3 = r6.getString(r5, r3)
            r1.setText(r3)
            goto L_0x025c
        L_0x0257:
            android.widget.TextView r1 = r13.f294663c
            r1.setText(r15)
        L_0x025c:
            android.view.View r1 = r13.f294665e
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r3.mo10233c(r5)
            java.lang.Object[] r17 = r3.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/gallery/ui/GalleryAdapter"
            java.lang.String r19 = "getView"
            java.lang.String r20 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r3 = r3.mo10231a(r11)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r17 = "com/tencent/mm/plugin/gallery/ui/GalleryAdapter"
            java.lang.String r18 = "getView"
            java.lang.String r19 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r3 = r10.mo128861e()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r1 != 0) goto L_0x02bf
            android.widget.ImageView r1 = r13.f294661a
            int r2 = r10.mo128862f()
            java.lang.String r4 = r10.mo128856a()
            long r5 = r10.mo128857b()
            long r8 = r10.mo128858c()
            r7 = r30
            ow1.C100562c0.m131590a(r1, r2, r3, r4, r5, r7, r8)
            goto L_0x02f2
        L_0x02bf:
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r1 = r10.f271101i
            if (r1 == 0) goto L_0x02e3
            int r1 = r1.getType()
            r3 = 2
            if (r1 != r3) goto L_0x02e3
            android.widget.ImageView r1 = r13.f294661a
            int r2 = r10.mo128862f()
            r3 = 0
            java.lang.String r4 = r10.mo128856a()
            long r5 = r10.mo128857b()
            long r8 = r10.mo128858c()
            r7 = r30
            ow1.C100562c0.m131590a(r1, r2, r3, r4, r5, r7, r8)
            goto L_0x02f2
        L_0x02e3:
            java.lang.String r1 = "get folder failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            android.widget.ImageView r1 = r13.f294661a
            r1.setVisibility(r4)
            android.widget.TextView r1 = r13.f294662b
            r1.setVisibility(r4)
        L_0x02f2:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ow1.C100571i.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
