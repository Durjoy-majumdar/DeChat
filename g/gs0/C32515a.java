package gs0;

import android.content.ContentValues;
import android.os.Parcel;
import com.tencent.p014mm.ipcinvoker.extension.C80891a;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import gy3.C87412m;
import p749xh.C38647r;

/* renamed from: gs0.a */
public final class C32515a extends C38647r {

    /* renamed from: v */
    public static final IAutoDBItem.MAutoDBInfo f86358v = C38647r.initAutoDBInfo(C32515a.class);

    /* renamed from: w */
    public static final C80891a f86359w = new C32516a();

    /* renamed from: gs0.a$a */
    public static final class C32516a implements C80891a {
        /* renamed from: a */
        public Object mo56342a(Parcel parcel) {
            if (parcel == null) {
                return null;
            }
            C32515a aVar = new C32515a();
            aVar.field_appId = parcel.readString();
            aVar.field_versionType = parcel.readInt();
            aVar.field_appVersion = parcel.readInt();
            aVar.field_isDarkMode = parcel.readByte() > 0;
            aVar.field_screenshotFilePath = parcel.readString();
            return aVar;
        }

        /* renamed from: b */
        public boolean mo56343b(Object obj) {
            return obj instanceof C32515a;
        }

        /* renamed from: c */
        public void mo56344c(Object obj, Parcel parcel) {
            C87412m.m108594g(obj, "o");
            C32515a aVar = (C32515a) obj;
            if (parcel != null) {
                parcel.writeString(aVar.field_appId);
                parcel.writeInt(aVar.field_versionType);
                parcel.writeInt(aVar.field_appVersion);
                parcel.writeByte(aVar.field_isDarkMode ? (byte) 1 : 0);
                parcel.writeString(aVar.field_screenshotFilePath);
            }
        }

        public String getName() {
            return C32516a.class.getName();
        }
    }

    public ContentValues convertTo() {
        ContentValues convertTo = super.convertTo();
        if (convertTo.containsKey("isDarkMode")) {
            convertTo.put("isDarkMode", Integer.valueOf(this.field_isDarkMode ? 1 : 0));
        }
        return convertTo;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f86358v;
    }
}
