package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastParser;
import java.io.BufferedReader;

final class zzb implements FastParser.zza<Long> {
    public final /* synthetic */ Object zzh(FastParser fastParser, BufferedReader bufferedReader) {
        return Long.valueOf(fastParser.zze(bufferedReader));
    }
}
