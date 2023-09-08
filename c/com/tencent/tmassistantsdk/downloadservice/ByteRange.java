package com.tencent.tmassistantsdk.downloadservice;

import android.content.res.Resources;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ByteRange {
    public static final String BYTES_UNIT = "bytes";
    public static final Pattern CONTENT_RANGE_HEADER_PATTERN = Pattern.compile("^\\s*bytes\\s+(\\d+)-(\\d+)/(\\d+)\\s*$");
    public static final String INVALID_RANGE_HEADER_REGEX = "((?:\\s*,\\s*(?:\\d*)-(?:\\d*))*)";
    public static final Pattern RANGE_HEADER_PATTERN = Pattern.compile("^\\s*([^=\\s]+)\\s*=\\s*(\\d*)\\s*-\\s*(\\d*)((?:\\s*,\\s*(?:\\d*)-(?:\\d*))*)\\s*$");
    public static final String UNIT_REGEX = "([^=\\s]+)";
    public static final String VALID_CONTENT_RANGE_HEADER_REGEX = "bytes\\s+(\\d+)-(\\d+)/(\\d+)";
    public static final String VALID_RANGE_HEADER_REGEX = "([^=\\s]+)\\s*=\\s*(\\d*)\\s*-\\s*(\\d*)";
    public final Long end;
    public final long start;

    public ByteRange(long j) {
        this(j, (Long) null);
    }

    public static long getTotalSize(String str) {
        int indexOf = str.indexOf("/");
        if (indexOf != -1) {
            return Util.safeParseLong(str.substring(indexOf + 1));
        }
        throw new Resources.NotFoundException();
    }

    public static ByteRange parseContentRange(String str) {
        Matcher matcher = CONTENT_RANGE_HEADER_PATTERN.matcher(str);
        if (matcher.matches()) {
            return new ByteRange(Util.safeParseLong(matcher.group(1)), Util.safeParseLong(matcher.group(2)));
        }
        throw new Throwable("Invalid content-range format: " + str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ByteRange)) {
            return false;
        }
        ByteRange byteRange = (ByteRange) obj;
        if (this.start != byteRange.getStart() || hasEnd() != byteRange.hasEnd()) {
            return false;
        }
        if (hasEnd()) {
            return this.end.equals(Long.valueOf(byteRange.getEnd()));
        }
        return true;
    }

    public long getEnd() {
        if (hasEnd()) {
            return this.end.longValue();
        }
        throw new IllegalStateException("Byte-range does not have end.  Check hasEnd() before use");
    }

    public long getStart() {
        return this.start;
    }

    public boolean hasEnd() {
        return this.end != null;
    }

    public int hashCode() {
        int hashCode = 629 + Long.valueOf(this.start).hashCode();
        Long l = this.end;
        return l != null ? (hashCode * 37) + l.hashCode() : hashCode;
    }

    public String toString() {
        if (this.end != null) {
            return "bytes=" + this.start + "-" + this.end;
        } else if (this.start < 0) {
            return "bytes=" + this.start;
        } else {
            return "bytes=" + this.start + "-";
        }
    }

    public ByteRange(long j, long j2) {
        this(j, Long.valueOf(j2));
        if (j < 0) {
            throw new IllegalArgumentException("If end is provided, start must be positive.");
        } else if (j2 < j) {
            throw new IllegalArgumentException("end must be >= start.");
        }
    }

    public ByteRange(long j, Long l) {
        this.start = j;
        this.end = l;
    }
}
