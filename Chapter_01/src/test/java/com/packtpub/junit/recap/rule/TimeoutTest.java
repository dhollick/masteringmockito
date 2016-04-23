package com.packtpub.junit.recap.rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeUnit;

public class TimeoutTest {
	  
	  @Rule
	  public Timeout globalTimeout =  new Timeout(20, TimeUnit.SECONDS);
	  
	  @Test
	  public void testInfiniteLoop1() throws InterruptedException {
	    Thread.sleep(30);
	  }
	  
	  @Test
	  public void testInfiniteLoop2() throws InterruptedException {
	    Thread.sleep(30);
	  }
	  
	  
}
