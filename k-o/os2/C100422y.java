package os2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.IOException;
import p749xh.C102656m8;
import pr2.C100845d;
import vr2.C102236a0;

/* renamed from: os2.y */
public class C100422y extends C102656m8 implements C100845d {

    /* renamed from: Q */
    public static IAutoDBItem.MAutoDBInfo f294193Q = C102656m8.initAutoDBInfo(C100422y.class);

    /* renamed from: N */
    public String f294194N = "";

    /* renamed from: P */
    public String f294195P;

    /* renamed from: O0 */
    public Long mo139898O0() {
        SnsMethodCalculate.markStartTimeMs("getLastFinderCheckTimeMs", "com.tencent.mm.plugin.sns.storage.SnsCover");
        Long valueOf = Long.valueOf(this.field_finderCheckTime);
        SnsMethodCalculate.markEndTimeMs("getLastFinderCheckTimeMs", "com.tencent.mm.plugin.sns.storage.SnsCover");
        return valueOf;
    }

    /* renamed from: b */
    public String mo139899b() {
        SnsMethodCalculate.markStartTimeMs("getThumbPath", "com.tencent.mm.plugin.sns.storage.SnsCover");
        if (C86013q1.m106450k(this.field_localThumb)) {
            String str = this.field_localThumb;
            SnsMethodCalculate.markEndTimeMs("getThumbPath", "com.tencent.mm.plugin.sns.storage.SnsCover");
            return str;
        }
        String str2 = this.field_thumbUrl;
        SnsMethodCalculate.markEndTimeMs("getThumbPath", "com.tencent.mm.plugin.sns.storage.SnsCover");
        return str2;
    }

    /* renamed from: c */
    public String mo139900c() {
        SnsMethodCalculate.markStartTimeMs("getImagePath", "com.tencent.mm.plugin.sns.storage.SnsCover");
        int i = this.field_type;
        if (i == 1 || i == 6 || i == 0) {
            if (C86013q1.m106450k(this.field_localImage)) {
                String str = this.field_localImage;
                SnsMethodCalculate.markEndTimeMs("getImagePath", "com.tencent.mm.plugin.sns.storage.SnsCover");
                return str;
            } else if (!TextUtils.isEmpty(this.field_imageBgUrl)) {
                String str2 = this.field_imageBgUrl;
                SnsMethodCalculate.markEndTimeMs("getImagePath", "com.tencent.mm.plugin.sns.storage.SnsCover");
                return str2;
            }
        }
        String b = mo139899b();
        SnsMethodCalculate.markEndTimeMs("getImagePath", "com.tencent.mm.plugin.sns.storage.SnsCover");
        return b;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        SnsMethodCalculate.markStartTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsCover");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f294193Q;
        SnsMethodCalculate.markEndTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsCover");
        return mAutoDBInfo;
    }

    public FinderObject getFinderObject() {
        SnsMethodCalculate.markStartTimeMs("getFinderObject", "com.tencent.mm.plugin.sns.storage.SnsCover");
        FinderObject finderObject = new FinderObject();
        byte[] bArr = this.field_finderObject;
        if (bArr != null) {
            try {
                finderObject.parseFrom(bArr);
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.SnsCover", e, "FinderObject parseFrom error", new Object[0]);
            }
        }
        SnsMethodCalculate.markEndTimeMs("getFinderObject", "com.tencent.mm.plugin.sns.storage.SnsCover");
        return finderObject;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.storage.SnsCover");
        int i = this.field_type;
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.storage.SnsCover");
        return i;
    }

    public String getUserName() {
        SnsMethodCalculate.markStartTimeMs("getUserName", "com.tencent.mm.plugin.sns.storage.SnsCover");
        String str = this.field_userName;
        SnsMethodCalculate.markEndTimeMs("getUserName", "com.tencent.mm.plugin.sns.storage.SnsCover");
        return str;
    }

    public String getVideoPath() {
        SnsMethodCalculate.markStartTimeMs("getVideoPath", "com.tencent.mm.plugin.sns.storage.SnsCover");
        if (C86013q1.m106450k(this.field_localVideo)) {
            String str = this.field_localVideo;
            SnsMethodCalculate.markEndTimeMs("getVideoPath", "com.tencent.mm.plugin.sns.storage.SnsCover");
            return str;
        }
        String str2 = this.field_videoBgUrl;
        SnsMethodCalculate.markEndTimeMs("getVideoPath", "com.tencent.mm.plugin.sns.storage.SnsCover");
        return str2;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.storage.SnsCover");
        FinderObject finderObject = new FinderObject();
        byte[] bArr = this.field_finderObject;
        if (bArr != null) {
            try {
                finderObject.parseFrom(bArr);
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.SnsCover", e, "FinderObject parseFrom error", new Object[0]);
            }
        }
        String str = "SnsCover{field_userName='" + this.field_userName + '\'' + ", field_type=" + this.field_type + ", field_snsBgId=" + C102236a0.m134765q0(this.field_snsBgId) + ", field_thumbUrl='" + this.field_thumbUrl + '\'' + ", field_imageBgUrl='" + this.field_imageBgUrl + '\'' + ", field_videoBgUrl='" + this.field_videoBgUrl + '\'' + ", field_localThumb='" + this.field_localThumb + '\'' + ", field_localImage='" + this.field_localImage + '\'' + ", field_localVideo='" + this.field_localVideo + '\'' + ", field_finderObject=" + C102236a0.m134765q0(finderObject.f164794id) + ", field_finderCheckTime=" + this.field_finderCheckTime + ", field_success=" + this.field_success + ", systemRowid=" + this.systemRowid + ", reportExtraInfo=" + this.f294194N + '}';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.storage.SnsCover");
        return str;
    }

    /* renamed from: u */
    public Long mo139906u() {
        SnsMethodCalculate.markStartTimeMs("getSnsObjId", "com.tencent.mm.plugin.sns.storage.SnsCover");
        Long valueOf = Long.valueOf(this.field_snsBgId);
        SnsMethodCalculate.markEndTimeMs("getSnsObjId", "com.tencent.mm.plugin.sns.storage.SnsCover");
        return valueOf;
    }
}
