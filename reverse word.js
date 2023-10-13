function reverseWordsInSentence(sentence) {
    // Split the sentence into words
    const words = sentence.split(' ');
  
    // Reverse each word and join them back into a sentence
    const reversedWords = words.map(word => reverseWord(word));
  
    return reversedWords.join(' ');
  }
  
  function reverseWord(word) {
    return word.split('').reverse().join('');
  }
  
  const inputSentence = "This is a sunny day";
  const reversedSentence = reverseWordsInSentence(inputSentence);
  console.log(reversedSentence);
  