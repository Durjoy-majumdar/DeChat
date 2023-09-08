package ge3;

import android.app.ProgressDialog;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gallery.model.C93958f;
import com.tencent.p014mm.plugin.gallery.model.C93964k;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI;
import com.tencent.p014mm.pluginsdk.p133ui.pin.PinnedHeaderRecyclerView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fe3.C58970b;
import gy3.C87412m;
import hw1.C60218q;
import hw1.C98554s;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import qw1.C101316l;
import sx3.C64197v;
import z04.C112551y;

/* renamed from: ge3.a */
public final class C59409a implements C93964k.C93967c {

    /* renamed from: C */
    public static long f169785C;

    /* renamed from: A */
    public final C59413d f169786A = new C59413d(this);

    /* renamed from: B */
    public final C58970b.C58973c f169787B = new C59412c(this);

    /* renamed from: d */
    public final FileSelectorUI f169788d;

    /* renamed from: e */
    public boolean f169789e;

    /* renamed from: f */
    public final int f169790f = 26;

    /* renamed from: g */
    public final int f169791g = 3;

    /* renamed from: h */
    public ProgressDialog f169792h;

    /* renamed from: i */
    public int f169793i;

    /* renamed from: j */
    public volatile long f169794j = -1;

    /* renamed from: n */
    public final int f169795n = 3;

    /* renamed from: o */
    public PinnedHeaderRecyclerView f169796o;

    /* renamed from: p */
    public C58970b f169797p;

    /* renamed from: q */
    public String f169798q;

    /* renamed from: r */
    public String f169799r;

    /* renamed from: s */
    public long f169800s;

    /* renamed from: t */
    public C60218q.C60219a f169801t = C60218q.C60219a.IDLE;

    /* renamed from: u */
    public int f169802u = -1;

    /* renamed from: v */
    public int f169803v = -1;

    /* renamed from: w */
    public int f169804w;

    /* renamed from: x */
    public volatile C59410a f169805x;

    /* renamed from: y */
    public C58970b.C58973c f169806y;

    /* renamed from: z */
    public boolean f169807z;

    /* renamed from: ge3.a$a */
    public enum C59410a {
        CREATE,
        SKIP
    }

    /* renamed from: ge3.a$b */
    public static final class C59411b implements Runnable {

        /* renamed from: d */
        public WeakReference<C58970b> f169811d;

        /* renamed from: e */
        public WeakReference<ProgressDialog> f169812e;

        /* renamed from: f */
        public WeakReference<PinnedHeaderRecyclerView> f169813f;

        /* renamed from: g */
        public LinkedList<GalleryItem$MediaItem> f169814g;

        /* renamed from: h */
        public boolean f169815h;

        public void run() {
            PinnedHeaderRecyclerView pinnedHeaderRecyclerView;
            GalleryItem$MediaItem next;
            int indexOf;
            Object[] objArr = new Object[1];
            LinkedList<GalleryItem$MediaItem> linkedList = this.f169814g;
            objArr[0] = linkedList == null ? -1 : linkedList != null ? Integer.valueOf(linkedList.size()) : null;
            Log.m105919d("FS.AlbumFileUIC", "on NotifyMediaItemsChanged, size %d", objArr);
            LinkedList<GalleryItem$MediaItem> linkedList2 = this.f169814g;
            if (linkedList2 == null) {
                Log.m105920e("FS.AlbumFileUIC", "[filterEditMediaItem] mMediaItems is null!");
            } else {
                HashSet<GalleryItem$MediaItem> h = C93958f.m118748h();
                if (h == null || h.isEmpty()) {
                    Log.m105924i("FS.AlbumFileUIC", "editedMediaSet is invalid.");
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    Log.m105925i("FS.AlbumFileUIC", "[filterEditMediaItem] size:%s", Integer.valueOf(linkedList2.size()));
                    Iterator<GalleryItem$MediaItem> it = h.iterator();
                    while (it.hasNext() && -1 != (indexOf = linkedList2.indexOf(next))) {
                        GalleryItem$MediaItem galleryItem$MediaItem = linkedList2.get(indexOf);
                        C87412m.m108593f(galleryItem$MediaItem, "mMediaItems[i]");
                        GalleryItem$MediaItem galleryItem$MediaItem2 = galleryItem$MediaItem;
                        if (C87412m.m108589b((next = it.next()).f162755o, "edit") && !C87412m.m108589b(galleryItem$MediaItem2.f162755o, "edit")) {
                            Log.m105919d("FS.AlbumFileUIC", "item:%s, editItem:%s", galleryItem$MediaItem2, next);
                            linkedList2.set(indexOf, next);
                        }
                    }
                    Log.m105919d("FS.AlbumFileUIC", "[filterEditMediaItem] cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                }
            }
            WeakReference<C58970b> weakReference = this.f169811d;
            if (weakReference == null) {
                Log.m105928w("FS.AlbumFileUIC", "null == adapterRef");
                return;
            }
            C58970b bVar = weakReference != null ? weakReference.get() : null;
            if (bVar == null) {
                Log.m105928w("FS.AlbumFileUIC", "null == adapter");
                return;
            }
            WeakReference<PinnedHeaderRecyclerView> weakReference2 = this.f169813f;
            if (weakReference2 != null && weakReference2 != null && (pinnedHeaderRecyclerView = weakReference2.get()) != null) {
                Log.m105919d("FS.AlbumFileUIC", "isSwitchAlbum: %s.", Boolean.valueOf(this.f169815h));
                if (this.f169812e != null) {
                    LinkedList<GalleryItem$MediaItem> linkedList3 = this.f169814g;
                    if (linkedList3 != null) {
                        C98554s sVar = C98554s.f289007d;
                        C98554s sVar2 = C98554s.f289007d;
                        sVar2.mo137930d(linkedList3);
                        if (this.f169815h) {
                            this.f169815h = false;
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(0);
                            PinnedHeaderRecyclerView pinnedHeaderRecyclerView2 = pinnedHeaderRecyclerView;
                            C98554s sVar3 = sVar2;
                            C117292a.m165358d(pinnedHeaderRecyclerView2, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/AlbumFileUIC$NotifyMediaItemsChanged", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                            pinnedHeaderRecyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(pinnedHeaderRecyclerView2, "com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/AlbumFileUIC$NotifyMediaItemsChanged", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                            bVar.f168741g.clear();
                            bVar.f168741g.addAll(bVar.mo84199O4(linkedList3));
                            bVar.notifyDataSetChanged();
                            C60218q.C60219a aVar2 = C60218q.C60219a.IDLE;
                            int i = 32;
                            if (linkedList3.size() <= 32) {
                                i = linkedList3.size();
                            }
                            sVar3.mo137928b(aVar2, 0, i, bVar.mo84201u5());
                        } else {
                            ArrayList<GalleryItem$MediaItem> G4 = bVar.mo84198G4(bVar.f168741g);
                            bVar.f168741g = G4;
                            int size = G4.size();
                            int size2 = linkedList3.size();
                            if (size < size2) {
                                ArrayList arrayList = new ArrayList();
                                for (GalleryItem$MediaItem next2 : linkedList3.subList(size, size2)) {
                                    if (next2 != null) {
                                        arrayList.add(next2);
                                    }
                                }
                                bVar.f168741g.addAll(arrayList);
                                bVar.f168741g = bVar.mo84199O4(bVar.f168741g);
                                bVar.notifyDataSetChanged();
                            }
                        }
                    }
                    WeakReference<ProgressDialog> weakReference3 = this.f169812e;
                    ProgressDialog progressDialog = weakReference3 != null ? weakReference3.get() : null;
                    if (progressDialog != null && progressDialog.isShowing()) {
                        progressDialog.dismiss();
                        Log.m105925i("FS.AlbumFileUIC", "[NotifyMediaItemsChanged] cost:%s", Long.valueOf(System.currentTimeMillis() - C59409a.f169785C));
                    }
                }
            }
        }

        public String toString() {
            return super.toString() + "|NotifyMediaItemsChanged";
        }
    }

    /* renamed from: ge3.a$c */
    public static final class C59412c implements C58970b.C58973c {

        /* renamed from: a */
        public final /* synthetic */ C59409a f169816a;

        public C59412c(C59409a aVar) {
            this.f169816a = aVar;
        }

        /* renamed from: a */
        public void mo84205a(int i, View view, int i2) {
            int i3;
            boolean z = true;
            if (i2 == 1) {
                C59409a aVar = this.f169816a;
                C58970b bVar = aVar.f169797p;
                ArrayList<GalleryItem$MediaItem> arrayList = null;
                GalleryItem$MediaItem g5 = bVar != null ? bVar.mo84200g5(i) : null;
                if (g5 == null || Util.isNullOrNil(g5.f162747d)) {
                    Object[] objArr = new Object[1];
                    if (g5 != null) {
                        z = false;
                    }
                    objArr[0] = Boolean.valueOf(z);
                    Log.m105929w("FS.AlbumFileUIC", "item is null %s, item original path is null", objArr);
                } else if (C93958f.m118750j().f271196f != 5 || !C112551y.m153809i(g5.f162755o, "image/gif", true)) {
                    C58970b bVar2 = aVar.f169797p;
                    ArrayList<GalleryItem$MediaItem> arrayList2 = bVar2 != null ? bVar2.f168741g : null;
                    if (arrayList2 != null) {
                        ArrayList<GalleryItem$MediaItem> G4 = bVar2 != null ? bVar2.mo84198G4(arrayList2) : null;
                        GalleryItem$MediaItem galleryItem$MediaItem = arrayList2.get(i);
                        if (galleryItem$MediaItem != null && G4 != null) {
                            Iterator<T> it = G4.iterator();
                            i3 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                T next = it.next();
                                int i4 = i3 + 1;
                                if (i3 < 0) {
                                    C64197v.m75542k();
                                    throw null;
                                } else if (C87412m.m108589b((GalleryItem$MediaItem) next, galleryItem$MediaItem)) {
                                    break;
                                } else {
                                    i3 = i4;
                                }
                            }
                        }
                    }
                    i3 = -1;
                    if (i3 == -1) {
                        Log.m105920e("FS.AlbumFileUIC", "onMediaClick, oldPos:" + i + ", newPos:-1");
                    } else {
                        Log.m105919d("FS.AlbumFileUIC", "onMediaClick, querySource %s item %s.", Integer.valueOf(aVar.f169790f), g5);
                        C58970b bVar3 = aVar.f169797p;
                        C93958f.m118755o(bVar3 != null ? bVar3.mo84198G4(bVar3.f168741g) : null);
                        Intent intent = new Intent(aVar.f169788d.getContext(), ImagePreviewUI.class);
                        intent.putExtra("query_source_type", aVar.f169790f);
                        C58970b bVar4 = aVar.f169797p;
                        intent.putStringArrayListExtra("preview_image_list", bVar4 != null ? bVar4.mo84202w5() : null);
                        C58970b bVar5 = aVar.f169797p;
                        if (bVar5 != null) {
                            arrayList = bVar5.f168742h;
                        }
                        intent.putParcelableArrayListExtra("preview_media_item_list", arrayList);
                        intent.putExtra("preview_all", true);
                        intent.putExtra("preview_position", i3);
                        aVar.mo84527b(i3, true);
                        intent.putExtra("send_raw_img", true);
                        intent.putExtra("key_force_hide_edit_image_button", true);
                        intent.putExtra("key_force_show_raw_image_button", false);
                        intent.putExtra("key_is_raw_image_button_disable", true);
                        intent.putExtra("max_select_count", aVar.f169793i - aVar.f169788d.mo135135K7());
                        intent.putExtra("GalleryUI_FromUser", aVar.f169798q);
                        intent.putExtra("GalleryUI_ToUser", aVar.f169799r);
                        intent.putExtra("album_video_max_duration", Integer.MAX_VALUE);
                        intent.putExtra("album_video_min_duration", 0);
                        intent.putExtra("media_type", 2);
                        intent.putExtra("select_type_tag", aVar.f169795n);
                        aVar.f169788d.startActivityForResult(intent, 0);
                    }
                } else {
                    C76879j.m92726T(aVar.f169788d.getContext(), aVar.f169788d.getString(C0966R.string.f6b));
                }
                C58970b.C58973c cVar = this.f169816a.f169806y;
                if (cVar != null) {
                    cVar.mo84205a(i, view, i2);
                }
            }
        }

        /* renamed from: b */
        public void mo84206b(int i, boolean z) {
            C58970b.C58973c cVar = this.f169816a.f169806y;
            if (cVar != null) {
                cVar.mo84206b(i, z);
            }
        }
    }

    /* renamed from: ge3.a$d */
    public static final class C59413d implements C58970b.C58972b {

        /* renamed from: a */
        public final /* synthetic */ C59409a f169817a;

        public C59413d(C59409a aVar) {
            this.f169817a = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:41:0x00ff A[LOOP:0: B:41:0x00ff->B:44:0x010f, LOOP_START] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo84204a(int r7, int r8, int r9, int r10) {
            /*
                r6 = this;
                ge3.a r9 = r6.f169817a
                fe3.b r9 = r9.f169797p
                if (r9 == 0) goto L_0x0111
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r9 = r9.mo84200g5(r8)
                if (r9 != 0) goto L_0x000e
                goto L_0x0111
            L_0x000e:
                r0 = 0
                r1 = 0
                if (r10 != 0) goto L_0x00c6
                int r10 = r9.getType()
                r2 = 1
                if (r10 != r2) goto L_0x0030
                ew1.e r10 = ew1.C97754e.C97756b.f286807a
                java.lang.String r9 = r9.f162747d
                ge3.a r1 = r6.f169817a
                int r1 = r1.f169795n
                r10.mo137083b(r9, r1, r8)
                ge3.a r9 = r6.f169817a
                r9.mo84528c(r7)
                ge3.a r7 = r6.f169817a
                r7.mo84527b(r8, r2)
                goto L_0x00db
            L_0x0030:
                int r10 = r9.getType()
                r3 = 2
                if (r10 != r3) goto L_0x00b0
                ge3.a r10 = r6.f169817a
                r10.getClass()
                java.lang.String r3 = r9.f162747d
                android.net.Uri r3 = com.tencent.p014mm.vfs.C116299g2.m163858n(r3)
                java.lang.String r4 = r3.getPath()
                if (r4 == 0) goto L_0x0062
                java.lang.String r4 = com.tencent.p014mm.vfs.C116299g2.m163855k(r4, r1, r1)
                java.lang.String r5 = r3.getPath()
                boolean r5 = r5.equals(r4)
                if (r5 != 0) goto L_0x0062
                android.net.Uri$Builder r3 = r3.buildUpon()
                android.net.Uri$Builder r3 = r3.path(r4)
                android.net.Uri r3 = r3.build()
            L_0x0062:
                com.tencent.mm.vfs.f0 r4 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
                com.tencent.mm.vfs.f0$h r3 = r4.mo177799l(r3, r0)
                boolean r4 = r3.mo177810a()
                if (r4 != 0) goto L_0x0070
                r3 = 0
                goto L_0x0078
            L_0x0070:
                com.tencent.mm.vfs.FileSystem$c r4 = r3.f348991a
                java.lang.String r3 = r3.f348992b
                boolean r3 = r4.mo119948x(r3)
            L_0x0078:
                if (r3 != 0) goto L_0x008d
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI r3 = r10.f169788d
                androidx.appcompat.app.AppCompatActivity r3 = r3.getContext()
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI r10 = r10.f169788d
                r4 = 2131830647(0x7f112777, float:1.9294297E38)
                java.lang.String r10 = r10.getString(r4)
                nj3.C76879j.m92729W(r3, r10)
                goto L_0x008e
            L_0x008d:
                r1 = 1
            L_0x008e:
                if (r1 != 0) goto L_0x009a
                ge3.a r7 = r6.f169817a
                fe3.b r7 = r7.f169797p
                if (r7 == 0) goto L_0x00db
                r7.mo84203y5(r9)
                goto L_0x00db
            L_0x009a:
                ew1.e r10 = ew1.C97754e.C97756b.f286807a
                java.lang.String r9 = r9.f162747d
                ge3.a r1 = r6.f169817a
                int r1 = r1.f169795n
                r10.mo137083b(r9, r1, r8)
                ge3.a r9 = r6.f169817a
                r9.mo84528c(r7)
                ge3.a r7 = r6.f169817a
                r7.mo84527b(r8, r2)
                goto L_0x00db
            L_0x00b0:
                ew1.e r10 = ew1.C97754e.C97756b.f286807a
                java.lang.String r9 = r9.f162747d
                ge3.a r1 = r6.f169817a
                int r1 = r1.f169795n
                r10.mo137083b(r9, r1, r8)
                ge3.a r9 = r6.f169817a
                r9.mo84528c(r7)
                ge3.a r7 = r6.f169817a
                r7.mo84527b(r8, r2)
                goto L_0x00db
            L_0x00c6:
                ew1.e r10 = ew1.C97754e.C97756b.f286807a
                java.lang.String r9 = r9.f162747d
                ge3.a r2 = r6.f169817a
                int r2 = r2.f169795n
                r10.mo137083b(r9, r2, r8)
                ge3.a r9 = r6.f169817a
                r9.mo84528c(r7)
                ge3.a r7 = r6.f169817a
                r7.mo84527b(r8, r1)
            L_0x00db:
                ge3.a r7 = r6.f169817a
                fe3.b r7 = r7.f169797p
                if (r7 == 0) goto L_0x00e6
                java.util.ArrayList r7 = r7.mo84202w5()
                goto L_0x00e7
            L_0x00e6:
                r7 = r0
            L_0x00e7:
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r7)
                if (r7 == 0) goto L_0x00ee
                return
            L_0x00ee:
                ge3.a r7 = r6.f169817a
                fe3.b r7 = r7.f169797p
                if (r7 == 0) goto L_0x00f8
                java.util.ArrayList r0 = r7.mo84202w5()
            L_0x00f8:
                gy3.C87412m.m108591d(r0)
                java.util.Iterator r7 = r0.iterator()
            L_0x00ff:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x0111
                java.lang.Object r8 = r7.next()
                java.lang.String r8 = (java.lang.String) r8
                boolean r8 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isGif((java.lang.String) r8)
                if (r8 != 0) goto L_0x00ff
            L_0x0111:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ge3.C59409a.C59413d.mo84204a(int, int, int, int):void");
        }
    }

    public C59409a(FileSelectorUI fileSelectorUI) {
        C87412m.m108594g(fileSelectorUI, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f169788d = fileSelectorUI;
    }

    /* renamed from: B3 */
    public void mo80207B3(LinkedList<GalleryItem$MediaItem> linkedList, long j, boolean z) {
        if (j != this.f169794j) {
            Log.m105929w("FS.AlbumFileUIC", "%s %s, not my query, ignore.", Long.valueOf(j), Long.valueOf(this.f169794j));
            Log.m105928w("FS.AlbumFileUIC", "If you saw too mush this log, maybe user had too many photos. This can be optimized.");
        } else if (linkedList == null) {
            Log.m105920e("FS.AlbumFileUIC", "onQueryMediaFinished, null == mediaItems");
        } else {
            Object[] objArr = new Object[3];
            objArr[0] = Boolean.valueOf(z);
            C58970b bVar = this.f169797p;
            objArr[1] = bVar != null ? Integer.valueOf(bVar.mo84201u5()) : null;
            objArr[2] = Integer.valueOf(linkedList.size());
            Log.m105919d("FS.AlbumFileUIC", "onQueryMediaFinished: %s %s %s.", objArr);
            C58970b bVar2 = this.f169797p;
            if (bVar2 != null) {
                if (z || bVar2.mo84201u5() > linkedList.size()) {
                    mo84526a(linkedList);
                } else {
                    List<GalleryItem$MediaItem> subList = linkedList.subList(bVar2.mo84201u5(), linkedList.size());
                    C87412m.m108593f(subList, "mediaItems.subList(it.mediaCount, mediaItems.size)");
                    mo84526a(subList);
                }
                LinkedList<GalleryItem$MediaItem> linkedList2 = new LinkedList<>(linkedList);
                Object[] objArr2 = new Object[2];
                objArr2[0] = Boolean.valueOf(this.f169797p == null);
                objArr2[1] = Util.getStack().toString();
                Log.m105925i("FS.AlbumFileUIC", "[onQueryMediaFinished] adapter is null?:%s %s", objArr2);
                if (this.f169797p != null) {
                    C59411b bVar3 = new C59411b();
                    bVar3.f169811d = new WeakReference<>(this.f169797p);
                    bVar3.f169812e = new WeakReference<>(this.f169792h);
                    bVar3.f169813f = new WeakReference<>(this.f169796o);
                    bVar3.f169814g = linkedList2;
                    bVar3.f169815h = z;
                    if (C59410a.CREATE == this.f169805x) {
                        this.f169805x = C59410a.SKIP;
                    }
                    C93958f.m118753m().mo128895c(bVar3);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo84526a(List<GalleryItem$MediaItem> list) {
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105919d("FS.AlbumFileUIC", "filterNonExistMedia size: %s.", Integer.valueOf(list.size()));
        LinkedList linkedList = new LinkedList();
        for (GalleryItem$MediaItem next : list) {
            if (!C86013q1.m106450k(next.f162747d)) {
                Log.m105929w("FS.AlbumFileUIC", "filter non exist media: %s.", next.f162747d);
                linkedList.add(next);
            }
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            list.remove((GalleryItem$MediaItem) it.next());
        }
        Log.m105919d("FS.AlbumFileUIC", "filterNonExistMedia cost: %s.", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: b */
    public final void mo84527b(int i, boolean z) {
        GalleryItem$MediaItem galleryItem$MediaItem;
        if (!Util.isNullOrNil(this.f169798q) && !C87412m.m108589b("medianote", this.f169799r)) {
            if (Util.currentTicks() - this.f169800s < 1000) {
                Log.m105928w("FS.AlbumFileUIC", "sendImg btn event frequency limit");
                return;
            }
            Log.m105924i("FS.AlbumFileUIC", "notifyMM switch to SendImgProxyUI");
            C58970b bVar = this.f169797p;
            String str = null;
            if (bVar != null) {
                GalleryItem$MediaItem galleryItem$MediaItem2 = bVar.f168741g.get(i);
                C87412m.m108593f(galleryItem$MediaItem2, "allMediaItems[position]");
                galleryItem$MediaItem = galleryItem$MediaItem2;
            } else {
                galleryItem$MediaItem = null;
            }
            boolean z2 = false;
            if (galleryItem$MediaItem != null && galleryItem$MediaItem.getType() == 2) {
                z2 = true;
            }
            if (!z2) {
                try {
                    FileSelectorUI fileSelectorUI = this.f169788d;
                    long j = galleryItem$MediaItem != null ? galleryItem$MediaItem.f162751h : 0;
                    if (galleryItem$MediaItem != null) {
                        str = galleryItem$MediaItem.f162747d;
                    }
                    C101316l.m132911j(fileSelectorUI, j, str, this.f169799r, false, 0, z);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo84528c(int i) {
        int K7 = i + this.f169788d.mo135135K7();
        if (K7 == 0) {
            this.f169788d.enableOptionMenu(false);
            FileSelectorUI fileSelectorUI = this.f169788d;
            fileSelectorUI.updateOptionMenuText(1, fileSelectorUI.getString(C0966R.string.a2s));
            return;
        }
        this.f169788d.enableOptionMenu(true);
        FileSelectorUI fileSelectorUI2 = this.f169788d;
        fileSelectorUI2.updateOptionMenuText(1, this.f169788d.getString(C0966R.string.a2s) + '(' + K7 + "/9)");
    }
}
