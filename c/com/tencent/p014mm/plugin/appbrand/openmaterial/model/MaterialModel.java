package com.tencent.p014mm.plugin.appbrand.openmaterial.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.MimeTypeUtil;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.FileReaderHelper;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel */
public class MaterialModel implements Parcelable {
    public static final Parcelable.Creator<MaterialModel> CREATOR = new C92911a();

    /* renamed from: g */
    public static final Map<String, String> f267603g;

    /* renamed from: d */
    public String f267604d;

    /* renamed from: e */
    public final String f267605e;

    /* renamed from: f */
    public String f267606f;

    /* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel$a */
    public class C92911a implements Parcelable.Creator<MaterialModel> {
        public Object createFromParcel(Parcel parcel) {
            return new MaterialModel(parcel);
        }

        public Object[] newArray(int i) {
            return new MaterialModel[i];
        }
    }

    static {
        HashMap hashMap = new HashMap(32);
        hashMap.put("docm", "application/vnd.ms-word.document.macroEnabled.12");
        hashMap.put("xlsm", "application/vnd.ms-excel.sheet.macroEnabled.12");
        hashMap.put(FileReaderHelper.WPS_EXT, "application/wps-office.wps");
        hashMap.put(FileReaderHelper.ET_EXT, "application/wps-office.et");
        hashMap.put("rar", "application/vnd.rar");
        hashMap.put("7z", "application/x-7z-compressed");
        hashMap.put("psd", "application/x-photoshop");
        hashMap.put("dwg", "application/acad");
        hashMap.put("cdr", "application/x-cdr");
        hashMap.put("dxf", "application/dxf");
        hashMap.put("stp", "application/step");
        hashMap.put("rtf", "application/rtf");
        hashMap.put("ai", "application/postscript");
        hashMap.put(FileReaderHelper.DOC_EXT, "application/msword");
        hashMap.put(FileReaderHelper.DOCX_EXT, "application/vnd.openxmlformats-officedocument.wordprocessingml.document");
        hashMap.put(FileReaderHelper.XLS_EXT, "application/vnd.ms-excel");
        hashMap.put(FileReaderHelper.XLSX_EXT, "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        hashMap.put(FileReaderHelper.PPT_EXT, "application/vnd.ms-powerpoint");
        hashMap.put(FileReaderHelper.PPTX_EXT, "application/vnd.openxmlformats-officedocument.presentationml.presentation");
        hashMap.put(FileReaderHelper.TXT_EXT, "text/plain");
        hashMap.put("csv", "text/csv");
        hashMap.put(FileReaderHelper.PDF_EXT, "application/pdf");
        hashMap.put("zip", "application/zip");
        f267603g = Collections.unmodifiableMap(hashMap);
    }

    public MaterialModel(String str, String str2, String str3) {
        this.f267604d = str;
        this.f267605e = str2;
        this.f267606f = str3;
    }

    /* renamed from: a */
    public static MaterialModel m117224a(String str) {
        Log.m105918d("MicroMsg.AppBrand.MaterialModel", "fromLocalPath, materialLocalPath: " + str);
        String o = C86013q1.m106454o(str);
        Log.m105918d("MicroMsg.AppBrand.MaterialModel", "fromLocalPath, materialExt: " + o);
        String c = m117226c(o);
        if (c == null) {
            c = MimeTypeUtil.getMimeTypeByFileExt(o);
        }
        if (c == null) {
            c = "";
        }
        Log.m105918d("MicroMsg.AppBrand.MaterialModel", "fromLocalPath, mimeType: " + c);
        return new MaterialModel(c, o, str);
    }

    /* renamed from: b */
    public static MaterialModel m117225b(String str, String str2) {
        Log.m105919d("MicroMsg.AppBrand.MaterialModel", "fromLocalPath, materialLocalPath: %s, materialExt: %s", str, str2);
        if (Util.isNullOrNil(str2)) {
            return m117224a(str);
        }
        String c = m117226c(str2);
        if (c == null) {
            c = MimeTypeUtil.getMimeTypeByFileExt(str2);
        }
        if (c == null) {
            c = "";
        }
        Log.m105918d("MicroMsg.AppBrand.MaterialModel", "fromLocalPath, mimeType: " + c);
        return new MaterialModel(c, str2, str);
    }

    /* renamed from: c */
    public static String m117226c(String str) {
        Log.m105918d("MicroMsg.AppBrand.MaterialModel", "getMimeTypeByFileExtHardCode, fileExt: " + str);
        if (Util.isNullOrNil(str)) {
            return null;
        }
        return f267603g.get(str.toLowerCase());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MaterialModel materialModel = (MaterialModel) obj;
        return this.f267604d.equals(materialModel.f267604d) && this.f267605e.equals(materialModel.f267605e) && this.f267606f.equals(materialModel.f267606f);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f267604d, this.f267605e, this.f267606f});
    }

    public String toString() {
        return "MaterialModel{mimeType='" + this.f267604d + '\'' + ", materialExtension='" + this.f267605e + '\'' + ", materialPath='" + this.f267606f + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f267604d);
        parcel.writeString(this.f267605e);
        parcel.writeString(this.f267606f);
    }

    public MaterialModel(Parcel parcel) {
        this.f267604d = Util.nullAs(parcel.readString(), "");
        this.f267605e = Util.nullAs(parcel.readString(), "");
        this.f267606f = Util.nullAs(parcel.readString(), "");
    }
}
