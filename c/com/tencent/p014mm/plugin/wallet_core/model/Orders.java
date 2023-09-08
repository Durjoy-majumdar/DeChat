package com.tencent.p014mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import f40.C86709a0;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pe3.C89349b;
import st1.C77761h0;
import t14.C77818a;
import t14.C77819b;
import t14.C77820c;
import t14.C77821d;
import t14.C77822e;
import t14.C77823f;
import t14.C77824g;
import t14.C77825h;
import t14.C77826i;
import te3.C50250le0;
import te3.te4;
import tt1.C78101i;
import y43.C66497a;
import y43.C66498c;
import y43.C66499d;
import y43.C66500k;
import y43.C66501m;
import y43.C66502u;
import y43.C66503v;
import y43.C66504w;
import y43.C79028b;
import y43.C79030d0;
import y43.C79032f;
import y43.C79033l;
import y43.C79034n;

/* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders */
public class Orders implements Parcelable {
    public static final Parcelable.Creator<Orders> CREATOR = new C72190a();

    /* renamed from: A */
    public int f209530A;

    /* renamed from: B */
    public boolean f209531B;

    /* renamed from: C */
    public String f209532C;

    /* renamed from: D */
    public String f209533D;

    /* renamed from: E */
    public long f209534E;

    /* renamed from: F */
    public String f209535F;

    /* renamed from: G */
    public String f209536G;

    /* renamed from: H */
    public Set<String> f209537H;

    /* renamed from: I */
    public int f209538I;

    /* renamed from: J */
    public String f209539J;

    /* renamed from: K */
    public boolean f209540K;

    /* renamed from: L */
    public String f209541L;

    /* renamed from: M */
    public List<Commodity> f209542M;

    /* renamed from: N */
    public C79033l f209543N;

    /* renamed from: P */
    public int f209544P;

    /* renamed from: Q */
    public String f209545Q;

    /* renamed from: Q0 */
    public String f209546Q0;

    /* renamed from: R */
    public String f209547R;

    /* renamed from: R0 */
    public String f209548R0;

    /* renamed from: S */
    public DeductInfo f209549S;

    /* renamed from: S0 */
    public String f209550S0;

    /* renamed from: T */
    public int f209551T;

    /* renamed from: T0 */
    public String f209552T0;

    /* renamed from: U */
    public int f209553U;

    /* renamed from: U0 */
    public String f209554U0;

    /* renamed from: V */
    public int f209555V;

    /* renamed from: V0 */
    public int f209556V0;

    /* renamed from: W */
    public String f209557W;

    /* renamed from: W0 */
    public SimpleCashierInfo f209558W0;

    /* renamed from: X */
    public int f209559X;

    /* renamed from: Y */
    public int f209560Y;

    /* renamed from: Z */
    public ArrayList<ShowInfo> f209561Z;

    /* renamed from: d */
    public long f209562d;

    /* renamed from: e */
    public String f209563e;

    /* renamed from: f */
    public String f209564f;
    public ArrayList<te4> field_infos;

    /* renamed from: g */
    public String f209565g;

    /* renamed from: h */
    public double f209566h;

    /* renamed from: i */
    public int f209567i;

    /* renamed from: j */
    public String f209568j;

    /* renamed from: n */
    public double f209569n;

    /* renamed from: o */
    public double f209570o;

    /* renamed from: p */
    public int f209571p;

    /* renamed from: p0 */
    public String f209572p0;

    /* renamed from: q */
    public String f209573q;

    /* renamed from: r */
    public String f209574r;

    /* renamed from: s */
    public int f209575s;

    /* renamed from: t */
    public String f209576t;

    /* renamed from: u */
    public String f209577u;

    /* renamed from: v */
    public String f209578v;

    /* renamed from: w */
    public String f209579w;

    /* renamed from: x */
    public String f209580x;

    /* renamed from: x0 */
    public String f209581x0;

    /* renamed from: y */
    public String f209582y;

    /* renamed from: y0 */
    public String f209583y0;

    /* renamed from: z */
    public String f209584z;

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$DeductShowInfo */
    public static class DeductShowInfo implements Parcelable {
        public static final Parcelable.Creator<DeductShowInfo> CREATOR = new C72181a();

        /* renamed from: d */
        public String f209626d;

        /* renamed from: e */
        public String f209627e;

        /* renamed from: f */
        public int f209628f;

        /* renamed from: g */
        public String f209629g;

        /* renamed from: h */
        public String f209630h;

        /* renamed from: i */
        public String f209631i;

        /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$DeductShowInfo$a */
        public class C72181a implements Parcelable.Creator<DeductShowInfo> {
            public Object createFromParcel(Parcel parcel) {
                return new DeductShowInfo(parcel);
            }

            public Object[] newArray(int i) {
                return new DeductShowInfo[i];
            }
        }

        public DeductShowInfo() {
        }

        public DeductShowInfo(Parcel parcel) {
            this.f209626d = parcel.readString();
            this.f209627e = parcel.readString();
            this.f209628f = parcel.readInt();
            this.f209629g = parcel.readString();
            this.f209630h = parcel.readString();
            this.f209631i = parcel.readString();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f209626d);
            parcel.writeString(this.f209627e);
            parcel.writeInt(this.f209628f);
            parcel.writeString(this.f209629g);
            parcel.writeString(this.f209630h);
            parcel.writeString(this.f209631i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$DiscountInfo */
    public static class DiscountInfo implements Parcelable {
        public static final Parcelable.Creator<DiscountInfo> CREATOR = new C72182a();

        /* renamed from: d */
        public double f209632d;

        /* renamed from: e */
        public String f209633e;

        /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$DiscountInfo$a */
        public class C72182a implements Parcelable.Creator<DiscountInfo> {
            public Object createFromParcel(Parcel parcel) {
                return new DiscountInfo(parcel);
            }

            public Object[] newArray(int i) {
                return new DiscountInfo[i];
            }
        }

        public DiscountInfo() {
        }

        public DiscountInfo(Parcel parcel) {
            this.f209632d = parcel.readDouble();
            this.f209633e = parcel.readString();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeDouble(this.f209632d);
            parcel.writeString(this.f209633e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$FinderInfo */
    public static class FinderInfo implements Parcelable {
        public static final Parcelable.Creator<FinderInfo> CREATOR = new C72183a();

        /* renamed from: d */
        public int f209634d;

        /* renamed from: e */
        public String f209635e;

        /* renamed from: f */
        public String f209636f;

        /* renamed from: g */
        public String f209637g;

        /* renamed from: h */
        public String f209638h;

        /* renamed from: i */
        public String f209639i;

        /* renamed from: j */
        public String f209640j;

        /* renamed from: n */
        public String f209641n;

        /* renamed from: o */
        public String f209642o;

        /* renamed from: p */
        public String f209643p;

        /* renamed from: q */
        public String f209644q;

        /* renamed from: r */
        public int f209645r;

        /* renamed from: s */
        public String f209646s;

        /* renamed from: t */
        public String f209647t;

        /* renamed from: u */
        public String f209648u;

        /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$FinderInfo$a */
        public class C72183a implements Parcelable.Creator<FinderInfo> {
            public Object createFromParcel(Parcel parcel) {
                return new FinderInfo(parcel);
            }

            public Object[] newArray(int i) {
                return new FinderInfo[i];
            }
        }

        public FinderInfo() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f209634d);
            parcel.writeString(this.f209635e);
            parcel.writeString(this.f209636f);
            parcel.writeString(this.f209637g);
            parcel.writeString(this.f209638h);
            parcel.writeString(this.f209639i);
            parcel.writeString(this.f209640j);
            parcel.writeString(this.f209641n);
            parcel.writeString(this.f209642o);
            parcel.writeString(this.f209643p);
            parcel.writeString(this.f209644q);
            parcel.writeString(this.f209646s);
            parcel.writeString(this.f209647t);
            parcel.writeString(this.f209648u);
            parcel.writeInt(this.f209645r);
        }

        public FinderInfo(Parcel parcel) {
            this.f209634d = parcel.readInt();
            this.f209635e = parcel.readString();
            this.f209636f = parcel.readString();
            this.f209637g = parcel.readString();
            this.f209638h = parcel.readString();
            this.f209639i = parcel.readString();
            this.f209640j = parcel.readString();
            this.f209641n = parcel.readString();
            this.f209642o = parcel.readString();
            this.f209643p = parcel.readString();
            this.f209644q = parcel.readString();
            this.f209646s = parcel.readString();
            this.f209647t = parcel.readString();
            this.f209648u = parcel.readString();
            this.f209645r = parcel.readInt();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$LeadTailViewInfo */
    public static class LeadTailViewInfo implements Parcelable {
        public static final Parcelable.Creator<LeadTailViewInfo> CREATOR = new C72184a();

        /* renamed from: d */
        public String f209649d;

        /* renamed from: e */
        public String f209650e;

        /* renamed from: f */
        public String f209651f;

        /* renamed from: g */
        public String f209652g;

        /* renamed from: h */
        public String f209653h;

        /* renamed from: i */
        public int f209654i;

        /* renamed from: j */
        public int f209655j;

        /* renamed from: n */
        public String f209656n;

        /* renamed from: o */
        public String f209657o;

        /* renamed from: p */
        public String f209658p;

        /* renamed from: q */
        public String f209659q;

        /* renamed from: r */
        public String f209660r;

        /* renamed from: s */
        public String f209661s;

        /* renamed from: t */
        public String f209662t;

        /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$LeadTailViewInfo$a */
        public class C72184a implements Parcelable.Creator<LeadTailViewInfo> {
            public Object createFromParcel(Parcel parcel) {
                return new LeadTailViewInfo(parcel);
            }

            public Object[] newArray(int i) {
                return new LeadTailViewInfo[i];
            }
        }

        public LeadTailViewInfo() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f209649d);
            parcel.writeString(this.f209650e);
            parcel.writeString(this.f209651f);
            parcel.writeString(this.f209652g);
            parcel.writeString(this.f209653h);
            parcel.writeInt(this.f209654i);
            parcel.writeInt(this.f209655j);
            parcel.writeString(this.f209656n);
            parcel.writeString(this.f209657o);
            parcel.writeString(this.f209658p);
            parcel.writeString(this.f209659q);
            parcel.writeString(this.f209660r);
            parcel.writeString(this.f209661s);
            parcel.writeString(this.f209662t);
        }

        public LeadTailViewInfo(Parcel parcel) {
            this.f209649d = parcel.readString();
            this.f209650e = parcel.readString();
            this.f209651f = parcel.readString();
            this.f209652g = parcel.readString();
            this.f209653h = parcel.readString();
            this.f209654i = parcel.readInt();
            this.f209655j = parcel.readInt();
            this.f209656n = parcel.readString();
            this.f209657o = parcel.readString();
            this.f209658p = parcel.readString();
            this.f209659q = parcel.readString();
            this.f209660r = parcel.readString();
            this.f209661s = parcel.readString();
            this.f209662t = parcel.readString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$Promotions */
    public static class Promotions implements Parcelable {
        public static final Parcelable.Creator<Promotions> CREATOR = new C72185a();

        /* renamed from: A */
        public C77820c f209663A;

        /* renamed from: d */
        public int f209664d;

        /* renamed from: e */
        public String f209665e;

        /* renamed from: f */
        public String f209666f;

        /* renamed from: g */
        public String f209667g;

        /* renamed from: h */
        public String f209668h;

        /* renamed from: i */
        public String f209669i;

        /* renamed from: j */
        public String f209670j;

        /* renamed from: n */
        public int f209671n;

        /* renamed from: o */
        public long f209672o;

        /* renamed from: p */
        public int f209673p;

        /* renamed from: q */
        public int f209674q;

        /* renamed from: r */
        public int f209675r;

        /* renamed from: s */
        public int f209676s;

        /* renamed from: t */
        public String f209677t;

        /* renamed from: u */
        public String f209678u;

        /* renamed from: v */
        public String f209679v;

        /* renamed from: w */
        public long f209680w;

        /* renamed from: x */
        public int f209681x;

        /* renamed from: y */
        public String f209682y;

        /* renamed from: z */
        public String f209683z;

        /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$Promotions$a */
        public class C72185a implements Parcelable.Creator<Promotions> {
            public Object createFromParcel(Parcel parcel) {
                return new Promotions(parcel);
            }

            public Object[] newArray(int i) {
                return new Promotions[i];
            }
        }

        public Promotions() {
        }

        public Promotions(Parcel parcel) {
            this.f209664d = parcel.readInt();
            this.f209665e = parcel.readString();
            this.f209666f = parcel.readString();
            this.f209667g = parcel.readString();
            this.f209668h = parcel.readString();
            this.f209669i = parcel.readString();
            this.f209670j = parcel.readString();
            this.f209671n = parcel.readInt();
            this.f209672o = parcel.readLong();
            this.f209673p = parcel.readInt();
            this.f209674q = parcel.readInt();
            this.f209675r = parcel.readInt();
            this.f209676s = parcel.readInt();
            this.f209677t = parcel.readString();
            this.f209678u = parcel.readString();
            this.f209679v = parcel.readString();
            this.f209680w = parcel.readLong();
            this.f209681x = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f209664d);
            parcel.writeString(this.f209665e);
            parcel.writeString(this.f209666f);
            parcel.writeString(this.f209667g);
            parcel.writeString(this.f209668h);
            parcel.writeString(this.f209669i);
            parcel.writeString(this.f209670j);
            parcel.writeInt(this.f209671n);
            parcel.writeLong(this.f209672o);
            parcel.writeInt(this.f209673p);
            parcel.writeInt(this.f209674q);
            parcel.writeInt(this.f209675r);
            parcel.writeInt(this.f209676s);
            parcel.writeString(this.f209677t);
            parcel.writeString(this.f209678u);
            parcel.writeString(this.f209679v);
            parcel.writeLong(this.f209680w);
            parcel.writeInt(this.f209681x);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$RecommendTinyAppInfo */
    public static class RecommendTinyAppInfo implements Parcelable {
        public static final Parcelable.Creator<RecommendTinyAppInfo> CREATOR = new C72186a();

        /* renamed from: d */
        public String f209684d;

        /* renamed from: e */
        public String f209685e;

        /* renamed from: f */
        public String f209686f;

        /* renamed from: g */
        public String f209687g;

        /* renamed from: h */
        public String f209688h;

        /* renamed from: i */
        public String f209689i;

        /* renamed from: j */
        public long f209690j;

        /* renamed from: n */
        public long f209691n;

        /* renamed from: o */
        public int f209692o;

        /* renamed from: p */
        public int f209693p;

        /* renamed from: q */
        public long f209694q;

        /* renamed from: r */
        public int f209695r;

        /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$RecommendTinyAppInfo$a */
        public class C72186a implements Parcelable.Creator<RecommendTinyAppInfo> {
            public Object createFromParcel(Parcel parcel) {
                return new RecommendTinyAppInfo(parcel);
            }

            public Object[] newArray(int i) {
                return new RecommendTinyAppInfo[i];
            }
        }

        public RecommendTinyAppInfo() {
        }

        public RecommendTinyAppInfo(Parcel parcel) {
            this.f209684d = parcel.readString();
            this.f209685e = parcel.readString();
            this.f209686f = parcel.readString();
            this.f209687g = parcel.readString();
            this.f209688h = parcel.readString();
            this.f209695r = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f209684d);
            parcel.writeString(this.f209685e);
            parcel.writeString(this.f209686f);
            parcel.writeString(this.f209687g);
            parcel.writeString(this.f209688h);
            parcel.writeInt(this.f209695r);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$RemarksInfo */
    public static class RemarksInfo implements Parcelable {
        public static final Parcelable.Creator<RemarksInfo> CREATOR = new C72187a();

        /* renamed from: d */
        public String f209696d;

        /* renamed from: e */
        public String f209697e;

        /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$RemarksInfo$a */
        public class C72187a implements Parcelable.Creator<RemarksInfo> {
            public Object createFromParcel(Parcel parcel) {
                return new RemarksInfo(parcel);
            }

            public Object[] newArray(int i) {
                return new RemarksInfo[i];
            }
        }

        public RemarksInfo() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f209696d);
            parcel.writeString(this.f209697e);
        }

        public RemarksInfo(Parcel parcel) {
            this.f209696d = parcel.readString();
            this.f209697e = parcel.readString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$ShowInfo */
    public static class ShowInfo implements Parcelable {
        public static final Parcelable.Creator<ShowInfo> CREATOR = new C72188a();

        /* renamed from: d */
        public String f209698d;

        /* renamed from: e */
        public String f209699e;

        /* renamed from: f */
        public String f209700f;

        /* renamed from: g */
        public String f209701g;

        /* renamed from: h */
        public int f209702h;

        /* renamed from: i */
        public String f209703i;

        /* renamed from: j */
        public String f209704j;

        /* renamed from: n */
        public String f209705n;

        /* renamed from: o */
        public int f209706o;

        /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$ShowInfo$a */
        public class C72188a implements Parcelable.Creator<ShowInfo> {
            public Object createFromParcel(Parcel parcel) {
                return new ShowInfo(parcel);
            }

            public Object[] newArray(int i) {
                return new ShowInfo[i];
            }
        }

        public ShowInfo() {
        }

        public ShowInfo(Parcel parcel) {
            this.f209698d = parcel.readString();
            this.f209699e = parcel.readString();
            this.f209700f = parcel.readString();
            this.f209701g = parcel.readString();
            this.f209702h = parcel.readInt();
            this.f209703i = parcel.readString();
            this.f209704j = parcel.readString();
            this.f209705n = parcel.readString();
            this.f209706o = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return String.format("ShowInfo name:%s, value:%s, nameColor:%s, valueColor:%s, linkType:%s, linkWeApp:%s, linkAddr:%s, linkUrl:%s, textAttr:%s", new Object[]{this.f209698d, this.f209699e, this.f209700f, this.f209701g, Integer.valueOf(this.f209702h), this.f209703i, this.f209704j, this.f209705n, Integer.valueOf(this.f209706o)});
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f209698d);
            parcel.writeString(this.f209699e);
            parcel.writeString(this.f209700f);
            parcel.writeString(this.f209701g);
            parcel.writeInt(this.f209702h);
            parcel.writeString(this.f209703i);
            parcel.writeString(this.f209704j);
            parcel.writeString(this.f209705n);
            parcel.writeInt(this.f209706o);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$SimpleCashierInfo */
    public static class SimpleCashierInfo implements Parcelable {
        public static final Parcelable.Creator<SimpleCashierInfo> CREATOR = new C72189a();

        /* renamed from: d */
        public int f209707d;

        /* renamed from: e */
        public String f209708e;

        /* renamed from: f */
        public String f209709f;

        /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$SimpleCashierInfo$a */
        public class C72189a implements Parcelable.Creator<SimpleCashierInfo> {
            public Object createFromParcel(Parcel parcel) {
                return new SimpleCashierInfo(parcel);
            }

            public Object[] newArray(int i) {
                return new SimpleCashierInfo[i];
            }
        }

        public SimpleCashierInfo() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f209707d);
            parcel.writeString(this.f209708e);
            parcel.writeString(this.f209709f);
        }

        public SimpleCashierInfo(Parcel parcel) {
            this.f209707d = parcel.readInt();
            this.f209708e = parcel.readString();
            this.f209709f = parcel.readString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$a */
    public class C72190a implements Parcelable.Creator<Orders> {
        public Object createFromParcel(Parcel parcel) {
            return new Orders(parcel);
        }

        public Object[] newArray(int i) {
            return new Orders[i];
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$b */
    public static class C72191b {

        /* renamed from: a */
        public String f209710a = "";

        /* renamed from: b */
        public String f209711b = "";
    }

    public Orders() {
        this.f209563e = "";
        this.f209564f = "";
        this.f209565g = "0";
        this.f209566h = 0.0d;
        this.f209570o = 0.0d;
        this.f209531B = false;
        this.f209532C = "";
        this.f209533D = "";
        this.f209534E = 0;
        this.f209535F = "";
        this.f209537H = new HashSet();
        this.f209538I = 0;
        this.f209541L = "";
        this.f209542M = new ArrayList();
        this.f209543N = new C79033l();
        this.f209544P = 0;
        this.f209545Q = "";
        this.f209547R = "";
        this.f209551T = 0;
        this.f209553U = 0;
        this.f209555V = 0;
        this.f209557W = "";
        this.f209559X = 0;
        this.f209560Y = 0;
        this.f209561Z = new ArrayList<>();
        this.f209572p0 = "";
        this.f209581x0 = "";
        this.field_infos = new ArrayList<>();
        this.f209583y0 = "";
        this.f209550S0 = "";
    }

    /* renamed from: a */
    public static Orders m84559a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 == null) {
            return null;
        }
        Orders orders = new Orders();
        try {
            orders.f209562d = Util.nowMilliSecond();
            int i = 2;
            orders.f209566h = C75228t.m90250i(jSONObject2.optString("total_fee"), "100", 2, RoundingMode.HALF_UP);
            orders.f209565g = jSONObject2.getString("num");
            orders.f209567i = jSONObject2.optInt("bank_card_tag", 1);
            orders.f209568j = jSONObject2.optString("fee_type", "");
            orders.f209569n = C75228t.m90250i(jSONObject2.optString("charge_fee"), "100", 2, RoundingMode.HALF_UP);
            orders.f209570o = C75228t.m90250i(jSONObject2.optString("fetch_fee"), "100", 2, RoundingMode.HALF_UP);
            orders.f209571p = jSONObject2.optInt("is_assign_userinfo_pay");
            orders.f209573q = jSONObject2.optString("true_name");
            orders.f209574r = jSONObject2.optString("cre_id");
            orders.f209575s = jSONObject2.optInt("ce_type");
            orders.f209576t = jSONObject2.optString("assign_pay_info");
            JSONArray jSONArray = jSONObject2.getJSONArray("Array");
            jSONObject2.optLong("free_fee");
            jSONObject2.optLong("remain_fee");
            orders.f209551T = jSONObject2.optInt("not_support_bind_card", 0);
            orders.f209553U = jSONObject2.optInt("not_support_retry", 0);
            boolean z = jSONObject2.optInt("support_all_bank", 0) == 1;
            if (z) {
                orders.f209537H = new HashSet();
            }
            int length = jSONArray.length();
            int i2 = 0;
            while (i2 < length) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                Commodity commodity = new Commodity();
                commodity.f209599h = jSONObject3.getString("desc");
                JSONArray jSONArray2 = jSONArray;
                commodity.f209601j = C75228t.m90250i(jSONObject3.optString("fee"), "100", i, RoundingMode.HALF_UP);
                commodity.f209600i = "" + jSONObject3.optInt("count", 1);
                commodity.f209603o = jSONObject3.getString("pay_status");
                commodity.f209607s = jSONObject3.optString("buy_bank_name");
                commodity.f209604p = jSONObject3.getString("pay_status_name");
                commodity.f209597f = jSONObject3.optString("spid");
                commodity.f209598g = jSONObject3.optString("sp_name");
                commodity.f209605q = jSONObject3.optInt("modify_timestamp");
                commodity.f209606r = jSONObject3.getString(FirebaseAnalytics.C113379b.TRANSACTION_ID);
                commodity.f209608t = jSONObject3.optString("fee_type");
                if (Util.isNullOrNil(orders.f209568j)) {
                    orders.f209568j = commodity.f209608t;
                }
                commodity.f209609u = jSONObject3.optString("appusername");
                commodity.f209611w = jSONObject3.optString("app_telephone");
                ((ArrayList) orders.f209542M).add(commodity);
                if (!z) {
                    String optString = jSONObject3.optString("support_bank");
                    orders.f209536G = optString;
                    orders.f209537H = m84568j(optString);
                }
                i2++;
                jSONArray = jSONArray2;
                i = 2;
            }
            if (jSONObject2.has("is_open_fee_protocal")) {
                orders.f209531B = C75228t.m90233Z(jSONObject2, "is_open_fee_protocal");
            } else {
                orders.f209531B = Bankcard.m84545t2(orders.f209567i, 2);
            }
            orders.f209543N = m84563e(jSONObject);
            m84569m(jSONObject2, orders);
            orders.f209544P = jSONObject2.optInt("needbindcardtoshowfavinfo");
            orders.f209545Q = jSONObject2.optString("discount_wording");
            orders.f209547R = jSONObject2.optString("favor_rule_wording");
            m84561c(orders, jSONObject2.optJSONObject("entrustpayinfo"));
            String optString2 = jSONObject2.optString("field_area_info");
            if (!Util.isNullOrNil(optString2)) {
                try {
                    orders.field_infos.addAll(((C50250le0) new C50250le0().parseFrom(Base64.decode(optString2, 0))).field_info);
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.Orders", e, "", new Object[0]);
                }
            }
            orders.f209583y0 = jSONObject2.optString("price_total_fee", "0");
            orders.f209546Q0 = jSONObject2.optString("price_fee_type", "");
            orders.f209548R0 = jSONObject2.optString("price_fee_symbol", "");
            orders.f209550S0 = jSONObject2.optString("settlement_fee", "0");
            orders.f209552T0 = jSONObject2.optString("settlement_type", "");
            orders.f209554U0 = jSONObject2.optString("settlement_symbol", "");
            orders.f209556V0 = jSONObject2.optInt("is_open_field_area", 0);
            m84567i(jSONObject2, orders);
            return orders;
        } catch (JSONException e2) {
            Log.printErrStackTrace("MicroMsg.Orders", e2, "", new Object[0]);
            return orders;
        }
    }

    /* renamed from: b */
    public static void m84560b(Commodity commodity, JSONObject jSONObject, int i) {
        Commodity commodity2 = commodity;
        JSONObject jSONObject2 = jSONObject;
        commodity2.f209613y = jSONObject2.optString("discount");
        commodity2.f209603o = jSONObject2.getString("pay_status");
        commodity2.f209604p = jSONObject2.getString("pay_status_name");
        commodity2.f209607s = jSONObject2.optString("buy_bank_name");
        commodity2.f209605q = jSONObject2.optInt("pay_timestamp");
        commodity2.f209612x = jSONObject2.optString("card_tail");
        commodity2.f209614z = i;
        commodity2.f209586B = jSONObject2.optString("rateinfo");
        jSONObject2.optString("discount_rateinfo");
        commodity2.f209587C = jSONObject2.optString("original_feeinfo");
        if (jSONObject2.has("total_fee")) {
            commodity2.f209601j = jSONObject2.optDouble("total_fee", 0.0d) / 100.0d;
        }
        commodity2.f209602n = jSONObject2.optDouble("original_total_fee", -1.0d) / 100.0d;
        commodity2.f209608t = jSONObject2.optString("fee_type", "");
        JSONObject optJSONObject = jSONObject2.optJSONObject("subscribe_biz_info");
        int i2 = 1;
        if (optJSONObject != null) {
            Promotions promotions = new Promotions();
            promotions.f209664d = 0;
            promotions.f209666f = optJSONObject.optString("nickname");
            String optString = optJSONObject.optString("username");
            promotions.f209669i = optString;
            commodity2.f209610v = optString;
            promotions.f209665e = optJSONObject.optString("logo_round_url");
            promotions.f209668h = optJSONObject.optString("subscribe_biz_url");
            if (!Util.isNullOrNil(promotions.f209666f) && !Util.isNullOrNil(promotions.f209668h)) {
                commodity2.f209592H.add(promotions);
                commodity2.f209593I = true;
            }
        }
        JSONArray jSONArray = jSONObject2.getJSONArray("activity_info");
        int length = jSONArray.length();
        int i3 = 0;
        while (i3 < length) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i3);
            Promotions promotions2 = new Promotions();
            promotions2.f209664d = i2;
            promotions2.f209665e = jSONObject3.optString("icon");
            promotions2.f209666f = jSONObject3.optString("wording");
            promotions2.f209668h = jSONObject3.optString("url");
            promotions2.f209667g = jSONObject3.optString("btn_text");
            promotions2.f209671n = jSONObject3.optInt("type");
            promotions2.f209670j = jSONObject3.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            promotions2.f209672o = jSONObject3.optLong(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID);
            promotions2.f209673p = jSONObject3.optInt("activity_type", 0);
            promotions2.f209677t = jSONObject3.optString("small_title");
            promotions2.f209674q = jSONObject3.optInt("award_id");
            promotions2.f209675r = jSONObject3.optInt("send_record_id");
            promotions2.f209676s = jSONObject3.optInt("user_record_id");
            promotions2.f209678u = jSONObject3.optString("activity_tinyapp_username");
            promotions2.f209679v = jSONObject3.optString("activity_tinyapp_path");
            promotions2.f209680w = jSONObject3.optLong("activity_mch_id");
            promotions2.f209681x = jSONObject3.optInt("activity_tinyapp_version");
            promotions2.f209682y = jSONObject3.optString("get_award_params");
            promotions2.f209683z = jSONObject3.optString("query_award_status_params");
            m84562d(promotions2, jSONObject3.optJSONObject("exposure_info"));
            commodity2.f209592H.add(promotions2);
            i3++;
            i2 = 1;
        }
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("link_ativity_info");
        if (optJSONObject2 != null) {
            commodity2.f209594J.f209710a = optJSONObject2.optString(MimeTypes.BASE_TYPE_TEXT);
            commodity2.f209594J.f209711b = optJSONObject2.optString("url");
        }
        JSONArray optJSONArray = jSONObject2.optJSONArray("discount_array");
        if (optJSONArray != null) {
            int length2 = optJSONArray.length();
            for (int i4 = 0; i4 < length2; i4++) {
                JSONObject optJSONObject3 = optJSONArray.optJSONObject(i4);
                DiscountInfo discountInfo = new DiscountInfo();
                if (optJSONObject3 != null) {
                    discountInfo.f209632d = optJSONObject3.optDouble("payment_amount");
                    discountInfo.f209633e = optJSONObject3.optString("favor_desc");
                    commodity2.f209585A.add(discountInfo);
                }
            }
        }
        JSONObject optJSONObject4 = jSONObject2.optJSONObject("tinyapp_info");
        if (optJSONObject4 != null) {
            if (commodity2.f209588D == null) {
                commodity2.f209588D = new RecommendTinyAppInfo();
            }
            commodity2.f209588D.f209684d = optJSONObject4.optString("tinyapp_name");
            commodity2.f209588D.f209685e = optJSONObject4.optString("tinyapp_logo");
            commodity2.f209588D.f209686f = optJSONObject4.optString("tinyapp_desc");
            commodity2.f209588D.f209687g = optJSONObject4.optString("tinyapp_username");
            commodity2.f209588D.f209688h = optJSONObject4.optString("tinyapp_path");
            commodity2.f209588D.f209689i = optJSONObject4.optString("activity_tinyapp_btn_text");
            commodity2.f209588D.f209690j = optJSONObject4.optLong(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID);
            RecommendTinyAppInfo recommendTinyAppInfo = commodity2.f209588D;
            optJSONObject4.optLong("activity_type");
            recommendTinyAppInfo.getClass();
            commodity2.f209588D.f209691n = optJSONObject4.optLong("award_id");
            commodity2.f209588D.f209692o = optJSONObject4.optInt("send_record_id");
            commodity2.f209588D.f209693p = optJSONObject4.optInt("user_record_id");
            commodity2.f209588D.f209694q = optJSONObject4.optLong("activity_mch_id");
            commodity2.f209588D.f209695r = optJSONObject4.optInt("tinyapp_version");
        }
        JSONObject optJSONObject5 = jSONObject2.optJSONObject("remarks_info");
        if (optJSONObject5 != null) {
            if (commodity2.f209591G == null) {
                commodity2.f209591G = new RemarksInfo();
            }
            commodity2.f209591G.f209696d = optJSONObject5.optString("remark_title");
            commodity2.f209591G.f209697e = optJSONObject5.optString("remark_desc");
        }
    }

    /* renamed from: c */
    public static void m84561c(Orders orders, JSONObject jSONObject) {
        if (jSONObject != null) {
            Log.m105924i("MicroMsg.Orders", "parseDeductInfo json is not null");
            DeductInfo deductInfo = new DeductInfo();
            orders.f209549S = deductInfo;
            deductInfo.f209615d = jSONObject.optString("contract_title");
            orders.f209549S.f209616e = jSONObject.optString("contract_desc");
            orders.f209549S.f209617f = jSONObject.optInt("auto_deduct_flag", 0);
            orders.f209549S.f209618g = jSONObject.optString("contract_url");
            orders.f209549S.f209620i = jSONObject.optInt("is_select_pay_way", 0);
            orders.f209549S.f209621j = jSONObject.optInt("deduct_show_type", 0);
            orders.f209549S.f209622n = jSONObject.optString("button_wording", "");
            orders.f209549S.f209623o = jSONObject.optString("deduct_rule_wording", "");
            orders.f209549S.f209624p = jSONObject.optString("open_deduct_wording", "");
            orders.f209549S.f209625q = jSONObject.optString("open_deduct_wording_color", "");
            JSONArray optJSONArray = jSONObject.optJSONArray("show_info");
            int length = optJSONArray.length();
            if (length > 0) {
                orders.f209549S.f209619h = new ArrayList();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        DeductShowInfo deductShowInfo = new DeductShowInfo();
                        deductShowInfo.f209626d = optJSONObject.optString("name");
                        deductShowInfo.f209627e = optJSONObject.optString("value");
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("value_attr");
                        if (optJSONObject2 != null) {
                            deductShowInfo.f209628f = optJSONObject2.optInt("link_type", 0);
                            deductShowInfo.f209629g = optJSONObject2.optString("link_weapp");
                            deductShowInfo.f209630h = optJSONObject2.optString("link_addr");
                            deductShowInfo.f209631i = optJSONObject2.optString("link_url");
                        }
                        orders.f209549S.f209619h.add(deductShowInfo);
                    } else {
                        Log.m105920e("MicroMsg.Orders", "parseDeductInfo's showInfo get a null value from json,index=" + i);
                    }
                }
                return;
            }
            Log.m105920e("MicroMsg.Orders", "parseDeductInfo's showInfo len is " + length);
            return;
        }
        Log.m105924i("MicroMsg.Orders", "parseDeductInfo json is null");
    }

    /* renamed from: d */
    public static void m84562d(Promotions promotions, JSONObject jSONObject) {
        String str;
        String str2;
        Promotions promotions2 = promotions;
        JSONObject jSONObject2 = jSONObject;
        Log.m105925i("MicroMsg.Orders", "parseExposureInfo: %s", jSONObject2);
        if (jSONObject2 == null) {
            promotions2.f209663A = null;
            return;
        }
        try {
            C77820c cVar = new C77820c();
            JSONArray optJSONArray = jSONObject2.optJSONArray("single_exposure_info_list");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                cVar.f226707d = new LinkedList<>();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject3 = optJSONArray.getJSONObject(i);
                    C77826i iVar = new C77826i();
                    iVar.f226752d = jSONObject3.optString("logo");
                    iVar.f226753e = jSONObject3.optString("award_name");
                    iVar.f226754f = jSONObject3.optString("award_description");
                    iVar.f226755g = jSONObject3.optString("background_img");
                    iVar.f226757i = jSONObject3.optString("award_description_color");
                    iVar.f226756h = jSONObject3.optString("award_name_color");
                    cVar.f226707d.add(iVar);
                }
            }
            cVar.f226708e = jSONObject2.optInt("is_query_others", 0);
            cVar.f226709f = jSONObject2.optString("draw_lottery_params");
            cVar.f226710g = jSONObject2.optInt("is_show_btn");
            cVar.f226716p = jSONObject2.optString("background_img_whole");
            JSONObject optJSONObject = jSONObject2.optJSONObject("btn_info");
            str = "MicroMsg.Orders";
            if (optJSONObject != null) {
                try {
                    C77818a aVar = new C77818a();
                    cVar.f226711h = aVar;
                    str2 = "";
                    aVar.f226694d = optJSONObject.optString("btn_words");
                    cVar.f226711h.f226695e = optJSONObject.optString("btn_color");
                    cVar.f226711h.f226696f = optJSONObject.optInt("btn_op_type");
                    cVar.f226711h.f226697g = optJSONObject.optString("url");
                    cVar.f226711h.f226699i = optJSONObject.optString("get_lottery_params");
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("mini_app_info");
                    if (optJSONObject2 != null) {
                        cVar.f226711h.f226698h = new C77824g();
                        cVar.f226711h.f226698h.f226745d = optJSONObject2.optString("activity_tinyapp_username");
                        cVar.f226711h.f226698h.f226746e = optJSONObject2.optString("activity_tinyapp_path");
                        cVar.f226711h.f226698h.f226747f = optJSONObject2.optInt("activity_tinyapp_version");
                    }
                } catch (Exception e) {
                    e = e;
                    Log.printErrStackTrace(str, e, "parseExposureInfo error: %s", e.getMessage());
                }
            } else {
                str2 = "";
            }
            cVar.f226712i = jSONObject2.optString("exposure_info_modify_params");
            cVar.f226713j = jSONObject2.optInt("user_opertaion_type");
            cVar.f226714n = jSONObject2.optInt("is_show_layer");
            JSONObject optJSONObject3 = jSONObject2.optJSONObject("layer_info");
            if (optJSONObject3 != null) {
                C77823f fVar = new C77823f();
                cVar.f226715o = fVar;
                fVar.f226736d = optJSONObject3.optString("layer_title");
                cVar.f226715o.f226737e = optJSONObject3.optString("layer_logo");
                cVar.f226715o.f226738f = optJSONObject3.optString("layer_type");
                cVar.f226715o.f226739g = optJSONObject3.optString("layer_name");
                cVar.f226715o.f226740h = optJSONObject3.optString("layer_description");
                cVar.f226715o.f226741i = optJSONObject3.optInt("is_show_layer_btn");
                if (!Util.isNullOrNil(optJSONObject3.optString("voice_url"))) {
                    cVar.f226715o.f226743n = new C89349b(optJSONObject3.optString("voice_url").getBytes());
                }
                if (!Util.isNullOrNil(optJSONObject3.optString("voice_data"))) {
                    cVar.f226715o.f226744o = new C89349b(optJSONObject3.optString("voice_data").getBytes());
                }
                JSONObject optJSONObject4 = optJSONObject3.optJSONObject("layer_btn_info");
                if (optJSONObject4 != null) {
                    cVar.f226715o.f226742j = new C77822e();
                    cVar.f226715o.f226742j.f226730d = optJSONObject4.optString("btn_words");
                    cVar.f226715o.f226742j.f226731e = optJSONObject4.optString("btn_color");
                    cVar.f226715o.f226742j.f226732f = optJSONObject4.optInt("btn_op_type");
                    cVar.f226715o.f226742j.f226733g = optJSONObject4.optString("get_lottery_params");
                    cVar.f226715o.f226742j.f226734h = optJSONObject4.optString("url");
                    JSONObject optJSONObject5 = optJSONObject4.optJSONObject("mini_app_info");
                    if (optJSONObject5 != null) {
                        cVar.f226715o.f226742j.f226735i = new C77824g();
                        cVar.f226715o.f226742j.f226735i.f226745d = optJSONObject5.optString("activity_tinyapp_username");
                        cVar.f226715o.f226742j.f226735i.f226746e = optJSONObject5.optString("activity_tinyapp_path");
                        cVar.f226715o.f226742j.f226735i.f226747f = optJSONObject5.optInt("activity_tinyapp_version");
                    }
                }
            }
            JSONObject optJSONObject6 = jSONObject2.optJSONObject("draw_lottery_info");
            if (optJSONObject6 != null) {
                C77819b bVar = new C77819b();
                cVar.f226717q = bVar;
                bVar.f226701e = optJSONObject6.optString("url");
                cVar.f226717q.f226702f = optJSONObject6.optString("animation_wording");
                cVar.f226717q.f226703g = optJSONObject6.optString("animation_wording_color");
                cVar.f226717q.f226705i = optJSONObject6.optString("after_animation_wording");
                cVar.f226717q.f226706j = optJSONObject6.optString("after_animation_wording_color");
                cVar.f226717q.f226704h = optJSONObject6.optInt("op_type");
                JSONObject optJSONObject7 = optJSONObject6.optJSONObject("mini_app_info");
                if (optJSONObject7 != null) {
                    cVar.f226717q.f226700d = new C77824g();
                    cVar.f226717q.f226700d.f226745d = optJSONObject7.optString("activity_tinyapp_username");
                    cVar.f226717q.f226700d.f226746e = optJSONObject7.optString("activity_tinyapp_path");
                    cVar.f226717q.f226700d.f226747f = optJSONObject7.optInt("activity_tinyapp_version");
                }
            }
            JSONObject optJSONObject8 = jSONObject2.optJSONObject("follow_cardbd_mch_info");
            if (optJSONObject8 != null) {
                C77821d dVar = new C77821d();
                cVar.f226718r = dVar;
                dVar.f226719d = optJSONObject8.optInt("is_followed_cardbd_mch", 0);
                String str3 = str2;
                cVar.f226718r.f226721f = optJSONObject8.optString("follow_logo", str3);
                cVar.f226718r.f226720e = optJSONObject8.optString("follow_tips", str3);
                cVar.f226718r.f226722g = optJSONObject8.optString("follow_tips_color", str3);
                cVar.f226718r.f226723h = optJSONObject8.optLong("follow_tips_size", 0);
                cVar.f226718r.f226727o = optJSONObject8.optString("follow_logo_after", str3);
                cVar.f226718r.f226729q = optJSONObject8.optString("follow_tips_after", str3);
                cVar.f226718r.f226728p = optJSONObject8.optString("follow_tips_color_after", str3);
                cVar.f226718r.f226724i = optJSONObject8.optString("follow_param", str3);
                cVar.f226718r.f226725j = optJSONObject8.optInt("is_show_pop_up", 0);
                JSONObject optJSONObject9 = optJSONObject8.optJSONObject("pop_up_window_info");
                if (optJSONObject9 != null) {
                    cVar.f226718r.f226726n = new C77825h();
                    cVar.f226718r.f226726n.f226748d = optJSONObject9.optString("pop_up_title");
                    cVar.f226718r.f226726n.f226749e = optJSONObject9.optString("pop_up_text");
                    cVar.f226718r.f226726n.f226751g = optJSONObject9.optString("pop_up_button_text");
                    cVar.f226718r.f226726n.f226750f = optJSONObject9.optString("pop_up_image_url");
                }
            }
            promotions.f209663A = cVar;
        } catch (Exception e2) {
            e = e2;
            str = "MicroMsg.Orders";
            Log.printErrStackTrace(str, e, "parseExposureInfo error: %s", e.getMessage());
        }
    }

    /* renamed from: e */
    public static C79033l m84563e(JSONObject jSONObject) {
        C79033l lVar = new C79033l();
        JSONObject optJSONObject = jSONObject.optJSONObject("favinfo");
        if (optJSONObject == null) {
            Log.m105918d("MicroMsg.Orders", "Parse getJsonObject(favinfo) null");
            return lVar;
        }
        lVar.f232068d = ((double) optJSONObject.optLong("tradeAmount")) / 100.0d;
        lVar.f232069e = ((double) optJSONObject.optLong("totalFavAmount")) / 100.0d;
        String str = "afterFavorTradeAmount";
        lVar.f232070f = ((double) optJSONObject.optLong(str)) / 100.0d;
        lVar.f232071g = optJSONObject.optString("favorComposeId");
        lVar.f232074j = optJSONObject.optInt("useNaturalDefense");
        lVar.f232075n = optJSONObject.optString("discountWording");
        lVar.f232076o = optJSONObject.optString("favorRuleWording");
        String str2 = "showFavorAmount";
        lVar.f232077p = optJSONObject.optDouble(str2, 0.0d) / 100.0d;
        lVar.f232078q = optJSONObject.optDouble("invariableFavorAmount", 0.0d) / 100.0d;
        lVar.f232079r = optJSONObject.optInt("isVariableFavor");
        lVar.f232080s = optJSONObject.optString("invariableFavorDesc");
        String str3 = "variableFavorDesc";
        lVar.f232081t = optJSONObject.optString(str3);
        JSONArray optJSONArray = optJSONObject.optJSONArray("tradeFavList");
        int i = 0;
        while (i < optJSONArray.length()) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            C79030d0 d0Var = new C79030d0();
            d0Var.f232045d = jSONObject2.optInt("favType");
            d0Var.f232046e = jSONObject2.optInt("favSubType");
            String str4 = str3;
            JSONArray jSONArray = optJSONArray;
            d0Var.f232047f = jSONObject2.optLong("favProperty");
            d0Var.f232048g = jSONObject2.optString("favorTypeDesc");
            d0Var.f232049h = jSONObject2.optString("favId");
            d0Var.f232050i = jSONObject2.optString("favName");
            d0Var.f232051j = jSONObject2.optString("favDesc");
            d0Var.f232052n = jSONObject2.optString("favorUseManual");
            d0Var.f232053o = jSONObject2.optString("favorRemarks");
            d0Var.f232054p = ((double) jSONObject2.optLong("favPrice")) / 100.0d;
            d0Var.f232055q = ((double) jSONObject2.optLong("realFavFee")) / 100.0d;
            d0Var.f232056r = jSONObject2.optInt("needBankPay");
            d0Var.f232057s = jSONObject2.optString("bankNo");
            d0Var.f232058t = jSONObject2.optString("bankName");
            d0Var.f232059u = jSONObject2.optString("bankLogoUrl");
            JSONArray optJSONArray2 = jSONObject2.optJSONArray("bind_serial_list");
            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    d0Var.f232060v.add(C89349b.m111674a(optJSONArray2.optString(i2).getBytes()));
                }
            }
            lVar.f232072h.add(d0Var);
            i++;
            str3 = str4;
            optJSONArray = jSONArray;
        }
        String str5 = str3;
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("favorComposeList");
        if (optJSONObject2 != null) {
            lVar.f232073i = new C66501m();
            JSONArray optJSONArray3 = optJSONObject2.optJSONArray("favorComposeInfo");
            int i3 = 0;
            while (i3 < optJSONArray3.length()) {
                JSONObject jSONObject3 = optJSONArray3.getJSONObject(i3);
                C79034n nVar = new C79034n();
                nVar.f232085d = jSONObject3.optString("faovrComposeId");
                nVar.f232086e = ((double) jSONObject3.optLong("totalFavorAmount")) / 100.0d;
                nVar.f232087f = ((double) jSONObject3.optLong(str)) / 100.0d;
                String str6 = str;
                String str7 = str2;
                nVar.f232090i = jSONObject3.optDouble(str2, 0.0d) / 100.0d;
                nVar.f232091j = jSONObject3.optDouble("invariableFavorAmount", 0.0d) / 100.0d;
                nVar.f232092n = jSONObject3.optInt("isVariableFavor");
                nVar.f232093o = jSONObject3.optString("invariableFavorDesc");
                String str8 = str5;
                nVar.f232094p = jSONObject3.optString(str8);
                JSONArray optJSONArray4 = jSONObject3.optJSONArray("composeArray");
                int i4 = 0;
                while (i4 < optJSONArray4.length()) {
                    JSONObject jSONObject4 = optJSONArray4.getJSONObject(i4);
                    C79032f fVar = new C79032f();
                    fVar.f232065d = jSONObject4.optString("favId");
                    fVar.f232066e = jSONObject4.optString("favorUseManual");
                    fVar.f232067f = jSONObject4.optString("favorRemarks");
                    nVar.f232088g.add(fVar);
                    i4++;
                    str8 = str8;
                }
                str5 = str8;
                lVar.f232073i.f191301d.add(nVar);
                i3++;
                str = str6;
                str2 = str7;
            }
        }
        C66497a aVar = new C66497a();
        JSONObject optJSONObject3 = optJSONObject.optJSONObject("bank_card_info");
        if (optJSONObject3 != null) {
            JSONArray optJSONArray5 = optJSONObject3.optJSONArray("bind_serial_favor_info_list");
            if (optJSONArray5 != null) {
                for (int i5 = 0; i5 < optJSONArray5.length(); i5++) {
                    C66498c cVar = new C66498c();
                    JSONObject jSONObject5 = optJSONArray5.getJSONObject(i5);
                    cVar.f191295d = jSONObject5.optString("bind_serial");
                    JSONArray optJSONArray6 = jSONObject5.optJSONArray("bind_serial_favor_list");
                    if (optJSONArray6 != null && optJSONArray6.length() > 0) {
                        for (int i6 = 0; i6 < optJSONArray6.length(); i6++) {
                            C66499d dVar = new C66499d();
                            JSONObject optJSONObject4 = optJSONArray6.optJSONObject(i6);
                            dVar.f191297d = optJSONObject4.optString("favor_desc");
                            dVar.f191298e = optJSONObject4.optInt("is_default_show", 0);
                            cVar.f191296e.add(dVar);
                        }
                    }
                    aVar.f191293d.add(cVar);
                }
            }
            JSONArray optJSONArray7 = optJSONObject3.optJSONObject("new_bind_card_info").optJSONArray("new_bind_card_favor_list");
            if (optJSONArray7 != null && optJSONArray7.length() > 0) {
                aVar.f191294e = new C66503v();
                for (int i7 = 0; i7 < optJSONArray7.length(); i7++) {
                    C66504w wVar = new C66504w();
                    wVar.f191307d = optJSONArray7.optJSONObject(i7).optString("favor_desc");
                    aVar.f191294e.f191306d.add(wVar);
                }
            }
        }
        lVar.f232082u = aVar;
        JSONArray optJSONArray8 = optJSONObject.optJSONArray("favcombid_forbindcard_list");
        if (optJSONArray8 != null) {
            int length = optJSONArray8.length();
            for (int i8 = 0; i8 < length; i8++) {
                JSONObject optJSONObject5 = optJSONArray8.optJSONObject(i8);
                if (optJSONObject5 != null) {
                    C66500k kVar = new C66500k();
                    kVar.f191300e = optJSONObject5.optString("default_fav_comb_id");
                    JSONObject optJSONObject6 = optJSONObject5.optJSONObject("payment_channel");
                    if (optJSONObject6 != null) {
                        C66502u uVar = new C66502u();
                        uVar.f191305f = optJSONObject6.optString("bind_serial");
                        uVar.f191304e = optJSONObject6.optInt("selected");
                        uVar.f191303d = optJSONObject6.optString("bankCode");
                        kVar.f191299d = uVar;
                    }
                    lVar.f232083v.add(kVar);
                }
            }
        }
        C79028b bVar = new C79028b();
        JSONObject optJSONObject7 = optJSONObject.optJSONObject("bank_fav_guide");
        if (optJSONObject7 != null) {
            C66502u uVar2 = new C66502u();
            JSONObject optJSONObject8 = optJSONObject7.optJSONObject("payment_channel");
            if (optJSONObject8 != null) {
                uVar2.f191303d = optJSONObject8.optString("bankCode");
                uVar2.f191304e = optJSONObject8.optInt("selected");
                uVar2.f191305f = optJSONObject8.optString("bind_serial");
                bVar.f232034d = uVar2;
            }
            bVar.f232035e = optJSONObject7.optInt("is_show_guide");
            bVar.f232036f = optJSONObject7.optString("default_fav_comb_id");
            bVar.f232037g = optJSONObject7.optString("guide_content");
            bVar.f232038h = optJSONObject7.optString("guide_content_color");
            bVar.f232039i = optJSONObject7.optString("guide_btn_text");
            bVar.f232040j = optJSONObject7.optString("guide_btn_text_color");
            bVar.f232041n = optJSONObject7.optString("guide_btn_bg_color");
            bVar.f232042o = optJSONObject7.optString("guide_logo");
            lVar.f232084w = bVar;
        }
        return lVar;
    }

    /* renamed from: f */
    public static void m84564f(JSONObject jSONObject, Orders orders, int i) {
        List<Commodity> list = orders.f209542M;
        orders.f209532C = jSONObject.optString("pay_result_tips");
        JSONArray jSONArray = jSONObject.getJSONArray("payresult");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            if (list != null && list.size() == 1) {
                Commodity commodity = list.get(0);
                commodity.f209592H = new ArrayList();
                commodity.f209585A = new ArrayList();
                commodity.f209606r = jSONObject2.getString(FirebaseAnalytics.C113379b.TRANSACTION_ID);
                m84560b(commodity, jSONObject2, i);
            } else if (list != null) {
                String string = jSONObject2.getString(FirebaseAnalytics.C113379b.TRANSACTION_ID);
                Iterator<Commodity> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Commodity next = it.next();
                    if (string != null && string.equals(next.f209606r)) {
                        m84560b(next, jSONObject2, i);
                        break;
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public static Orders m84565g(JSONObject jSONObject, Orders orders) {
        if (jSONObject == null || orders == null) {
            Log.m105928w("MicroMsg.Orders", "oldOrders is null");
        } else {
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("appservice");
                if (optJSONObject != null) {
                    orders.f209582y = optJSONObject.optString("app_recommend_desc");
                    orders.f209584z = optJSONObject.optString("app_telephone");
                    orders.f209530A = optJSONObject.optInt("recommend_level", 2);
                    orders.f209533D = optJSONObject.optString("share_to_friends_url");
                }
                m84564f(jSONObject, orders, orders.f209530A);
                JSONObject optJSONObject2 = jSONObject.optJSONObject("extinfo");
                if (optJSONObject2 != null) {
                    orders.f209534E = optJSONObject2.optLong("fetch_pre_arrive_time") * 1000;
                    orders.f209535F = optJSONObject2.optString("fetch_pre_arrive_time_wording");
                }
                orders.f209555V = jSONObject.optInt("is_use_new_paid_succ_page", 0);
                orders.f209557W = jSONObject.optString("pay_succ_btn_wording");
                orders.f209560Y = jSONObject.optInt("is_jsapi_close_page");
                orders.f209572p0 = jSONObject.optString("jsapi_tinyapp_username");
                orders.f209581x0 = jSONObject.optString("jsapi_tinyapp_path");
                m84566h(orders, jSONObject);
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.Orders", e, "", new Object[0]);
            }
        }
        return orders;
    }

    /* renamed from: h */
    public static void m84566h(Orders orders, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                int optInt = jSONObject.optInt("is_use_show_info", 0);
                orders.f209559X = optInt;
                Log.m105925i("MicroMsg.Orders", "is_use_show_info: %s", Integer.valueOf(optInt));
                JSONArray optJSONArray = jSONObject.optJSONArray("show_info");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    Log.m105925i("MicroMsg.Orders", "showInfo size: %s", Integer.valueOf(optJSONArray.length()));
                    orders.f209561Z = new ArrayList<>();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            ShowInfo showInfo = new ShowInfo();
                            showInfo.f209698d = optJSONObject.optString("name");
                            showInfo.f209699e = optJSONObject.optString("value");
                            showInfo.f209700f = optJSONObject.optString("name_color");
                            showInfo.f209701g = optJSONObject.optString("value_color");
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("value_attr");
                            if (optJSONObject2 != null) {
                                showInfo.f209702h = optJSONObject2.optInt("link_type");
                                showInfo.f209703i = optJSONObject2.optString("link_weapp");
                                showInfo.f209704j = optJSONObject2.optString("link_addr");
                                showInfo.f209705n = optJSONObject2.optString("link_url");
                                showInfo.f209706o = optJSONObject2.optInt("text_attr");
                            }
                            if (!Util.isNullOrNil(showInfo.f209698d) || !Util.isNullOrNil(showInfo.f209699e)) {
                                orders.f209561Z.add(showInfo);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Orders", e, "parseShowInfo error", new Object[0]);
            }
        }
    }

    /* renamed from: i */
    public static void m84567i(JSONObject jSONObject, Orders orders) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("bindqueryresp");
        if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("simple_cashier_info")) != null) {
            SimpleCashierInfo simpleCashierInfo = new SimpleCashierInfo();
            orders.f209558W0 = simpleCashierInfo;
            simpleCashierInfo.f209707d = optJSONObject.optInt("use_simple_cashier");
            orders.f209558W0.f209708e = optJSONObject.optString("bank_type");
            orders.f209558W0.f209709f = optJSONObject.optString("bind_serial");
        }
    }

    /* renamed from: j */
    public static HashSet<String> m84568j(String str) {
        HashSet<String> hashSet = new HashSet<>();
        if (!Util.isNullOrNil(str)) {
            for (String add : str.split("\\|")) {
                hashSet.add(add);
            }
            if (hashSet.size() > 0) {
                hashSet.retainAll(hashSet);
            } else {
                hashSet.clear();
            }
        }
        return hashSet;
    }

    /* renamed from: m */
    public static void m84569m(JSONObject jSONObject, Orders orders) {
        Class cls = C78101i.class;
        JSONObject optJSONObject = jSONObject.optJSONObject("bindqueryresp");
        if (optJSONObject == null) {
            Log.m105920e("MicroMsg.Orders", "bindqueryresp is null ");
            return;
        }
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("user_info");
        if (optJSONObject2 == null) {
            Log.m105920e("MicroMsg.Orders", "user_info is null ");
            return;
        }
        JSONObject optJSONObject3 = optJSONObject2.optJSONObject("touch_info");
        if (optJSONObject3 == null) {
            Log.m105920e("MicroMsg.Orders", "touch_info is null ");
            return;
        }
        orders.f209538I = ((C78101i) C86709a0.m107533q(cls)).mo108074Qk() || ((C78101i) C86709a0.m107533q(cls)).mo108081n3() ? optJSONObject3.optInt("use_touch_pay", 0) : 0;
        orders.f209541L = optJSONObject3.optString("touch_forbidword");
        String optString = optJSONObject3.optString("touch_challenge");
        boolean z = 1 == optJSONObject3.optInt("need_change_auth_key");
        orders.f209539J = optString;
        orders.f209540K = z;
        C77761h0 h0Var = C77761h0.IML;
        h0Var.f226590d = optString;
        h0Var.f226592f = z;
        Log.m105925i("MicroMsg.Orders", "hy: use_touch_pay is %s, challenge is: %s, is need change: %b", Integer.valueOf(orders.f209538I), optString, Boolean.valueOf(z));
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "reqKey:" + this.f209563e + "\n" + XWalkReaderBasePlugin.PARAM_KEY_TOKEN + this.f209564f + "\n" + "num" + this.f209565g + "\n" + "totalFee" + this.f209566h + "\n";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f209562d);
        parcel.writeString(this.f209563e);
        parcel.writeString(this.f209564f);
        parcel.writeString(this.f209565g);
        parcel.writeDouble(this.f209566h);
        parcel.writeInt(this.f209567i);
        parcel.writeString(this.f209568j);
        parcel.writeDouble(this.f209569n);
        parcel.writeDouble(this.f209570o);
        parcel.writeInt(this.f209571p);
        parcel.writeString(this.f209573q);
        parcel.writeString(this.f209574r);
        parcel.writeInt(this.f209575s);
        parcel.writeString(this.f209576t);
        parcel.writeString(this.f209577u);
        parcel.writeString(this.f209578v);
        parcel.writeString(this.f209579w);
        parcel.writeString(this.f209580x);
        parcel.writeString(this.f209582y);
        parcel.writeString(this.f209584z);
        parcel.writeInt(this.f209530A);
        parcel.writeInt(this.f209531B ? 1 : 0);
        parcel.writeString(this.f209532C);
        parcel.writeString(this.f209533D);
        parcel.writeLong(this.f209534E);
        parcel.writeString(this.f209535F);
        parcel.writeTypedList(this.f209542M);
        parcel.writeString(this.f209536G);
        parcel.writeInt(this.f209538I);
        parcel.writeString(this.f209541L);
        parcel.writeParcelable(this.f209549S, 1);
        parcel.writeInt(this.f209551T);
        parcel.writeInt(this.f209553U);
        parcel.writeInt(this.f209560Y);
        parcel.writeString(this.f209581x0);
        parcel.writeString(this.f209572p0);
        parcel.writeInt(this.f209559X);
        parcel.writeTypedList(this.f209561Z);
        parcel.writeParcelable(this.f209558W0, 1);
        parcel.writeString(this.f209539J);
        parcel.writeInt(this.f209540K ? 1 : 0);
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$DeductInfo */
    public static class DeductInfo implements Parcelable {
        public static final Parcelable.Creator<DeductInfo> CREATOR = new C72180a();

        /* renamed from: d */
        public String f209615d;

        /* renamed from: e */
        public String f209616e;

        /* renamed from: f */
        public int f209617f;

        /* renamed from: g */
        public String f209618g;

        /* renamed from: h */
        public List<DeductShowInfo> f209619h = new ArrayList();

        /* renamed from: i */
        public int f209620i;

        /* renamed from: j */
        public int f209621j;

        /* renamed from: n */
        public String f209622n;

        /* renamed from: o */
        public String f209623o;

        /* renamed from: p */
        public String f209624p;

        /* renamed from: q */
        public String f209625q;

        /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$DeductInfo$a */
        public class C72180a implements Parcelable.Creator<DeductInfo> {
            public Object createFromParcel(Parcel parcel) {
                return new DeductInfo(parcel);
            }

            public Object[] newArray(int i) {
                return new DeductInfo[i];
            }
        }

        public DeductInfo() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f209615d);
            parcel.writeString(this.f209616e);
            parcel.writeInt(this.f209617f);
            parcel.writeString(this.f209618g);
            parcel.writeInt(this.f209620i);
            parcel.writeTypedList(this.f209619h);
            parcel.writeInt(this.f209621j);
            parcel.writeString(this.f209622n);
            parcel.writeString(this.f209623o);
            parcel.writeString(this.f209624p);
            parcel.writeString(this.f209625q);
        }

        public DeductInfo(Parcel parcel) {
            this.f209615d = parcel.readString();
            this.f209616e = parcel.readString();
            this.f209617f = parcel.readInt();
            this.f209618g = parcel.readString();
            this.f209620i = parcel.readInt();
            parcel.readTypedList(this.f209619h, DeductShowInfo.CREATOR);
            this.f209621j = parcel.readInt();
            this.f209622n = parcel.readString();
            this.f209623o = parcel.readString();
            this.f209624p = parcel.readString();
            this.f209625q = parcel.readString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$Commodity */
    public static class Commodity implements Parcelable {
        public static final Parcelable.Creator<Commodity> CREATOR = new C72179a();

        /* renamed from: A */
        public List<DiscountInfo> f209585A;

        /* renamed from: B */
        public String f209586B;

        /* renamed from: C */
        public String f209587C;

        /* renamed from: D */
        public RecommendTinyAppInfo f209588D;

        /* renamed from: E */
        public FinderInfo f209589E;

        /* renamed from: F */
        public LeadTailViewInfo f209590F;

        /* renamed from: G */
        public RemarksInfo f209591G;

        /* renamed from: H */
        public List<Promotions> f209592H;

        /* renamed from: I */
        public boolean f209593I;

        /* renamed from: J */
        public C72191b f209594J;

        /* renamed from: d */
        public String f209595d;

        /* renamed from: e */
        public String f209596e;

        /* renamed from: f */
        public String f209597f;

        /* renamed from: g */
        public String f209598g;

        /* renamed from: h */
        public String f209599h;

        /* renamed from: i */
        public String f209600i;

        /* renamed from: j */
        public double f209601j;

        /* renamed from: n */
        public double f209602n;

        /* renamed from: o */
        public String f209603o;

        /* renamed from: p */
        public String f209604p;

        /* renamed from: q */
        public int f209605q;

        /* renamed from: r */
        public String f209606r;

        /* renamed from: s */
        public String f209607s;

        /* renamed from: t */
        public String f209608t;

        /* renamed from: u */
        public String f209609u;

        /* renamed from: v */
        public String f209610v;

        /* renamed from: w */
        public String f209611w;

        /* renamed from: x */
        public String f209612x;

        /* renamed from: y */
        public String f209613y;

        /* renamed from: z */
        public int f209614z;

        /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$Commodity$a */
        public class C72179a implements Parcelable.Creator<Commodity> {
            public Object createFromParcel(Parcel parcel) {
                return new Commodity(parcel);
            }

            public Object[] newArray(int i) {
                return new Commodity[i];
            }
        }

        public Commodity() {
            this.f209601j = 0.0d;
            this.f209602n = 0.0d;
            this.f209585A = new ArrayList();
            this.f209588D = null;
            this.f209589E = null;
            this.f209590F = null;
            this.f209592H = new ArrayList();
            this.f209593I = false;
            this.f209594J = new C72191b();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f209595d);
            parcel.writeString(this.f209596e);
            parcel.writeString(this.f209597f);
            parcel.writeString(this.f209598g);
            parcel.writeString(this.f209599h);
            parcel.writeString(this.f209600i);
            parcel.writeDouble(this.f209601j);
            parcel.writeString(this.f209603o);
            parcel.writeString(this.f209604p);
            parcel.writeInt(this.f209605q);
            parcel.writeString(this.f209606r);
            parcel.writeString(this.f209607s);
            parcel.writeString(this.f209608t);
            parcel.writeString(this.f209609u);
            parcel.writeString(this.f209611w);
            parcel.writeString(this.f209612x);
            parcel.writeString(this.f209613y);
            parcel.writeTypedList(this.f209585A);
            parcel.writeString(this.f209586B);
            parcel.writeString(this.f209587C);
            parcel.writeParcelable(this.f209588D, 0);
            parcel.writeParcelable(this.f209589E, 0);
            parcel.writeParcelable(this.f209590F, 0);
            parcel.writeTypedList(this.f209592H);
            parcel.writeParcelable(this.f209591G, 0);
            parcel.writeByte(this.f209593I ? (byte) 1 : 0);
        }

        public Commodity(Parcel parcel) {
            this.f209601j = 0.0d;
            this.f209602n = 0.0d;
            this.f209585A = new ArrayList();
            this.f209588D = null;
            this.f209589E = null;
            this.f209590F = null;
            this.f209592H = new ArrayList();
            boolean z = false;
            this.f209593I = false;
            this.f209594J = new C72191b();
            this.f209595d = parcel.readString();
            this.f209596e = parcel.readString();
            this.f209597f = parcel.readString();
            this.f209598g = parcel.readString();
            this.f209599h = parcel.readString();
            this.f209600i = parcel.readString();
            this.f209601j = parcel.readDouble();
            this.f209603o = parcel.readString();
            this.f209604p = parcel.readString();
            this.f209605q = parcel.readInt();
            this.f209606r = parcel.readString();
            this.f209607s = parcel.readString();
            this.f209608t = parcel.readString();
            this.f209609u = parcel.readString();
            this.f209611w = parcel.readString();
            this.f209612x = parcel.readString();
            this.f209613y = parcel.readString();
            parcel.readTypedList(this.f209585A, DiscountInfo.CREATOR);
            this.f209586B = parcel.readString();
            this.f209587C = parcel.readString();
            this.f209588D = (RecommendTinyAppInfo) parcel.readParcelable(RecommendTinyAppInfo.class.getClassLoader());
            this.f209589E = (FinderInfo) parcel.readParcelable(FinderInfo.class.getClassLoader());
            this.f209590F = (LeadTailViewInfo) parcel.readParcelable(LeadTailViewInfo.class.getClassLoader());
            parcel.readTypedList(this.f209592H, Promotions.CREATOR);
            this.f209591G = (RemarksInfo) parcel.readParcelable(RemarksInfo.class.getClassLoader());
            this.f209593I = parcel.readByte() != 0 ? true : z;
        }
    }

    public Orders(Parcel parcel) {
        this.f209563e = "";
        this.f209564f = "";
        this.f209565g = "0";
        this.f209566h = 0.0d;
        this.f209570o = 0.0d;
        boolean z = false;
        this.f209531B = false;
        this.f209532C = "";
        this.f209533D = "";
        this.f209534E = 0;
        this.f209535F = "";
        this.f209537H = new HashSet();
        this.f209538I = 0;
        this.f209541L = "";
        this.f209542M = new ArrayList();
        this.f209543N = new C79033l();
        this.f209544P = 0;
        this.f209545Q = "";
        this.f209547R = "";
        this.f209551T = 0;
        this.f209553U = 0;
        this.f209555V = 0;
        this.f209557W = "";
        this.f209559X = 0;
        this.f209560Y = 0;
        this.f209561Z = new ArrayList<>();
        this.f209572p0 = "";
        this.f209581x0 = "";
        this.field_infos = new ArrayList<>();
        this.f209583y0 = "";
        this.f209550S0 = "";
        this.f209562d = parcel.readLong();
        this.f209563e = parcel.readString();
        this.f209564f = parcel.readString();
        this.f209565g = parcel.readString();
        this.f209566h = parcel.readDouble();
        this.f209567i = parcel.readInt();
        this.f209568j = parcel.readString();
        this.f209569n = parcel.readDouble();
        this.f209570o = parcel.readDouble();
        this.f209571p = parcel.readInt();
        this.f209573q = parcel.readString();
        this.f209574r = parcel.readString();
        this.f209575s = parcel.readInt();
        this.f209576t = parcel.readString();
        this.f209577u = parcel.readString();
        this.f209578v = parcel.readString();
        this.f209579w = parcel.readString();
        this.f209580x = parcel.readString();
        this.f209582y = parcel.readString();
        this.f209584z = parcel.readString();
        this.f209530A = parcel.readInt();
        this.f209531B = parcel.readInt() == 1;
        this.f209532C = parcel.readString();
        this.f209533D = parcel.readString();
        this.f209534E = parcel.readLong();
        this.f209535F = parcel.readString();
        parcel.readTypedList(this.f209542M, Commodity.CREATOR);
        String readString = parcel.readString();
        this.f209536G = readString;
        this.f209537H = m84568j(readString);
        this.f209538I = parcel.readInt();
        this.f209541L = parcel.readString();
        this.f209549S = (DeductInfo) parcel.readParcelable(DeductInfo.class.getClassLoader());
        this.f209551T = parcel.readInt();
        this.f209553U = parcel.readInt();
        this.f209560Y = parcel.readInt();
        this.f209581x0 = parcel.readString();
        this.f209572p0 = parcel.readString();
        this.f209559X = parcel.readInt();
        parcel.readTypedList(this.f209561Z, ShowInfo.CREATOR);
        this.f209558W0 = (SimpleCashierInfo) parcel.readParcelable(SimpleCashierInfo.class.getClassLoader());
        this.f209539J = parcel.readString();
        this.f209540K = parcel.readInt() == 1 ? true : z;
    }
}
