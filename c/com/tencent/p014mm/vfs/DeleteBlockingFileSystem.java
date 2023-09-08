package com.tencent.p014mm.vfs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.FileSystem;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/mm/vfs/DeleteBlockingFileSystem;", "Lcom/tencent/mm/vfs/AbstractFileSystem;", "b", "mmkernel_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.vfs.DeleteBlockingFileSystem */
final class DeleteBlockingFileSystem extends AbstractFileSystem {
    public static final Parcelable.Creator<DeleteBlockingFileSystem> CREATOR = new C116208a();

    /* renamed from: e */
    public final FileSystem f348745e;

    /* renamed from: com.tencent.mm.vfs.DeleteBlockingFileSystem$a */
    public static final class C116208a implements Parcelable.Creator<DeleteBlockingFileSystem> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
            return new DeleteBlockingFileSystem(parcel, (C8480h) null);
        }

        public Object[] newArray(int i) {
            return new DeleteBlockingFileSystem[i];
        }
    }

    /* renamed from: com.tencent.mm.vfs.DeleteBlockingFileSystem$b */
    public final class C116209b extends C116301h2 {

        /* renamed from: f */
        public final FileSystem.C85995c f348746f;

        /* renamed from: g */
        public final /* synthetic */ DeleteBlockingFileSystem f348747g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C116209b(DeleteBlockingFileSystem deleteBlockingFileSystem, FileSystem.C85995c cVar) {
            super(cVar);
            C87412m.m108594g(cVar, "fs");
            this.f348747g = deleteBlockingFileSystem;
            this.f348746f = cVar;
        }

        /* renamed from: D */
        public boolean mo177583D(String str, FileSystem.C85995c cVar, String str2) {
            C87412m.m108594g(str, "fromPath");
            C87412m.m108594g(cVar, "toFS");
            C87412m.m108594g(str2, "toPath");
            String lowerCase = str.toLowerCase(Locale.ROOT);
            C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (C112551y.m153819s(lowerCase, "android/data/com.tencent.mm/", false)) {
                return super.mo177583D(str, cVar, str2);
            }
            AssertionError assertionError = new AssertionError("File move rejected: " + str + " [" + this.f348746f + "] -> " + str2 + " [" + cVar + ']');
            if (WeChatEnvironment.hasDebugger() || BuildInfo.DEBUG) {
                throw assertionError;
            }
            Log.printErrStackTrace("VFS.SystemDirectoryBlocker", assertionError, "File move rejected", new Object[0]);
            return false;
        }

        /* renamed from: c */
        public boolean mo119933c(String str) {
            C87412m.m108594g(str, "path");
            String lowerCase = str.toLowerCase(Locale.ROOT);
            C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (C112551y.m153819s(lowerCase, "android/data/com.tencent.mm/", false)) {
                return super.mo119933c(str);
            }
            AssertionError assertionError = new AssertionError("File delete rejected: " + str + " [" + this.f348746f + ']');
            if (WeChatEnvironment.hasDebugger() || BuildInfo.DEBUG) {
                throw assertionError;
            }
            Log.printErrStackTrace("VFS.SystemDirectoryBlocker", assertionError, "File delete rejected", new Object[0]);
            return false;
        }

        /* renamed from: u */
        public FileSystem mo119930u() {
            return this.f348747g;
        }
    }

    public DeleteBlockingFileSystem(FileSystem fileSystem) {
        C87412m.m108594g(fileSystem, "fs");
        this.f348745e = fileSystem;
    }

    /* renamed from: v */
    public Object mo177578v(Map map) {
        C87412m.m108594g(map, "env");
        Object v = this.f348745e.mo177578v(map);
        C87412m.m108593f(v, "fileSystem.configure(env)");
        return new C116209b(this, (FileSystem.C85995c) v);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "dest");
        C116299g2.m163866v(parcel, DeleteBlockingFileSystem.class, 1);
        parcel.writeParcelable(this.f348745e, i);
    }

    public DeleteBlockingFileSystem(Parcel parcel, C8480h hVar) {
        C116299g2.m163845a(parcel, DeleteBlockingFileSystem.class, 1);
        Parcelable readParcelable = parcel.readParcelable(DeleteBlockingFileSystem.class.getClassLoader());
        C87412m.m108591d(readParcelable);
        this.f348745e = (FileSystem) readParcelable;
    }
}
