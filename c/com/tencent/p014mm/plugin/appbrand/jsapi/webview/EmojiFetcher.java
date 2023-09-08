package com.tencent.p014mm.plugin.appbrand.jsapi.webview;

import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53916l;
import a14.C53921m;
import a14.C53934p0;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80905h;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Result;
import o90.C100308d;
import s24.C90125c;
import wx3.C15601d;
import x20.C15618a;
import xx3.C66447b;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webview.EmojiFetcher */
public final class EmojiFetcher {

    /* renamed from: a */
    public static final EmojiFetcher f80450a = new EmojiFetcher();

    /* renamed from: b */
    public static final C100308d<String, byte[]> f80451b = new C100308d<>(10);

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/webview/EmojiFetcher$EmojiArgs;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webview.EmojiFetcher$EmojiArgs */
    public static final class EmojiArgs implements Parcelable {
        public static final Parcelable.Creator<EmojiArgs> CREATOR = new C29546a();

        /* renamed from: d */
        public final String f80452d;

        /* renamed from: e */
        public final String f80453e;

        /* renamed from: f */
        public final String f80454f;

        /* renamed from: g */
        public final String f80455g;

        /* renamed from: h */
        public final String f80456h;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webview.EmojiFetcher$EmojiArgs$a */
        public static final class C29546a implements Parcelable.Creator<EmojiArgs> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new EmojiArgs(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            public Object[] newArray(int i) {
                return new EmojiArgs[i];
            }
        }

        public EmojiArgs(String str, String str2, String str3, String str4, String str5) {
            C87412m.m108594g(str, "md5");
            this.f80452d = str;
            this.f80453e = str2;
            this.f80454f = str3;
            this.f80455g = str4;
            this.f80456h = str5;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EmojiArgs)) {
                return false;
            }
            EmojiArgs emojiArgs = (EmojiArgs) obj;
            return C87412m.m108589b(this.f80452d, emojiArgs.f80452d) && C87412m.m108589b(this.f80453e, emojiArgs.f80453e) && C87412m.m108589b(this.f80454f, emojiArgs.f80454f) && C87412m.m108589b(this.f80455g, emojiArgs.f80455g) && C87412m.m108589b(this.f80456h, emojiArgs.f80456h);
        }

        public int hashCode() {
            int hashCode = this.f80452d.hashCode() * 31;
            String str = this.f80453e;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f80454f;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f80455g;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f80456h;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return hashCode4 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EmojiArgs(md5='");
            sb.append(this.f80452d);
            sb.append("', encryptUrl=");
            String str = this.f80453e;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            sb.append(str);
            sb.append(", aesKey=");
            String str3 = this.f80454f;
            if (str3 == null) {
                str3 = str2;
            }
            sb.append(str3);
            sb.append(", productId=");
            String str4 = this.f80455g;
            if (str4 == null) {
                str4 = str2;
            }
            sb.append(str4);
            sb.append(", designerId=");
            String str5 = this.f80456h;
            if (str5 != null) {
                str2 = str5;
            }
            sb.append(str2);
            sb.append(')');
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeString(this.f80452d);
            parcel.writeString(this.f80453e);
            parcel.writeString(this.f80454f);
            parcel.writeString(this.f80455g);
            parcel.writeString(this.f80456h);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/webview/EmojiFetcher$EmojiArgs;", "kotlin.jvm.PlatformType", "args", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "callback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/jsapi/webview/EmojiFetcher$EmojiArgs;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webview.EmojiFetcher$a */
    public static final class C29547a<InputType, ResultType> implements C80883e {

        /* renamed from: d */
        public static final C29547a<InputType, ResultType> f80457d = new C29547a<>();

        public void invoke(Object obj, C1256g gVar) {
            C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C29550e((EmojiArgs) obj, gVar, (C15601d<? super C29550e>) null), 2, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webview.EmojiFetcher$b */
    public static final class C29548b implements C80905h<IPCString> {

        /* renamed from: d */
        public final /* synthetic */ EmojiArgs f80458d;

        /* renamed from: e */
        public final /* synthetic */ C53916l<byte[]> f80459e;

        /* renamed from: f */
        public final /* synthetic */ String f80460f;

        public C29548b(EmojiArgs emojiArgs, C53916l<? super byte[]> lVar, String str) {
            this.f80458d = emojiArgs;
            this.f80459e = lVar;
            this.f80460f = str;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            IPCString iPCString = (IPCString) obj;
            byte[] bArr = null;
            String str = iPCString != null ? iPCString.f10315d : null;
            Log.m105924i("MicroMsg.AppBrandHTMLWebView.EmojiFetcher", "fetch with args:" + this.f80458d + ", onCallback(" + str + ')');
            if (str == null || str.length() == 0) {
                this.f80459e.resumeWith(Result.m168114constructorimpl((Object) null));
                return;
            }
            C53916l<byte[]> lVar = this.f80459e;
            try {
                byte[] c = C90125c.m112776c(C86013q1.m106423E(str));
                EmojiFetcher.f80451b.put(this.f80460f, c);
                C86013q1.m106447h(str);
                bArr = c;
            } catch (IOException e) {
                Log.m105920e("MicroMsg.AppBrandHTMLWebView.EmojiFetcher", "fetch with args:" + this.f80458d + ", decode gif bytes with exception:" + e);
                C86013q1.m106447h(str);
            } catch (Throwable th) {
                C86013q1.m106447h(str);
                throw th;
            }
            lVar.resumeWith(Result.m168114constructorimpl(bArr));
        }

        /* renamed from: b */
        public void mo56805b() {
            Log.m105920e("MicroMsg.AppBrandHTMLWebView.EmojiFetcher", "fetch with args:" + this.f80458d + ", onBridgeNotFound()");
            this.f80459e.resumeWith(Result.m168114constructorimpl((Object) null));
        }

        /* renamed from: c */
        public void mo56806c(Exception exc) {
            Log.m105920e("MicroMsg.AppBrandHTMLWebView.EmojiFetcher", "fetch with args:" + this.f80458d + ", onCaughtInvokeException(" + exc + ')');
            this.f80459e.resumeWith(Result.m168114constructorimpl((Object) null));
        }
    }

    /* renamed from: a */
    public final Object mo56797a(String str, String str2, String str3, String str4, String str5, C15601d<? super byte[]> dVar) {
        byte[] bArr = f80451b.get(str);
        if (bArr != null) {
            return bArr;
        }
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        EmojiArgs emojiArgs = new EmojiArgs(str, str2, str3, str4, str5);
        C15618a.m14626b(emojiArgs, C29547a.f80457d, new C29548b(emojiArgs, mVar, str));
        return mVar.mo74608o();
    }
}
