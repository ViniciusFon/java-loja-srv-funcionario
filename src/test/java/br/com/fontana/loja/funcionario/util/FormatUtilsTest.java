package br.com.fontana.loja.funcionario.util;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class FormatUtilsTest {

  @Test
  public void testNullDateFormat() {
    Assert.assertEquals("-", FormatUtils.parseDate(null));
  }

  @Test
  public void testValidDateFormat() {
    Assert.assertEquals(String.class,
        FormatUtils.parseDate(new Date(System.currentTimeMillis())).getClass());
  }

  @Test
  public void testNullDateTimeFormat() {
    Assert.assertEquals("-", FormatUtils.parseDateTime(null));
  }

  @Test
  public void testValidDateTimeFormat() {
    Assert.assertEquals(String.class,
        FormatUtils.parseDateTime(new Date(System.currentTimeMillis())).getClass());
  }

  @Test
  public void testFormatStringObject() {
    Assert.assertNotNull(FormatUtils.parseString(new Object()));
  }

  @Test
  public void testFormatString() {
    Assert.assertNotNull(FormatUtils.parseString(""));
  }

  @Test
  public void testNullString() {
    Assert.assertEquals("-", FormatUtils.parseString(null));
  }

  @Test
  public void testValidString() {
    String text = "text";
    Assert.assertEquals(text, FormatUtils.parseString(text));
  }

  @Test
  public void testNullDouble() {
    Assert.assertEquals("-", FormatUtils.parseDouble(null));
  }

  @Test
  public void testInfiniteDouble() {
    Assert.assertEquals("-", FormatUtils.parseDouble(Double.NEGATIVE_INFINITY));
    Assert.assertEquals("-", FormatUtils.parseDouble(Double.POSITIVE_INFINITY));
  }

  @Test
  public void testNANDouble() {
    Assert.assertEquals("-", FormatUtils.parseDouble(Double.NaN));
  }

  @Test
  public void testNullFloat() {
    Assert.assertEquals("-", FormatUtils.parseFloat(null));
  }

  @Test
  public void testNANFloat() {
    Assert.assertEquals("-", FormatUtils.parseFloat(Float.NaN));
  }

  @Test
  public void testInfiniteFloat() {
    Assert.assertEquals("-", FormatUtils.parseFloat(Float.POSITIVE_INFINITY));
    Assert.assertEquals("-", FormatUtils.parseFloat(Float.NEGATIVE_INFINITY));
  }

}
