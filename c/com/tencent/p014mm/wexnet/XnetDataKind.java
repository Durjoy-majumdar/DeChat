package com.tencent.p014mm.wexnet;

import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u001c\u0010\u000f\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/wexnet/XnetDataKind;", "", "()V", "StorageDataKindFloat32", "", "getStorageDataKindFloat32", "()I", "StorageDataKindInt32", "getStorageDataKindInt32", "StorageDataKindInt64", "getStorageDataKindInt64", "StorageDataKindInt8", "getStorageDataKindInt8", "StorageDataKindUInt32", "getStorageDataKindUInt32", "StorageDataKindUInt8", "getStorageDataKindUInt8$annotations", "getStorageDataKindUInt8", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.wexnet.XnetDataKind */
public final class XnetDataKind {
    public static final XnetDataKind INSTANCE = new XnetDataKind();
    private static final int StorageDataKindFloat32 = 11;
    private static final int StorageDataKindInt32 = 8;
    private static final int StorageDataKindInt64 = 9;
    private static final int StorageDataKindInt8 = 6;
    private static final int StorageDataKindUInt32 = 4;
    private static final int StorageDataKindUInt8 = 2;

    private XnetDataKind() {
    }

    public static final int getStorageDataKindUInt8() {
        return StorageDataKindUInt8;
    }

    public static /* synthetic */ void getStorageDataKindUInt8$annotations() {
    }

    public final int getStorageDataKindFloat32() {
        return StorageDataKindFloat32;
    }

    public final int getStorageDataKindInt32() {
        return StorageDataKindInt32;
    }

    public final int getStorageDataKindInt64() {
        return StorageDataKindInt64;
    }

    public final int getStorageDataKindInt8() {
        return StorageDataKindInt8;
    }

    public final int getStorageDataKindUInt32() {
        return StorageDataKindUInt32;
    }
}
