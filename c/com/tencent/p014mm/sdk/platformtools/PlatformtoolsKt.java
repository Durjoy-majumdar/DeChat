package com.tencent.p014mm.sdk.platformtools;

import android.content.Intent;
import android.os.Bundle;
import gy3.C87412m;
import kotlin.Metadata;
import pe3.C47465a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a*\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a*\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\b¢\u0006\u0004\b\u0005\u0010\b\u001a*\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\b¢\u0006\u0004\b\u0005\u0010\n\"\u0014\u0010\u000b\u001a\u00020\u00038\u0000XT¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, mo182094d2 = {"Lpe3/a;", "T", "Lcom/tencent/mm/sdk/platformtools/MultiProcessMMKV;", "", "key", "decodeProtoBuffer", "(Lcom/tencent/mm/sdk/platformtools/MultiProcessMMKV;Ljava/lang/String;)Lpe3/a;", "Landroid/content/Intent;", "(Landroid/content/Intent;Ljava/lang/String;)Lpe3/a;", "Landroid/os/Bundle;", "(Landroid/os/Bundle;Ljava/lang/String;)Lpe3/a;", "TAG", "Ljava/lang/String;", "libcompatible_release"}, mo182095k = 2, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.platformtools.PlatformtoolsKt */
public final class PlatformtoolsKt {
    public static final String TAG = "MicroMsg.Platformtools";

    public static final <T extends C47465a> T decodeProtoBuffer(MultiProcessMMKV multiProcessMMKV, String str) {
        byte[] decodeBytes;
        C87412m.m108594g(multiProcessMMKV, "<this>");
        C87412m.m108594g(str, "key");
        if (multiProcessMMKV.containsKey(str) && (decodeBytes = multiProcessMMKV.decodeBytes(str)) != null) {
            if (!(decodeBytes.length == 0)) {
                try {
                    C87412m.m108602o();
                    throw null;
                } catch (Exception e) {
                    Log.printErrStackTrace("MultiProcessMMKV.decodeProtoBuffer", e, "decode ProtoBuffer", new Object[0]);
                }
            }
        }
        return null;
    }

    public static final <T extends C47465a> T decodeProtoBuffer(Intent intent, String str) {
        C87412m.m108594g(intent, "<this>");
        C87412m.m108594g(str, "key");
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra != null) {
            if (!(byteArrayExtra.length == 0)) {
                try {
                    C87412m.m108602o();
                    throw null;
                } catch (Exception e) {
                    Log.printErrStackTrace("Intent.decodeProtoBuffer", e, "decode ProtoBuffer", new Object[0]);
                }
            }
        }
        return null;
    }

    public static final <T extends C47465a> T decodeProtoBuffer(Bundle bundle, String str) {
        C87412m.m108594g(bundle, "<this>");
        C87412m.m108594g(str, "key");
        byte[] byteArray = bundle.getByteArray(str);
        if (byteArray != null) {
            if (!(byteArray.length == 0)) {
                try {
                    C87412m.m108602o();
                    throw null;
                } catch (Exception e) {
                    Log.printErrStackTrace("Intent.decodeProtoBuffer", e, "decode ProtoBuffer", new Object[0]);
                }
            }
        }
        return null;
    }
}
