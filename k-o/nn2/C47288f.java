package nn2;

import android.content.ContentValues;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.RegionCodeDecoder;
import p749xh.C53336f8;
import te3.C50491n34;
import te3.a94;

/* renamed from: nn2.f */
public class C47288f extends C53336f8 {

    /* renamed from: y0 */
    public static IAutoDBItem.MAutoDBInfo f126947y0 = C53336f8.initAutoDBInfo(C47288f.class);

    /* renamed from: p0 */
    public int f126948p0 = -1;

    /* renamed from: x0 */
    public int f126949x0;

    public C47288f() {
        this.field_insertBatch = 2;
    }

    public ContentValues convertTo() {
        int i;
        ContentValues contentValues = new ContentValues();
        if ((this.f126948p0 & 2) != 0) {
            contentValues.put("username", this.field_username);
        }
        if ((this.f126948p0 & 4) != 0) {
            contentValues.put("nickname", this.field_nickname);
        }
        if ((this.f126948p0 & 8) != 0) {
            contentValues.put("province", getProvince());
        }
        if ((this.f126948p0 & 16) != 0) {
            contentValues.put("city", getCity());
        }
        if ((this.f126948p0 & 32) != 0) {
            contentValues.put("signature", this.field_signature);
        }
        if ((this.f126948p0 & 64) != 0) {
            contentValues.put("distance", this.field_distance);
        }
        if ((this.f126948p0 & 128) != 0) {
            contentValues.put("sex", Integer.valueOf(this.field_sex));
        }
        if ((this.f126948p0 & 256) != 0) {
            contentValues.put("imgstatus", Integer.valueOf(this.field_imgstatus));
        }
        if ((this.f126948p0 & 512) != 0) {
            contentValues.put("hasHDImg", Integer.valueOf(this.field_hasHDImg));
        }
        if ((this.f126948p0 & 1024) != 0) {
            contentValues.put("insertBatch", Integer.valueOf(this.field_insertBatch));
        }
        if ((this.f126948p0 & 2048) != 0) {
            contentValues.put("reserved1", Integer.valueOf(this.field_reserved1));
        }
        if ((this.f126948p0 & 4096) != 0) {
            contentValues.put("reserved2", Integer.valueOf(this.field_reserved2));
        }
        if ((this.f126948p0 & 8192) != 0) {
            contentValues.put("reserved3", this.field_reserved3);
        }
        if ((this.f126948p0 & 16384) != 0) {
            try {
                i = Integer.valueOf(this.field_reserved4).intValue();
            } catch (Throwable unused) {
                i = 0;
            }
            contentValues.put("reserved4", Integer.valueOf(i));
        }
        if ((this.f126948p0 & 32768) != 0) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if ((this.f126948p0 & 65536) != 0) {
            contentValues.put("lvbuffer", this.field_lvbuffer);
        }
        if ((this.f126948p0 & 131072) != 0) {
            contentValues.put("regionCode", this.field_regionCode);
        }
        if ((this.f126948p0 & 262144) != 0) {
            contentValues.put("snsFlag", Integer.valueOf(this.field_snsFlag));
        }
        if ((this.f126948p0 & 524288) != 0) {
            contentValues.put("sns_bgurl", this.field_sns_bgurl);
        }
        return contentValues;
    }

    public String getCity() {
        if (!Util.isNullOrNil(this.field_regionCode)) {
            String[] split = this.field_regionCode.split("_");
            if (split.length > 0) {
                if (split.length > 2) {
                    this.field_city = RegionCodeDecoder.m124563k().mo135573h(split[0], split[1], split[2]);
                } else if (split.length == 2) {
                    this.field_city = RegionCodeDecoder.m124563k().mo135575j(split[0], split[1]);
                } else {
                    this.field_city = "";
                }
            }
        }
        return this.field_city;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f126947y0;
    }

    public String getProvince() {
        if (!Util.isNullOrNil(this.field_regionCode)) {
            String[] split = this.field_regionCode.split("_");
            if (split.length > 0) {
                if (split.length <= 2 || !split[0].equalsIgnoreCase("cn")) {
                    this.field_province = RegionCodeDecoder.m124563k().mo135574i(split[0]);
                } else {
                    this.field_province = RegionCodeDecoder.m124563k().mo135575j(split[0], split[1]);
                }
            }
        }
        return this.field_province;
    }

    public C47288f(C50491n34 n342) {
        this.field_username = n342.f138376d;
        this.field_nickname = n342.f138377e;
        this.field_signature = n342.f138380h;
        this.field_distance = n342.f138381i;
        this.field_reserved4 = String.valueOf(n342.f138386q);
        this.field_sex = n342.f138382j;
        this.field_imgstatus = n342.f138383n;
        this.field_hasHDImg = n342.f138384o;
        this.field_reserved1 = n342.f138390u;
        this.field_reserved3 = n342.f138391v;
        this.field_insertBatch = 2;
        a94 a94 = n342.f138394y;
        if (a94 != null) {
            this.field_snsFlag = a94.f130392d;
            this.field_sns_bgurl = a94.f130393e;
        }
        String str = n342.f138378f;
        this.field_province = str;
        String str2 = n342.f138379g;
        this.field_city = str2;
        this.field_regionCode = RegionCodeDecoder.m124564q(n342.f138395z, str, str2);
    }
}
