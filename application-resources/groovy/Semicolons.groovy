


matcher = content =~ ';;;+'
while(matcher.find()) {
  FeatureMap fm = Factory.newFeatureMap();
  fm.put("rule", "Semicolons");
  outputAS.add(matcher.start(), 
               matcher.end(),
               "SemicolonBlock", fm);
}


matcher1 = content =~ ';+'
while(matcher1.find()) {
  FeatureMap fm = Factory.newFeatureMap();
  fm.put("rule", "Semicolons");
  outputAS.add(matcher1.start(), 
               matcher1.end(),
               "AnySemicolons", fm);
}

