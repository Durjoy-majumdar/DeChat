package og2;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C102669u7;

/* renamed from: og2.n */
public class C100344n extends C102669u7 implements C100338g {

    /* renamed from: W */
    public static IAutoDBItem.MAutoDBInfo f293919W = C102669u7.initAutoDBInfo(C100344n.class);

    public boolean equals(Object obj) {
        return (obj instanceof C100344n) && this.field_localId == ((C100344n) obj).field_localId;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f293919W;
    }

    public int getKey() {
        return this.field_localId;
    }

    public String toString() {
        return "localid[" + this.field_localId + "]\n" + "recordId[" + this.field_recordLocalId + "]\n" + "mediaId[" + this.field_mediaId + "]\n" + "dataId[" + this.field_dataId + "]\n" + "path[" + this.field_path + "]\n" + "cdnurl[" + this.field_cdnUrl + "]\n" + "cdnkey[" + this.field_cdnKey + "]\n" + "type[" + this.field_type + "]\n" + "errCode[" + this.field_errCode + "]\n" + "fileType[" + this.field_fileType + "]\n" + "isThumb[" + this.field_isThumb + "]\n" + "status[" + this.field_status + "]\n" + "totalLen[" + this.field_totalLen + "]\n" + "offset[" + this.field_offset + "]\n" + "toUser[" + this.field_toUser + "]\n";
    }
}
