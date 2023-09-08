package zf1;

import android.content.Context;
import android.content.Intent;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.MMFinderFragment;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import jq3.C9500j;
import pe3.C89349b;

/* renamed from: zf1.b */
public abstract class C66792b {

    /* renamed from: b */
    public static final C66793a f191892b = new C66793a((C8480h) null);

    /* renamed from: a */
    public final C66791a f191893a;

    /* renamed from: zf1.b$a */
    public static final class C66793a {
        public C66793a(C8480h hVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0094  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final zf1.C66792b mo90791a(android.content.Intent r8) {
            /*
                r7 = this;
                java.lang.String r0 = "intent"
                gy3.C87412m.m108594g(r8, r0)
                java.lang.String r0 = "TAB_LIST"
                java.util.ArrayList r0 = r8.getIntegerArrayListExtra(r0)
                if (r0 != 0) goto L_0x0012
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
            L_0x0012:
                java.lang.String r1 = "BIZ_SCENE"
                r2 = 0
                int r1 = r8.getIntExtra(r1, r2)
                java.lang.String r3 = "EXT_BUFF"
                byte[] r3 = r8.getByteArrayExtra(r3)
                com.tencent.mm.protocal.protobuf.FinderObject r4 = new com.tencent.mm.protocal.protobuf.FinderObject
                r4.<init>()
                java.lang.String r5 = "LAST_SELECTED_OBJECT"
                byte[] r8 = r8.getByteArrayExtra(r5)
                r5 = 1
                r6 = 0
                if (r8 != 0) goto L_0x0030
            L_0x002e:
                r4 = r6
                goto L_0x0041
            L_0x0030:
                r4.parseFrom(r8)     // Catch:{ Exception -> 0x0034 }
                goto L_0x0041
            L_0x0034:
                r8 = move-exception
                java.lang.Object[] r4 = new java.lang.Object[r5]
                r4[r2] = r8
                java.lang.String r8 = "safeParser"
                java.lang.String r2 = ""
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r8, r2, r4)
                goto L_0x002e
            L_0x0041:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r2 = "createGalleryConfig, bizScene:"
                r8.append(r2)
                r8.append(r1)
                java.lang.String r2 = ", tabList size:"
                r8.append(r2)
                int r2 = r0.size()
                r8.append(r2)
                java.lang.String r2 = ", extBuff:"
                r8.append(r2)
                r8.append(r3)
                java.lang.String r8 = r8.toString()
                java.lang.String r2 = "Finder.FinderGalleryConfig"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)
                if (r1 == r5) goto L_0x0094
                r8 = 2
                if (r1 == r8) goto L_0x0089
                r8 = 3
                if (r1 == r8) goto L_0x007e
                com.tencent.mm.plugin.finder.gallery.FinderGalleryDefaultConfig r8 = new com.tencent.mm.plugin.finder.gallery.FinderGalleryDefaultConfig
                zf1.a r2 = new zf1.a
                r2.<init>(r0, r1, r3, r4)
                r8.<init>(r2)
                goto L_0x009e
            L_0x007e:
                com.tencent.mm.plugin.finder.gallery.FinderGallerySnsCoverConfig r8 = new com.tencent.mm.plugin.finder.gallery.FinderGallerySnsCoverConfig
                zf1.a r2 = new zf1.a
                r2.<init>(r0, r1, r3, r4)
                r8.<init>(r2)
                goto L_0x009e
            L_0x0089:
                com.tencent.mm.plugin.finder.gallery.FinderGalleryRingToneConfig r8 = new com.tencent.mm.plugin.finder.gallery.FinderGalleryRingToneConfig
                zf1.a r2 = new zf1.a
                r2.<init>(r0, r1, r3, r4)
                r8.<init>(r2)
                goto L_0x009e
            L_0x0094:
                com.tencent.mm.plugin.finder.gallery.FinderGalleryTextStateConfig r8 = new com.tencent.mm.plugin.finder.gallery.FinderGalleryTextStateConfig
                zf1.a r2 = new zf1.a
                r2.<init>(r0, r1, r3, r4)
                r8.<init>(r2)
            L_0x009e:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: zf1.C66792b.C66793a.mo90791a(android.content.Intent):zf1.b");
        }
    }

    /* renamed from: zf1.b$b */
    public enum C66794b {
        GALLERY,
        SEARCH
    }

    public C66792b(C66791a aVar) {
        C87412m.m108594g(aVar, "data");
        this.f191893a = aVar;
    }

    /* renamed from: a */
    public abstract C9500j mo77476a(int i);

    /* renamed from: b */
    public abstract boolean mo77477b();

    /* renamed from: c */
    public abstract boolean mo77478c();

    /* renamed from: d */
    public abstract RecyclerView.C0129l mo77479d(int i);

    /* renamed from: e */
    public abstract RecyclerView.LayoutManager mo77480e(Context context, int i);

    /* renamed from: f */
    public abstract int mo77481f();

    /* renamed from: g */
    public abstract MMFinderFragment mo77482g(Context context, int i, boolean z);

    /* renamed from: h */
    public abstract String mo77483h(Context context, int i);

    /* renamed from: i */
    public abstract void mo77484i(MMActivity mMActivity, int i, int i2, Intent intent, C66794b bVar);

    /* renamed from: j */
    public abstract void mo77485j(MMActivity mMActivity, int i, BaseFinderFeed baseFinderFeed, List<? extends BaseFinderFeed> list, C89349b bVar, boolean z);

    /* renamed from: k */
    public abstract void mo77486k();
}
