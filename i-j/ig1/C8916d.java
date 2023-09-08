package ig1;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Collection;
import java.util.LinkedList;
import o40.C61926c;
import o40.C61937h;
import p749xh.C38596k3;
import pe3.C89349b;
import sx3.C64186f0;
import te3.C50767p11;
import te3.C50900q11;
import te3.C51044r11;
import te3.C51765w03;
import te3.C51905x03;

/* renamed from: ig1.d */
public final class C8916d extends C38596k3 {

    /* renamed from: b1 */
    public static final C8917a f28211b1 = new C8917a((C8480h) null);

    /* renamed from: c1 */
    public static final IAutoDBItem.MAutoDBInfo f28212c1 = C38596k3.initAutoDBInfo(C38596k3.class);

    /* renamed from: ig1.d$a */
    public static final class C8917a {
        public C8917a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C8916d mo9727a(C50767p11 p112) {
            C87412m.m108594g(p112, "finderLiveGift");
            C8916d dVar = new C8916d();
            dVar.field_rewardProductId = p112.f139507d;
            dVar.field_businessType = p112.f139508e;
            dVar.field_thumbnailFileUrl = p112.f139509f;
            dVar.field_previewPagUrl = p112.f139510g;
            dVar.field_animationPagUrl = p112.f139511h;
            dVar.field_thumbnailMd5 = p112.f139512i;
            dVar.field_previewPagMd5 = p112.f139513j;
            dVar.field_animationPagMd5 = p112.f139514n;
            dVar.field_giftType = p112.f139517q;
            dVar.field_flag = p112.f139519s;
            dVar.field_unlockIntimacyLevel = p112.f139518r;
            dVar.field_name = p112.f139515o;
            dVar.field_price = p112.f139516p;
            dVar.field_landscapePagUrl = p112.f139520t;
            dVar.field_landscapePagMd5 = p112.f139521u;
            C89349b bVar = p112.f139522v;
            dVar.field_customInfo = bVar != null ? bVar.f257327a : null;
            dVar.field_globalUnlockLevel = p112.f139523w;
            dVar.field_tagColor = p112.f139524x;
            dVar.field_tagText = p112.f139525y;
            dVar.field_batchConfigLive = p112.f139501D;
            dVar.field_description = p112.f139502E;
            dVar.field_jumpInfo = p112.f139503F;
            dVar.field_needUnlock = p112.f139504G ? 1 : 0;
            dVar.field_disableCombo = p112.f139505H;
            C51905x03 x032 = new C51905x03();
            x032.f144381d.addAll(p112.f139506I);
            dVar.field_multiAnimationList = x032;
            return dVar;
        }
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f28212c1;
        C87412m.m108593f(mAutoDBInfo, "info");
        return mAutoDBInfo;
    }

    /* renamed from: l2 */
    public final LinkedList<C50900q11> mo9721l2() {
        C51044r11 r112 = this.field_batchConfigLive;
        LinkedList<C50900q11> linkedList = r112 != null ? r112.f140660d : null;
        return linkedList == null ? new LinkedList<>() : linkedList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: m2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo9722m2() {
        /*
            r5 = this;
            te3.s11 r0 = new te3.s11
            r0.<init>()
            byte[] r1 = r5.field_customInfo
            java.lang.String r2 = ""
            r3 = 0
            if (r1 != 0) goto L_0x000e
        L_0x000c:
            r0 = r3
            goto L_0x0020
        L_0x000e:
            r0.parseFrom(r1)     // Catch:{ Exception -> 0x0012 }
            goto L_0x0020
        L_0x0012:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r4 = 0
            r1[r4] = r0
            java.lang.String r0 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r2, r1)
            goto L_0x000c
        L_0x0020:
            if (r0 == 0) goto L_0x0024
            java.lang.String r3 = r0.f141266f
        L_0x0024:
            if (r3 != 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r2 = r3
        L_0x0028:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ig1.C8916d.mo9722m2():java.lang.String");
    }

    /* renamed from: n2 */
    public final boolean mo9723n2() {
        return C61926c.m72696u(this.field_flag, 1);
    }

    /* renamed from: o2 */
    public final boolean mo9724o2() {
        return C61926c.m72696u(this.field_flag, 512);
    }

    /* renamed from: p2 */
    public final C50767p11 mo9725p2() {
        C50767p11 p112 = new C50767p11();
        p112.f139507d = this.field_rewardProductId;
        p112.f139508e = this.field_businessType;
        p112.f139509f = this.field_thumbnailFileUrl;
        p112.f139510g = this.field_previewPagUrl;
        p112.f139511h = this.field_animationPagUrl;
        p112.f139512i = this.field_thumbnailMd5;
        p112.f139513j = this.field_previewPagMd5;
        p112.f139514n = this.field_animationPagMd5;
        p112.f139517q = this.field_giftType;
        p112.f139515o = this.field_name;
        p112.f139516p = this.field_price;
        p112.f139519s = this.field_flag;
        p112.f139518r = this.field_unlockIntimacyLevel;
        p112.f139520t = this.field_landscapePagUrl;
        p112.f139521u = this.field_landscapePagMd5;
        byte[] bArr = this.field_customInfo;
        Collection collection = null;
        p112.f139522v = bArr != null ? C61937h.m72710i(bArr) : null;
        p112.f139523w = this.field_globalUnlockLevel;
        p112.f139524x = this.field_tagColor;
        p112.f139525y = this.field_tagText;
        p112.f139501D = this.field_batchConfigLive;
        p112.f139502E = this.field_description;
        p112.f139503F = this.field_jumpInfo;
        boolean z = true;
        if (this.field_needUnlock != 1) {
            z = false;
        }
        p112.f139504G = z;
        p112.f139505H = this.field_disableCombo;
        LinkedList<C51765w03> linkedList = p112.f139506I;
        C51905x03 x032 = this.field_multiAnimationList;
        if (x032 != null) {
            collection = x032.f144381d;
        }
        if (collection == null) {
            collection = C64186f0.f181907d;
        }
        linkedList.addAll(collection);
        return p112;
    }

    public String toString() {
        return "id: " + this.field_rewardProductId + ", name:" + this.field_name + ", url: " + this.field_thumbnailFileUrl + ", isFansGift: " + mo9723n2() + ", previewUrl:" + this.field_previewPagUrl + ", animationUrl:" + this.field_animationPagUrl + ", landUrl:" + this.field_landscapePagUrl;
    }
}
