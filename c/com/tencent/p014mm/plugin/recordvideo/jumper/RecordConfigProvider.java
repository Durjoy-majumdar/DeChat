package com.tencent.p014mm.plugin.recordvideo.jumper;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.p014mm.component.api.jumper.UICustomParam;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.xlabeffect.XEffectConfig;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider */
public class RecordConfigProvider implements Parcelable {
    public static final Parcelable.Creator<RecordConfigProvider> CREATOR = new C94405a();

    /* renamed from: A */
    public String f272900A;

    /* renamed from: B */
    public String f272901B;

    /* renamed from: C */
    public String f272902C;

    /* renamed from: D */
    public String f272903D;

    /* renamed from: E */
    public String f272904E;

    /* renamed from: F */
    public int f272905F;

    /* renamed from: G */
    public ArrayList<String> f272906G;

    /* renamed from: H */
    public ArrayList<String> f272907H;

    /* renamed from: I */
    public VideoCaptureReportInfo f272908I;

    /* renamed from: J */
    public long f272909J;

    /* renamed from: K */
    public boolean f272910K;

    /* renamed from: L */
    public boolean f272911L;

    /* renamed from: M */
    public Bundle f272912M;

    /* renamed from: N */
    public boolean f272913N;

    /* renamed from: P */
    public HashMap f272914P;

    /* renamed from: Q */
    public XEffectConfig f272915Q;

    /* renamed from: R */
    public String f272916R;

    /* renamed from: S */
    public boolean f272917S;

    /* renamed from: T */
    public boolean f272918T;

    /* renamed from: d */
    public int f272919d = 1;

    /* renamed from: e */
    public Boolean f272920e;

    /* renamed from: f */
    public int f272921f;

    /* renamed from: g */
    public int f272922g;

    /* renamed from: h */
    public int f272923h;

    /* renamed from: i */
    public Boolean f272924i;

    /* renamed from: j */
    public Boolean f272925j;

    /* renamed from: n */
    public VideoTransPara f272926n;

    /* renamed from: o */
    public UICustomParam f272927o;

    /* renamed from: p */
    public C96814a.C96817e f272928p;

    /* renamed from: q */
    public int f272929q;

    /* renamed from: r */
    public Boolean f272930r;

    /* renamed from: s */
    public Boolean f272931s;

    /* renamed from: t */
    public Boolean f272932t;

    /* renamed from: u */
    public Boolean f272933u;

    /* renamed from: v */
    public Boolean f272934v;

    /* renamed from: w */
    public int f272935w;

    /* renamed from: x */
    public int f272936x;

    /* renamed from: y */
    public boolean f272937y;

    /* renamed from: z */
    public boolean f272938z;

    /* renamed from: com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider$a */
    public class C94405a implements Parcelable.Creator<RecordConfigProvider> {
        public Object createFromParcel(Parcel parcel) {
            return new RecordConfigProvider(parcel);
        }

        public Object[] newArray(int i) {
            return new RecordConfigProvider[i];
        }
    }

    public RecordConfigProvider() {
        Boolean bool = Boolean.FALSE;
        this.f272920e = bool;
        this.f272921f = 1080;
        this.f272922g = 2;
        this.f272923h = 1;
        this.f272924i = bool;
        this.f272925j = bool;
        ((HashMap) new UICustomParam().f266575h).put("plugin_filter", Boolean.TRUE);
        UICustomParam.C92617b bVar = new UICustomParam.C92617b();
        bVar.mo126651e(true);
        bVar.mo126653g(true);
        bVar.mo126649c(true);
        this.f272927o = bVar.f266587a;
        this.f272928p = C96814a.C96817e.DEFAULT;
        this.f272929q = 1;
        this.f272930r = bool;
        Boolean bool2 = Boolean.TRUE;
        this.f272931s = bool2;
        this.f272932t = bool2;
        this.f272933u = bool2;
        this.f272934v = bool2;
        this.f272935w = 10000;
        this.f272936x = -1;
        this.f272937y = false;
        this.f272938z = true;
        this.f272909J = 259200000;
        this.f272910K = true;
        this.f272911L = false;
        this.f272912M = new Bundle();
        this.f272913N = false;
        this.f272914P = new HashMap();
        this.f272915Q = new XEffectConfig();
        this.f272916R = "";
        this.f272917S = false;
        this.f272918T = false;
    }

    /* renamed from: b */
    public static RecordConfigProvider m119432b(String str, String str2) {
        RecordConfigProvider recordConfigProvider = new RecordConfigProvider();
        recordConfigProvider.f272903D = C86013q1.m106448i(str, false);
        recordConfigProvider.f272904E = C86013q1.m106448i(str2, true);
        recordConfigProvider.f272937y = true;
        recordConfigProvider.f272929q = 3;
        return recordConfigProvider;
    }

    /* renamed from: c */
    public static RecordConfigProvider m119433c(String str, String str2, String str3) {
        RecordConfigProvider recordConfigProvider = new RecordConfigProvider();
        recordConfigProvider.f272900A = C86013q1.m106448i(str, false);
        recordConfigProvider.f272901B = C86013q1.m106448i(str2, true);
        recordConfigProvider.f272902C = str3;
        if (!TextUtils.isEmpty(str3)) {
            recordConfigProvider.f272902C = C86013q1.m106448i(str3, true);
        }
        recordConfigProvider.f272937y = true;
        recordConfigProvider.f272929q = 4;
        return recordConfigProvider;
    }

    /* renamed from: d */
    public static RecordConfigProvider m119434d(String str, String str2) {
        RecordConfigProvider recordConfigProvider = new RecordConfigProvider();
        recordConfigProvider.f272901B = C86013q1.m106448i(str, true);
        recordConfigProvider.f272902C = str2;
        if (!TextUtils.isEmpty(str2)) {
            recordConfigProvider.f272902C = C86013q1.m106448i(str2, true);
        }
        recordConfigProvider.f272937y = true;
        recordConfigProvider.f272929q = 4;
        return recordConfigProvider;
    }

    /* renamed from: e */
    public static RecordConfigProvider m119435e(VideoTransPara videoTransPara, int i, int i2) {
        RecordConfigProvider recordConfigProvider = new RecordConfigProvider();
        recordConfigProvider.f272926n = videoTransPara;
        Boolean bool = Boolean.TRUE;
        recordConfigProvider.f272931s = bool;
        recordConfigProvider.f272933u = bool;
        recordConfigProvider.f272934v = Boolean.FALSE;
        recordConfigProvider.f272935w = i;
        recordConfigProvider.f272905F = i2;
        return recordConfigProvider;
    }

    /* renamed from: f */
    public static RecordConfigProvider m119436f(String str, String str2, VideoTransPara videoTransPara, int i, int i2) {
        RecordConfigProvider recordConfigProvider = new RecordConfigProvider();
        recordConfigProvider.f272926n = videoTransPara;
        Boolean bool = Boolean.TRUE;
        recordConfigProvider.f272931s = bool;
        recordConfigProvider.f272933u = bool;
        recordConfigProvider.f272934v = Boolean.FALSE;
        recordConfigProvider.f272935w = i;
        recordConfigProvider.f272901B = C86013q1.m106448i(str, true);
        recordConfigProvider.f272902C = str2;
        if (!TextUtils.isEmpty(str2)) {
            recordConfigProvider.f272902C = C86013q1.m106448i(str2, true);
        }
        recordConfigProvider.f272905F = i2;
        return recordConfigProvider;
    }

    /* renamed from: a */
    public void mo129804a(int i, String str) {
        this.f272914P.put(Integer.valueOf(i), str);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "RecordConfigProvider{remuxType=" + this.f272919d + ", useCPUCrop=" + this.f272920e + ", resolutionLimit=" + this.f272921f + ", recordType=" + this.f272922g + ", recordLevel=" + this.f272923h + ", useCameraApi2=" + this.f272924i + ", useImageStream=" + this.f272925j + ", videoParam=" + this.f272926n + ", uiParam=" + this.f272927o + ", outputType=" + this.f272929q + ", previewForceFullScreen=" + this.f272930r + ", enablePicture=" + this.f272931s + ", enableVideo=" + this.f272932t + ", forceForegroundMix=" + this.f272933u + ", enableAlbum=" + this.f272934v + ", maxRecordTimeMs=" + this.f272935w + ", saveSourceMedia=" + this.f272937y + ", savaToSysAlbumIfMediaEdited=" + this.f272938z + ", inputVideoPath='" + this.f272900A + '\'' + ", outputVideoPath='" + this.f272901B + '\'' + ", thumbPath='" + this.f272902C + '\'' + ", inputPhotoPath='" + this.f272903D + '\'' + ", outputPhotoPath='" + this.f272904E + '\'' + ", scene=" + this.f272905F + ", images=" + this.f272906G + ", videos=" + this.f272907H + ", reportInfo=" + this.f272908I + ", expiredTimeMsIfMixInBackground=" + this.f272909J + ", supportCaptureLandscape=" + this.f272910K + ", forcePortrait=" + this.f272911L + ", autoAdjustFoldingScreen=" + this.f272913N + ", router=" + this.f272914P + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f272919d);
        parcel.writeValue(this.f272920e);
        parcel.writeInt(this.f272921f);
        parcel.writeInt(this.f272922g);
        parcel.writeInt(this.f272923h);
        parcel.writeValue(this.f272924i);
        parcel.writeValue(this.f272925j);
        parcel.writeParcelable(this.f272926n, i);
        parcel.writeParcelable(this.f272927o, i);
        C96814a.C96817e eVar = this.f272928p;
        parcel.writeInt(eVar == null ? -1 : eVar.ordinal());
        parcel.writeInt(this.f272929q);
        parcel.writeValue(this.f272930r);
        parcel.writeValue(this.f272931s);
        parcel.writeValue(this.f272932t);
        parcel.writeValue(this.f272933u);
        parcel.writeValue(this.f272934v);
        parcel.writeInt(this.f272935w);
        parcel.writeByte(this.f272937y ? (byte) 1 : 0);
        parcel.writeByte(this.f272938z ? (byte) 1 : 0);
        parcel.writeString(this.f272900A);
        parcel.writeString(this.f272901B);
        parcel.writeString(this.f272902C);
        parcel.writeString(this.f272903D);
        parcel.writeString(this.f272904E);
        parcel.writeInt(this.f272905F);
        parcel.writeStringList(this.f272906G);
        parcel.writeStringList(this.f272907H);
        parcel.writeParcelable(this.f272908I, i);
        parcel.writeLong(this.f272909J);
        parcel.writeByte(this.f272910K ? (byte) 1 : 0);
        parcel.writeByte(this.f272911L ? (byte) 1 : 0);
        parcel.writeBundle(this.f272912M);
        parcel.writeByte(this.f272913N ? (byte) 1 : 0);
        parcel.writeSerializable(this.f272914P);
        parcel.writeParcelable(this.f272915Q, i);
        parcel.writeInt(this.f272936x);
        parcel.writeString(this.f272916R);
        parcel.writeByte(this.f272917S ? (byte) 1 : 0);
        parcel.writeInt(this.f272918T ? 1 : 0);
    }

    public RecordConfigProvider(Parcel parcel) {
        C96814a.C96817e eVar;
        Class<Boolean> cls = Boolean.class;
        boolean z = true;
        Boolean bool = Boolean.FALSE;
        this.f272920e = bool;
        this.f272921f = 1080;
        this.f272922g = 2;
        this.f272923h = 1;
        this.f272924i = bool;
        this.f272925j = bool;
        ((HashMap) new UICustomParam().f266575h).put("plugin_filter", Boolean.TRUE);
        UICustomParam.C92617b bVar = new UICustomParam.C92617b();
        bVar.mo126651e(true);
        bVar.mo126653g(true);
        bVar.mo126649c(true);
        this.f272927o = bVar.f266587a;
        this.f272928p = C96814a.C96817e.DEFAULT;
        this.f272929q = 1;
        this.f272930r = bool;
        Boolean bool2 = Boolean.TRUE;
        this.f272931s = bool2;
        this.f272932t = bool2;
        this.f272933u = bool2;
        this.f272934v = bool2;
        this.f272935w = 10000;
        this.f272936x = -1;
        this.f272937y = false;
        this.f272938z = true;
        this.f272909J = 259200000;
        this.f272910K = true;
        this.f272911L = false;
        this.f272912M = new Bundle();
        this.f272913N = false;
        this.f272914P = new HashMap();
        this.f272915Q = new XEffectConfig();
        this.f272916R = "";
        this.f272917S = false;
        this.f272918T = false;
        this.f272919d = parcel.readInt();
        this.f272920e = (Boolean) parcel.readValue(cls.getClassLoader());
        this.f272921f = parcel.readInt();
        this.f272922g = parcel.readInt();
        this.f272923h = parcel.readInt();
        this.f272924i = (Boolean) parcel.readValue(cls.getClassLoader());
        this.f272925j = (Boolean) parcel.readValue(cls.getClassLoader());
        this.f272926n = (VideoTransPara) parcel.readParcelable(VideoTransPara.class.getClassLoader());
        this.f272927o = (UICustomParam) parcel.readParcelable(UICustomParam.class.getClassLoader());
        int readInt = parcel.readInt();
        if (readInt == -1) {
            eVar = null;
        } else {
            eVar = C96814a.C96817e.values()[readInt];
        }
        this.f272928p = eVar;
        this.f272929q = parcel.readInt();
        this.f272930r = (Boolean) parcel.readValue(cls.getClassLoader());
        this.f272931s = (Boolean) parcel.readValue(cls.getClassLoader());
        this.f272932t = (Boolean) parcel.readValue(cls.getClassLoader());
        this.f272933u = (Boolean) parcel.readValue(cls.getClassLoader());
        this.f272934v = (Boolean) parcel.readValue(cls.getClassLoader());
        this.f272935w = parcel.readInt();
        this.f272937y = parcel.readByte() != 0;
        this.f272938z = parcel.readByte() != 0;
        this.f272900A = parcel.readString();
        this.f272901B = parcel.readString();
        this.f272902C = parcel.readString();
        this.f272903D = parcel.readString();
        this.f272904E = parcel.readString();
        this.f272905F = parcel.readInt();
        this.f272906G = parcel.createStringArrayList();
        this.f272907H = parcel.createStringArrayList();
        this.f272908I = (VideoCaptureReportInfo) parcel.readParcelable(VideoCaptureReportInfo.class.getClassLoader());
        this.f272909J = parcel.readLong();
        this.f272910K = parcel.readByte() != 0;
        this.f272911L = parcel.readByte() != 0;
        this.f272912M = parcel.readBundle();
        this.f272913N = parcel.readByte() != 0;
        this.f272914P = (HashMap) parcel.readSerializable();
        this.f272915Q = (XEffectConfig) parcel.readParcelable(XEffectConfig.class.getClassLoader());
        this.f272936x = parcel.readInt();
        this.f272916R = parcel.readString();
        this.f272917S = parcel.readByte() != 0;
        this.f272918T = parcel.readInt() != 1 ? false : z;
    }
}
