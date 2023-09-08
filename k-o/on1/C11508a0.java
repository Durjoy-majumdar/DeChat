package on1;

import androidx.recyclerview.widget.C54248l;
import cm1.C0740i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: on1.a0 */
public final class C11508a0 extends C54248l.C54250b {

    /* renamed from: a */
    public final /* synthetic */ List<C11577z<C0740i2>.b> f33813a;

    /* renamed from: b */
    public final /* synthetic */ List<C0740i2> f33814b;

    /* renamed from: c */
    public final /* synthetic */ C11577z<C0740i2> f33815c;

    /* renamed from: d */
    public final /* synthetic */ Map<Integer, Object> f33816d;

    public C11508a0(List<C11577z<C0740i2>.b> list, List<C0740i2> list2, C11577z<C0740i2> zVar, Map<Integer, ? extends Object> map) {
        this.f33813a = list;
        this.f33814b = list2;
        this.f33815c = zVar;
        this.f33816d = map;
    }

    /* renamed from: a */
    public boolean mo11465a(int i, int i2) {
        Set<Integer> keySet;
        Map<Integer, Object> map = this.f33816d;
        boolean z = false;
        if (!(map == null || (keySet = map.keySet()) == null || !keySet.contains(Integer.valueOf(i2)))) {
            z = true;
        }
        boolean z2 = !z;
        Log.m105924i("Finder.DataMerger", "areContentsTheSame oldItemPosition:" + i + " newItemPosition:" + i2 + " isSame:" + z2);
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0085, code lost:
        if (((com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0.f33972d).mo3513o().getLocalId() == r2.mo3513o().getLocalId()) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0092, code lost:
        if (r0.getItemId() == r1.getItemId()) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0095, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0096, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("Finder.DataMerger", "areItemsTheSame oldItemPosition:" + r10 + " newItemPosition:" + r11 + " isSame:" + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00bc, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004d, code lost:
        if (((com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0.f33972d).mo3513o().field_id == r2.mo3513o().field_id) goto L_0x0096;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo11466b(int r10, int r11) {
        /*
            r9 = this;
            java.util.List<on1.z<cm1.i2>$b> r0 = r9.f33813a
            java.lang.Object r0 = r0.get(r10)
            on1.z$b r0 = (on1.C11577z.C11581b) r0
            java.util.List<cm1.i2> r1 = r9.f33814b
            java.lang.Object r1 = r1.get(r11)
            cm1.i2 r1 = (cm1.C0740i2) r1
            on1.z<cm1.i2> r2 = r9.f33815c
            r2.getClass()
            T r2 = r0.f33972d
            boolean r3 = r2 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            r4 = 1
            if (r3 == 0) goto L_0x0088
            boolean r3 = r1 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r3 == 0) goto L_0x0088
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r2
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.mo3513o()
            long r2 = r2.field_id
            r5 = 0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0050
            r2 = r1
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r2
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r2.mo3513o()
            long r7 = r3.field_id
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0050
            T r0 = r0.f33972d
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
            long r0 = r0.field_id
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.mo3513o()
            long r2 = r2.field_id
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x0095
            goto L_0x0096
        L_0x0050:
            T r2 = r0.f33972d
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r2
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.mo3513o()
            long r2 = r2.getLocalId()
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0088
            r2 = r1
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r2
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r2.mo3513o()
            long r7 = r3.getLocalId()
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0088
            T r0 = r0.f33972d
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
            long r0 = r0.getLocalId()
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.mo3513o()
            long r2 = r2.getLocalId()
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x0095
            goto L_0x0096
        L_0x0088:
            long r2 = r0.getItemId()
            long r0 = r1.getItemId()
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0095
            goto L_0x0096
        L_0x0095:
            r4 = 0
        L_0x0096:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "areItemsTheSame oldItemPosition:"
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = " newItemPosition:"
            r0.append(r10)
            r0.append(r11)
            java.lang.String r10 = " isSame:"
            r0.append(r10)
            r0.append(r4)
            java.lang.String r10 = r0.toString()
            java.lang.String r11 = "Finder.DataMerger"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: on1.C11508a0.mo11466b(int, int):boolean");
    }

    /* renamed from: c */
    public Object mo11467c(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("getChangePayload oldItemPosition:");
        sb.append(i);
        sb.append(" newItemPosition:");
        sb.append(i2);
        sb.append(" payload:");
        Map<Integer, Object> map = this.f33816d;
        sb.append(map != null ? map.get(Integer.valueOf(i2)) : null);
        Log.m105924i("Finder.DataMerger", sb.toString());
        Map<Integer, Object> map2 = this.f33816d;
        if (map2 != null) {
            return map2.get(Integer.valueOf(i2));
        }
        return null;
    }

    /* renamed from: d */
    public int mo11468d() {
        Log.m105924i("Finder.DataMerger", "getNewListSize: " + this.f33814b.size());
        return this.f33814b.size();
    }

    /* renamed from: e */
    public int mo11469e() {
        Log.m105924i("Finder.DataMerger", "getOldListSize: " + this.f33813a.size());
        return this.f33813a.size();
    }
}
