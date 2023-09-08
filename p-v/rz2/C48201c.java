package rz2;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import eb0.C31543z5;
import gy3.C87412m;
import p773yy.C66710j;
import uz2.C52678e0;
import uz2.C52713s;
import wz2.C53270a;

/* renamed from: rz2.c */
public final class C48201c extends C53270a implements C66710j {

    /* renamed from: B1 */
    public static final IAutoDBItem.MAutoDBInfo f129176B1 = C53270a.initAutoDBInfo(C53270a.class);

    /* renamed from: C1 */
    public static final int f129177C1 = 2;

    /* renamed from: A1 */
    public int f129178A1;

    /* renamed from: x1 */
    public C52713s f129179x1;

    /* renamed from: y1 */
    public int f129180y1;

    /* renamed from: z1 */
    public C52678e0 f129181z1;

    /* renamed from: B0 */
    public boolean mo72933B0() {
        Long l = this.field_option;
        return ((l == null ? 0 : l.longValue()) & 1) != 0;
    }

    /* renamed from: H0 */
    public String mo72934H0() {
        return this.field_backgroundId;
    }

    /* renamed from: H1 */
    public String mo72935H1() {
        return this.field_PoiName;
    }

    /* renamed from: N1 */
    public String mo72936N1() {
        return this.field_MediaUrl;
    }

    /* renamed from: S1 */
    public String mo72937S1() {
        return this.field_MediaThumbUrl;
    }

    /* renamed from: f1 */
    public C52678e0 mo72938f1(boolean z) {
        if (!z) {
            byte[] bArr = this.field_TopicInfo;
            boolean z2 = false;
            if (bArr != null && this.f129178A1 == bArr.hashCode()) {
                z2 = true;
            }
            if (z2) {
                C52678e0 e0Var = this.f129181z1;
                return e0Var == null ? new C52678e0() : e0Var;
            }
        }
        C52678e0 e0Var2 = new C52678e0();
        byte[] bArr2 = this.field_TopicInfo;
        if (bArr2 != null) {
            e0Var2.parseFrom(bArr2);
            this.f129178A1 = bArr2.hashCode();
        }
        this.f129181z1 = e0Var2;
        return e0Var2;
    }

    public int getCreateTime() {
        return this.field_CreateTime;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f129176B1;
        C87412m.m108593f(mAutoDBInfo, "_dbInfo");
        return mAutoDBInfo;
    }

    public String getDescription() {
        return this.field_Description;
    }

    public int getMediaType() {
        return this.field_MediaType;
    }

    /* renamed from: h1 */
    public String mo72942h1() {
        return this.field_StatusID;
    }

    /* renamed from: l2 */
    public final C48201c mo72943l2() {
        C48201c cVar = new C48201c();
        cVar.field_UserName = this.field_UserName;
        cVar.field_StatusID = this.field_StatusID;
        cVar.field_TopicId = this.field_TopicId;
        cVar.field_SourceID = this.field_SourceID;
        cVar.field_TopicInfo = this.field_TopicInfo;
        cVar.field_ClusterShowInfo = this.field_ClusterShowInfo;
        cVar.field_IconID = this.field_IconID;
        cVar.field_Description = this.field_Description;
        cVar.field_MediaType = this.field_MediaType;
        cVar.field_MediaUrl = this.field_MediaUrl;
        cVar.field_MediaAESKey = this.field_MediaAESKey;
        cVar.field_MediaThumbUrl = this.field_MediaThumbUrl;
        cVar.field_MediaThumbAESKey = this.field_MediaThumbAESKey;
        cVar.field_PoiID = this.field_PoiID;
        cVar.field_PoiName = this.field_PoiName;
        cVar.field_Longitude = this.field_Longitude;
        cVar.field_Latitude = this.field_Latitude;
        cVar.field_Visibility = this.field_Visibility;
        cVar.field_CreateTime = this.field_CreateTime;
        cVar.field_ExpireTime = this.field_ExpireTime;
        cVar.field_LikeCount = this.field_LikeCount;
        cVar.field_state = this.field_state;
        cVar.field_backgroundId = this.field_backgroundId;
        cVar.field_option = this.field_option;
        cVar.field_mediaWidth = this.field_mediaWidth;
        cVar.field_mediaHeight = this.field_mediaHeight;
        cVar.field_visibilityInfo = this.field_visibilityInfo;
        cVar.field_referenceUserName = this.field_referenceUserName;
        cVar.field_referenceTextStatusId = this.field_referenceTextStatusId;
        cVar.field_referenceCount = this.field_referenceCount;
        cVar.field_sceneType = this.field_sceneType;
        cVar.field_duplicateUserName = this.field_duplicateUserName;
        cVar.field_duplicateTextStatusId = this.field_duplicateTextStatusId;
        cVar.field_EmojiInfo = this.field_EmojiInfo;
        return cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if ((r1 == null || z04.C112551y.m153811k(r1)) != false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        if ((r2 == null || z04.C112551y.m153811k(r2)) != false) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* renamed from: m2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo72944m2(java.lang.String r4, uz2.C52718u r5, boolean r6) {
        /*
            r3 = this;
            java.lang.String r0 = "newStatusId"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "newInfo"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = r3.field_StatusID
            boolean r4 = android.text.TextUtils.equals(r0, r4)
            if (r4 != 0) goto L_0x0014
            r4 = 7
            return r4
        L_0x0014:
            r4 = 1
            r0 = 0
            if (r6 == 0) goto L_0x0028
            java.lang.String r1 = r3.field_MediaThumbUrl
            if (r1 == 0) goto L_0x0025
            boolean r1 = z04.C112551y.m153811k(r1)
            if (r1 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r1 = 0
            goto L_0x0026
        L_0x0025:
            r1 = 1
        L_0x0026:
            if (r1 == 0) goto L_0x002a
        L_0x0028:
            if (r6 != 0) goto L_0x002c
        L_0x002a:
            r1 = 1
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            if (r1 == 0) goto L_0x003b
            java.lang.String r1 = r3.field_MediaThumbUrl
            java.lang.String r2 = r5.f147241j
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x003b
            r1 = 1
            goto L_0x003c
        L_0x003b:
            r1 = 0
        L_0x003c:
            if (r6 == 0) goto L_0x004e
            java.lang.String r2 = r3.field_MediaUrl
            if (r2 == 0) goto L_0x004b
            boolean r2 = z04.C112551y.m153811k(r2)
            if (r2 == 0) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            r2 = 0
            goto L_0x004c
        L_0x004b:
            r2 = 1
        L_0x004c:
            if (r2 == 0) goto L_0x0052
        L_0x004e:
            if (r6 != 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r4 = 0
        L_0x0052:
            if (r4 == 0) goto L_0x0062
            java.lang.String r4 = r3.field_MediaUrl
            java.lang.String r5 = r5.f147239h
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 != 0) goto L_0x0062
            r4 = r1 | 2
            r1 = r4 | 4
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rz2.C48201c.mo72944m2(java.lang.String, uz2.u, boolean):int");
    }

    /* renamed from: n2 */
    public final C52713s mo72945n2() {
        byte[] bArr = this.field_EmojiInfo;
        boolean z = false;
        if (bArr != null && this.f129180y1 == bArr.hashCode()) {
            z = true;
        }
        if (z) {
            C52713s sVar = this.f129179x1;
            return sVar == null ? new C52713s() : sVar;
        }
        C52713s sVar2 = new C52713s();
        byte[] bArr2 = this.field_EmojiInfo;
        if (bArr2 != null) {
            sVar2.parseFrom(bArr2);
            this.f129180y1 = bArr2.hashCode();
        }
        this.f129179x1 = sVar2;
        return sVar2;
    }

    /* renamed from: o2 */
    public final boolean mo72946o2() {
        return this.field_ExpireTime <= C31543z5.m39455e();
    }

    /* renamed from: p2 */
    public final boolean mo72947p2() {
        return this.field_state == f129177C1;
    }

    public String toString() {
        return "TSItem() statusId:" + this.field_StatusID + " ,TopicId:" + this.field_TopicId + ",sourceId:" + this.field_SourceID + ",IconID:" + this.field_IconID + ",MediaType:" + this.field_MediaType + ",mediaUrl:" + this.field_MediaUrl + ",thumb:" + this.field_MediaThumbUrl + "state:" + this.field_state + ",bid:" + this.field_backgroundId + ",likeCont:" + this.field_LikeCount + ",mwidth" + this.field_mediaWidth + ",mheight" + this.field_mediaHeight + ",etime:" + this.field_ExpireTime;
    }

    /* renamed from: x */
    public String mo72949x() {
        return this.field_IconID;
    }
}
