package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastParser;
import java.io.BufferedReader;

final class zze implements FastParser.zza<Boolean> {
    public final /* synthetic */ Object zzh(FastParser fastParser, BufferedReader bufferedReader) {
        return Boolean.valueOf(fastParser.zza(bufferedReader, false));
    }
}
